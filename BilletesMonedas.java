public class BilletesMonedas {
    public static void main(String[] args) {
        int cantidad = 888, b100, b50, b20, b10, b5, m2, m1;
        System.out.println("Me has dado " + cantidad);

        b100 = cantidad / 100;
        cantidad = cantidad % 100;

        b50 = cantidad / 50;
        cantidad = cantidad % 50;

        b20 = cantidad / 20;
        cantidad = cantidad % 20;

        b10 = cantidad / 10;
        cantidad = cantidad % 10;

        b5 = cantidad / 5;
        cantidad = cantidad % 5;

        m2 = cantidad / 2;
        cantidad = cantidad % 2;

        m1 = cantidad;

        if (b100 > 0) {
            System.out.println(b100 + " en billetes de 100");
        }

        if (b50 > 0) {
            System.out.println(b50 + " en billetes de 50");
        }

        if (b20 > 0) {
            System.out.println(b20 + " en billetes de 20");
        }

        if (b10 > 0) {
            System.out.println(b10 + " en billetes de 10");
        }

        if (b5 > 0) {
            System.out.println(b5 + " en billetes de 5");
        }

        if (m2 > 0) {
            System.out.println(m2 + " en monedas de 2");
        }

        if (m1 > 0) {
            System.out.println(m1 + " en monedas de 1");
        }
    }
}
