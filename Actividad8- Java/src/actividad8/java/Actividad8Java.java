package actividad8.java;
/**
 *@author LyrisseC
 */
public class Actividad8Java {
    public static void main(String[] args) {
        Deck mazo = new Deck();
        Card = new Card();

        System.out.println("Deck de Cartas para Iniciar: " + mazo.getSize());

        for (Card elemento : mazo.getDeck()) {
            System.out.print(elemento + " / ");
        }
        System.out.println("\n");
        mazo.suflle();
        System.out.println("\n");
        mazo.head();
        System.out.println("\n");
        mazo.pick();
        System.out.println("\n");
        mazo.hand();
    }
}
