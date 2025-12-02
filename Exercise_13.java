import java.util.Scanner;

public class Main {

    public static void drawForm(int width, int height) {

        for(int colonne = 0; colonne < height; ++colonne) {
            for (int ligne = 0; ligne < width; ++ligne) {
                System.out.print("X");
            }
            System.out.println();
        }
    }


    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entrez une valeur : ");
        int width = scan.nextInt();
        System.out.println("Entrez une valeur : ");
        int height = scan.nextInt();

        drawForm(width, height);
    }
}
