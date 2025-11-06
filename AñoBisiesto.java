public class AñoBisiesto {
    public static void main(String[] args) {
        int anio = 7832;

        boolean esDivisible4 = anio % 4 == 0;
        boolean esDivisible100 = anio % 100 == 0;
        boolean esDivisible400 = anio % 400 == 0;

        boolean esBisiesto = false;

        if (esDivisible4 && (!esDivisible100 || esDivisible400)) {
            esBisiesto = true;
        }

        if (esBisiesto) {
            System.out.println("Es bisiesto");
        }


        // if (anio % 4 == 0) {
        //     if (anio % 100 == 0) {
        //         if (anio % 400 == 0) {
        //             System.out.println("Es bisiesto");
        //         }
        //     }

        // } else {
        //     System.out.println("No es bisiesto");
        // }

        // if (anio % 4 == 0) {
        //     if (anio % 100 != 0) {
        //         System.out.println("Es bisiesto");
        //     } else {
        //         System.out.println("No es bisiesto");
        //     }
        // }



    }
}
