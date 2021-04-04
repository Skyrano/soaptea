package inventaire;

import javax.swing.*;
import javax.xml.ws.Response;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public class InventaireProcess extends JFrame {

    final private JButton envoyeListe;
    final private JButton fermeture;

    private JTextArea liste;


    public InventaireProcess() {
        super("TeaServiceAsynchronous Client");

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(500, 300));

        Inventaire_Service inventaireService = new Inventaire_Service();
        Inventaire inventairePort = inventaireService.getInventairePort();

        String textInit = "Veuillez refaire la liste des thés :\n";

        JTextArea info = new JTextArea();
        info.setText(textInit);
        info.setEditable(false);
        this.getContentPane().add(BorderLayout.NORTH, info);

        liste = new JTextArea();
        liste.setEditable(true);
        this.getContentPane().add(liste);

        JPanel buttonPanel = new JPanel();

        envoyeListe = new JButton("Envoyer");
        envoyeListe.setPreferredSize(new Dimension(75, 30));

        fermeture = new JButton("Quitter");
        fermeture.setPreferredSize(new Dimension(75, 30));
        fermeture.setVisible(false);

        buttonPanel.add(envoyeListe);
        buttonPanel.add(fermeture);

        final JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        buttonPanel.add(BorderLayout.SOUTH, textArea);

        this.getContentPane().add(BorderLayout.SOUTH, buttonPanel);

        envoyeListe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stringThe = liste.getText();
                String[] tableauThe = liste.getText().split("\n");
                ArrayList<String> listeThe = new ArrayList<>(Arrays.asList(tableauThe));
                for(int i =listeThe.size()-1; i >= 0; i--){
                    if(listeThe.get(i).equals("")){
                        listeThe.remove(i);
                    }
                }
                Response res = inventairePort.majCarteAsync(listeThe);
                textArea.setText("Envoie des informations au gestionnaire ...\n");
                MajCarteResponse reponse = null;
                try {
                    reponse = (MajCarteResponse)res.get();
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                } catch (ExecutionException executionException) {
                    executionException.printStackTrace();
                }
                if  (!res.isCancelled() && res.isDone()) {
                    if(reponse.isReturn()){
                        textArea.setText("Information traitée !\n");
                    } else{
                        textArea.setText("Information n'a pas pu être traité !\n");
                    }

                    envoyeListe.setVisible(false);
                    fermeture.setVisible(true);

                } else {
                    textArea.setText("Un problème est survenu lors de l'envoie !\n");
                    envoyeListe.setEnabled(true);
                }

            }
        });

        fermeture.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                close();
            }
        });

        this.pack();
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void close(){
        super.dispose();
    }
}
