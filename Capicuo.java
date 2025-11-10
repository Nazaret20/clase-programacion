
public class Capicuo {
    public static void main(String[] args) {
        int num, numInvert, numOrigin, digito;
      

        numOrigin = 432;

        num = numOrigin;
        numInvert = 0;

        while (num > 0) {
            digito = num % 10;
            numInvert = numInvert * 10 + digito;
            num = num / 10;
        }
        
        if (numInvert == numOrigin) {
            System.out.print(numOrigin + " es capicúa");
        } else {
            System.out.print(numOrigin + " no es capicúa");
        }
    }
}
