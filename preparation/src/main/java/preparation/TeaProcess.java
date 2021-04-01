package preparation;

import javax.swing.*;
import javax.xml.ws.Response;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeaProcess extends JFrame {

    public TeaProcess() {
        super("TeaServiceAsynchronous Client");

        NotebookService_Service notebookService = new NotebookService_Service();
        NotebookService notebookPort = notebookService.getNotebookPort();

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

                Response res = notebookPort.addPersonAsync(newPerson);

                textArea.setText("Envoie des informations au gestionnaire ...\n");

                // TODO: initialiser un service et un port.

                // TODO: invoquer de manière asynchrone l'opération `addPerson` à partir du port précédent

                if  (!res.isCancelled() && res.isDone()) {
                    textArea.setText("Information envoyée !\n");

                } else {
                    textArea.setText("Un problème est survenu !\n");
                }



            }
        });

        this.pack();
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
