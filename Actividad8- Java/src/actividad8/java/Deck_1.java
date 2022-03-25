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
