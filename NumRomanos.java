public class NumRomanos {
    public static void main(String[] args) {
        int num;

        num = 1998;

        // if (num >= 3000) {
        //     System.out.print("MMM");

        // } else if (num >= 2000) {
        //     System.out.print("MM");

        // } else if (num >= 1000) {
        //     System.out.print("M");
        // }

        while (num >= 1000) {
            System.out.print("M");
            num -= 1000;
        }

        if (num >= 900) {
            System.out.print("CM");
            num -= 900;
        }

        if (num >= 500) {
            System.out.print("D");
            num -= 500;
        }

        if (num >= 400) {
            System.err.print("CD");
            num -= 400;
        }

        while (num >= 100) {
            System.out.print("C");
            num -= 100;
        }

        if (num >= 90) {
            System.out.print("XC");
            num -= 90;
        }

        if (num >= 50) {
            System.out.print("L");
            num -= 50;
        }

        if (num >= 40) {
            System.err.print("XL");
            num -= 40;
        }

        while (num >= 10) {
            System.out.print("X");
            num -= 10;
        }

        if (num >= 9) {
            System.out.print("IX");
            num -= 9;
        }

        if (num >= 5) {
            System.out.print("V");
            num -= 5;
        }

        if (num >= 4) {
            System.err.print("IX");
            num -= 4;
        }

        while (num >= 1) {
            System.out.print("I");
            num -= 1;
        }
    }
}
