public class Es1 {
    public static void main(String[] args) {

        int prodotto = moltiplica(3, 4);
        System.out.println("Prodotto: " + prodotto);

        String risultatoConcat = concatena("Ciao", 10);
        System.out.println("Concatenazione: " + risultatoConcat);

        String[] array5 = {"A", "B", "D", "E", "F"};
        String[] array6 = inserisciInArray(array5, "C");

        for (int i = 0; i < array6.length; i++) {
            System.out.println(array6[i]);
        }
    }

    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static String concatena(String testo, int numero) {
        return testo + numero;
    }

    public static String[] inserisciInArray(String[] array, String nuova) {
        String[] risultato = new String[6];

        risultato[0] = array[0];
        risultato[1] = array[1];
        risultato[2] = nuova;
        risultato[3] = array[2];
        risultato[4] = array[3];
        risultato[5] = array[4];

        return risultato;
    }
}
