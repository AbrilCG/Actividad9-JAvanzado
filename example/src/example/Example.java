/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author User
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

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


package actividad8.java;
/**
 *@author LyrisseC
 */
    private String palo;
    private String color;
    private String valor;

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Palo: " + palo + " | " + "Color: " + color +
                " | " + "Valor: " + valor;
    }
}


package actividad8.java;
/**
 *@author LyrisseC
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
class Deck {
    private String[]palodeck={"Corazones", "Diamantes", "Trebol", "Picas"};
    private String[]colordeck={"Rojo", "Negro"};
    private String[]valordeck={"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
    
 private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();

        for (int palo = 0; palo < 2; palo++){
            for (int valor = 0; valor < valordeck.length; valor++)
                deck.add(new Card(palodeck[palo], colordeck[0], valordeck[valor]));
        }

        for (int palo = 2; palo < 4; palo++){
            for (int valor = 0; valor < valordeck.length; valor++)
                deck.add(new Card(palodeck[palo], colordeck[1], valordeck[valor]));
        }
    }

    public int getSize() {
        return deck.size();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void suflle() {
        Collections.shuffle(deck);
        System.out.println("Se mezcló el Deck.");
        for (Object elemento : deck) {
            System.out.print(elemento + " / ");
        }
    }

    public void head(){
        System.out.println(Deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " cartas");
    }


    public void pick() {
        Random random = new Random();
        System.out.println(deck.get(random.nextInt(deck.size())));
        deck.remove(random.nextInt(deck.size()));
        System.out.println("Quedan " + deck.size() + " cartas");
    }

    public void hand() {
        for(int i=0; i<=4; i++){
            System.out.println(deck.get(i));
        }
        for(int i=0; i<=4; i++){
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size()+ " cartas");
    }
    
}
