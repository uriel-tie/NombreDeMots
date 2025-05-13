import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalMots = 0; // Variable pour compter le nombre total de mots

        try {
            // Création d’un objet File pointant vers le fichier à lire
            File file = new File("TestExercice3.txt");

            // Création d’un scanner pour lire le fichier
            Scanner scanner = new Scanner(file);

            // Lecture ligne par ligne du fichier
            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine();
                if (!ligne.isEmpty()) { // Vérifie que la ligne n’est pas vide
                    String[] mots = ligne.split("\\s+");
                    totalMots += mots.length;
                }
            }

            scanner.close();

            // Affichage du résultat
            System.out.println("Nombre total de mots : " + totalMots);

        } catch (FileNotFoundException e) {
            // En cas de fichier introuvable, un message d’erreur s’affiche
            System.out.println("Fichier introuvable !");
            e.printStackTrace();
        }
    }
}
