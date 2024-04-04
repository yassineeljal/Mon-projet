package exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean formulaireIncomplet = true;
        while (formulaireIncomplet) {
            Scanner scan = new Scanner(System.in);
            byte age;
            float taille;
            boolean estEtudiantMV;
            try {
                System.out.println("Entrez votre age: ");
                age = scan.nextByte();
                if (age < 0) {
                    throw new Exception();
                }
                System.out.println("Entrez votre taille avec une virule");
                taille = scan.nextFloat();
                if (taille < 0 || taille > 4) {
                    throw new Exception();
                }

                System.out.println("Entrez si oui ou non vous êtes étudiant à MV (true/false): ");
                estEtudiantMV = scan.nextBoolean();
            } catch (Exception e) {
                System.out.println("Valeur entrez invalide");
                continue;
            }
            System.out.println("Les valeurs saisies sont : ");
            System.out.println("Age : " + age);
            System.out.println("Taille : " + taille);
            System.out.println("Étudiants : " + estEtudiantMV);
            System.out.println("Ces valeurs sont-elles correctes? (o/n)");
            String choix = scan.next();
            if (choix.compareTo("o") != 0){
                continue;
            }
            formulaireIncomplet = false;
            System.out.println("fin");
        }
    }
}
