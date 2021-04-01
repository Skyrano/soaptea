package preparation;

import javax.swing.*;
import javax.xml.ws.Response;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutionException;

public class TeaProcess extends JFrame {

    public TeaProcess() {
        super("TeaServiceAsynchronous Client");

        ServiceGestionnaire_Service gestionnaireService = new ServiceGestionnaire_Service();
        ServiceGestionnaire gestionnairePort = gestionnaireService.getGestionnairePort();

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(500, 300));

        JTextArea info = new JTextArea();
        info.setText("La commande du client a été prise en compte ?");
        info.setEditable(false);
        this.getContentPane().add(BorderLayout.NORTH, info);


        JPanel buttonPanel = new JPanel();

        final JButton startButton = new JButton("OK");
        startButton.setPreferredSize(new Dimension(75, 30));
        buttonPanel.add(startButton);
        this.getContentPane().add(buttonPanel);

        final JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        this.getContentPane().add(BorderLayout.SOUTH, textArea);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                info.setText("Le thé à été déposé sur la zone du client ?");

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

                // TODO: initialiser un service et un port.

                // TODO: invoquer de manière asynchrone l'opération `addPerson` à partir du port précédent

                if  (!res.isCancelled() && res.isDone()) {
                    if(reponse.isReturn()){
                        textArea.setText("Information traitée !\n");
                    } else{
                        textArea.setText("Information n'a pas pu être traité !\n");
                    }
                } else {
                    textArea.setText("Un problème est survenu lors de l'envoie !\n");
                }



            }
        });

        this.pack();
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
