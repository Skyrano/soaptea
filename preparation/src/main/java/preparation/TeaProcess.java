package preparation;

import javax.swing.*;
import javax.xml.ws.Response;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import javax.swing.Timer;

public class TeaProcess extends JFrame {

    private final int id;
    private final int idUtilisateur;
    private HashMap<String, Integer> listeThe;
    private String etat;

    private String afficheCommande;

    final private JButton prepaCommence;
    final private JButton theLivre;

    private JTextArea info;
    private int decompte = 4;

    public TeaProcess(int id, int idUtilisateur, HashMap<String, Integer> listeThe, String etat) {
        super("TeaServiceAsynchronous Client");

        this.id = id;
        this.idUtilisateur = idUtilisateur;
        this.listeThe = listeThe;
        this.etat = etat;



        ServiceGestionnaire_Service gestionnaireService = new ServiceGestionnaire_Service();
        ServiceGestionnaire gestionnairePort = gestionnaireService.getGestionnairePort();

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(500, 300));

        info = new JTextArea();
        afficheCommande = "Voici la commande du client :\n";
        for(String key : listeThe.keySet()){
            afficheCommande +=  "        > - "+key+" x"+listeThe.get(key)+" sachets\n";
        }

        info.setText(afficheCommande);

        String textInit = "\nVeuillez appuyer sur le bouton OK lorsque la préparation de la commande commence";

        info.append(textInit);

        info.setEditable(false);
        this.getContentPane().add(BorderLayout.NORTH, info);

        final JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        this.getContentPane().add(BorderLayout.SOUTH, textArea);

        JPanel buttonPanel = new JPanel();

        prepaCommence = new JButton("OK");
        prepaCommence.setPreferredSize(new Dimension(75, 30));

        theLivre = new JButton("OK");
        theLivre.setPreferredSize(new Dimension(75, 30));
        theLivre.setVisible(false);

        buttonPanel.add(prepaCommence);
        buttonPanel.add(theLivre);
        this.getContentPane().add(buttonPanel);


        prepaCommence.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                prepaCommence.setEnabled(false);

                Response res = gestionnairePort.theEnPreparationAsync(6);
                textArea.setText("Envoie des informations au gestionnaire ...\n");
                TheEnPreparationResponse reponse = null;
                try {
                    reponse = (TheEnPreparationResponse)res.get();
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
                    info.setText(afficheCommande);
                    info.append("\nVeuillez appuyer sur le bouton OK lorsque la préparation de la commande est terminée et que la commande est en zone de livraison");

                    prepaCommence.setVisible(false);
                    theLivre.setVisible(true);

                } else {
                    textArea.setText("Un problème est survenu lors de l'envoie !\n");
                    prepaCommence.setEnabled(true);
                }

            }
        });

        theLivre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                theLivre.setEnabled(false);

                Response res = gestionnairePort.theEnPreparationAsync(6);
                textArea.setText("Envoie des informations au gestionnaire ...\n");
                TheEnPreparationResponse reponse = null;
                try {
                    reponse = (TheEnPreparationResponse)res.get();
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
                    info.setText("Votre travail de préparation est terminé, la fenètre va se fermer dans :\n        > - 5\n");
                    waitForClose();


                }else {
                    textArea.setText("Un problème est survenu lors de l'envoie !\n");
                    theLivre.setEnabled(true);
                }

            }
        });

        this.pack();
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void waitForClose(){
        Timer delay = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info.append("        > - "+decompte+"\n");
                decompte--;
                waitForClose();
            }
        });
        delay.setRepeats(false);
        while(decompte>0){
            System.out.println(decompte);
            decompte--;


            delay.start();
        }
        super.dispose();
    }
}
