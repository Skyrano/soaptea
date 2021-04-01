package preparation;

import java.io.IOException;
import java.util.Scanner;

public class ServicePreparationImpl {

    private void prendreNoteCommandeClient(){
        System.out.println("La commande du client a été prise en compte ? (appuyez sur \"entré\" pour continuer) ...");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        //envoie de l'info à la gestion
    }

    private void deplacerTheZoneLivraison(){
        System.out.println("Le thé à été déposé sur la zone du client ? (appuyez sur \"entré\" pour continuer) ...");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        //envoie de l'info à la gestion
    }

    public void startProcessPreparation(){


    }

    public static void main(String[] args) throws IOException {
        TeaProcess tea = new TeaProcess();
    }
}
