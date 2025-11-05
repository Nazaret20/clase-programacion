import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        int num, suma = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un número: ");
        num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }

        if (suma == num) {
            System.out.print(num + " es perfecto");
        } else {
            System.out.print(num + " no es perfecto");
        }

        sc.close();
    }
}