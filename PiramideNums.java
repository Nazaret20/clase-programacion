import java.util.Scanner;

public class PiramideNums {
    public static void main(String[] args) {
        int alto, espaciosLat;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el alto: ");
        alto = sc.nextInt();

        espaciosLat = alto - 1;

        for (int linea = 1; linea <= alto; linea++) {
            for (int i = 1; i <= espaciosLat; i++) {
                System.out.print(" ");
            }
            
            for (int i = 1; i <= linea; i++) {
                System.out.print(linea + " ");
            }

            System.out.println("");

            //espacios - 1
            espaciosLat--;
        }

        sc.close();
    }
}
