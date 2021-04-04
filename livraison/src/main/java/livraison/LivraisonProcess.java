package livraison;

import javax.swing.*;
import javax.xml.ws.Response;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public class LivraisonProcess extends JFrame {

    private final int id;
    private final int idUtilisateur;
    private HashMap<String, Integer> listeThe;
    private String etat;

    final private JButton theRecupere;
    final private JButton theLivre;
    final private JButton fermeture;

    private String afficheCommande;

    private JTextArea info;


    public LivraisonProcess(int id, int idUtilisateur, HashMap<String, Integer> listeThe, String etat) {
        super("TeaServiceAsynchronous Client");

        this.id = id;
        this.idUtilisateur = idUtilisateur;
        this.listeThe = listeThe;
        this.etat = etat;



        Livraison_Service livraisonService = new Livraison_Service();
        Livraison livraisonPort = livraisonService.getLivraisonPort();

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(500, 300));

        info = new JTextArea();
        afficheCommande = "";
        for(String key : listeThe.keySet()){
            afficheCommande +=  "        > - "+key+" x"+listeThe.get(key)+" sachets\n";
        }
        System.out.println(afficheCommande);

        String textInit = "Veuillez appuyer sur le bouton OK lorsque vous aurez pris la commande "+id+" a destination du client "+idUtilisateur+" contenant :\n" + afficheCommande;

        info.setText(textInit);

        info.setEditable(false);
        this.getContentPane().add(BorderLayout.NORTH, info);

        final JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        this.getContentPane().add(BorderLayout.SOUTH, textArea);

        JPanel buttonPanel = new JPanel();

        theRecupere = new JButton("OK");
        theRecupere.setPreferredSize(new Dimension(75, 30));

        theLivre = new JButton("OK");
        theLivre.setPreferredSize(new Dimension(75, 30));
        theLivre.setVisible(false);

        fermeture = new JButton("Quitter");
        fermeture.setPreferredSize(new Dimension(75, 30));
        fermeture.setVisible(false);

        buttonPanel.add(theRecupere);
        buttonPanel.add(theLivre);
        buttonPanel.add(fermeture);
        this.getContentPane().add(buttonPanel);


        theRecupere.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                theRecupere.setEnabled(false);

                Response res = livraisonPort.colisAuLivreurAsync(id);
                textArea.setText("Envoie des informations au gestionnaire ...\n");
                ColisAuLivreurResponse reponse = null;
                try {
                    reponse = (ColisAuLivreurResponse)res.get();
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

                    String affichage = "Veuillez appuyer sur le bouton OK lorsque vous aurez livré la commande "+id+" a destination du client "+idUtilisateur+" contenant :\n" + afficheCommande;

                    info.setText(affichage);

                    theRecupere.setVisible(false);
                    theLivre.setVisible(true);

                } else {
                    textArea.setText("Un problème est survenu lors de l'envoie !\n");
                    theRecupere.setEnabled(true);
                }

            }
        });

        theLivre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                theLivre.setEnabled(false);

                Response res = livraisonPort.theLivreAsync(id);
                textArea.setText("Envoie des informations au gestionnaire ...\n");
                TheLivreResponse reponse = null;
                try {
                    reponse = (TheLivreResponse)res.get();
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
                    info.setText("Votre travail de préparation est terminé !! Veuillez quitter le programme :");

                    theLivre.setVisible(false);
                    fermeture.setVisible(true);

                }else {
                    textArea.setText("Un problème est survenu lors de l'envoie !\n");
                    theLivre.setEnabled(true);
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
