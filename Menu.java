import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int accion, num1, num2, result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qué operación quieres hacer? ");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        accion = sc.nextInt();

        result = 0;

        while (accion != 5) {
            
            System.out.print("Dime un número: ");
            num1 = sc.nextInt();
            System.out.print("Dime otro número: ");
            num2 = sc.nextInt();

            if (accion == 1) {
                result = num1 + num2;
                System.out.println("Elegiste la opción número " + accion + " para " + num1 +
                        " y " + num2
                        + " , el restultado es: " + result);
            }

            if (accion == 2) {
                result = num1 - num2;
                System.out.println("Elegiste la opción número " + accion + " para " + num1 +
                        " y " + num2
                        + " , el restultado es: " + result);

            }

            if (accion == 3) {
                result = num1 * num2;
                System.out.println("Elegiste la opción número " + accion + " para " + num1 +
                        " y " + num2
                        + " , el restultado es: " + result);

            }

            if (accion == 4) {
                result = num1 / num2;
                System.out.println("Elegiste la opción número " + accion + " para " + num1 +
                        " y " + num2
                        + " , el restultado es: " + result);

            }

            if (accion == 5) {
                System.out.println("Gracias por usar la calculadora!");

            }

            System.out.println("Qué operación quieres hacer? ");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            accion = sc.nextInt();
        }

        sc.close();
    }

}
