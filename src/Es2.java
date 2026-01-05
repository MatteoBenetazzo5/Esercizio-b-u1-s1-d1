import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci la prima stringa:");
        String s1 = sc.nextLine();

        System.out.println("Inserisci la seconda stringa:");
        String s2 = sc.nextLine();

        System.out.println("Inserisci la terza stringa:");
        String s3 = sc.nextLine();

        System.out.println("Ordine di inserimento: " + s1 + s2 + s3);
        System.out.println("Ordine inverso: " + s3 + s2 + s1);

        sc.close();
    }
}
