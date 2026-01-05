import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo lato del rettangolo:");
        double l1 = scanner.nextDouble();

        System.out.println("Inserisci il secondo lato del rettangolo:");
        double l2 = scanner.nextDouble();

        double perimetroRett = perimetroRettangolo(l1, l2);
        System.out.println("Perimetro rettangolo: " + perimetroRett);

        System.out.println("Inserisci un numero intero:");
        int n = scanner.nextInt();

        int risultato = pariDispari(n);
        System.out.println("Risultato (0 = pari, 1 = dispari): " + risultato);

        System.out.println("Inserisci lato 1 del triangolo:");
        double a = scanner.nextDouble();

        System.out.println("Inserisci lato 2 del triangolo:");
        double b = scanner.nextDouble();

        System.out.println("Inserisci lato 3 del triangolo:");
        double c = scanner.nextDouble();

        double area = perimetroTriangolo(a, b, c);
        System.out.println("Area triangolo: " + area);

        scanner.close();
    }

    public static double perimetroRettangolo(double l1, double l2) {
        return 2 * (l1 + l2);
    }

    public static int pariDispari(int numero) {
        if (numero % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // AREA del triangolo (formula di Erone)
    public static double perimetroTriangolo(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

