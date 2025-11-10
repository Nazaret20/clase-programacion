public class MaxComunDiv {
    public static void main(String[] args) {
        int num1, num2, max, menor;

        num1 = 55;
        num2 = 60;

        max = 0;

        menor = num1;
        if (num2 < num1) {
            menor = num2;
        }

        for (int i = 1; i <= menor; i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                max = i;
            }
        }

        System.out.println("El MCD entre " + num1 + " y " + num2 + " es " + max);
    }
}
