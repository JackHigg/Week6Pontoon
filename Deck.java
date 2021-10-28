import java.util.ArrayList;

public class Deck {

    private ArrayList<String> allCards= new ArrayList<>();
    private ArrayList<String> shuffledCards= new ArrayList<>();

    /**
     * <h1>generateCards</h1>
     * <p>generates cards from enums creating a deck with no repeating values</p>
     */

    public void generateCards(){


        for (Suit group : Suit.values()) {

            for (CardValues number : CardValues.values()){

                this.allCards.add(number+" of "+group);

            }
        }

    }

    /**
     * <h1>shuffle</h1>
     * <p>shuffles cards into a new array so randomised numbers don't need to be generated for every new card that is needed to from the deck</p>
     */

    public void shuffle() {

        int length;

        int cardNumber;

        for (int x = 1; x <= 52; x++) {

            length = this.allCards.size();
            cardNumber = (int) (Math.random() * length - 1);

            this.shuffledCards.add(this.allCards.get(cardNumber));

            this.allCards.remove(cardNumber);

        }

    }

    public String drawCard(){

        String card = shuffledCards.get(0);
        shuffledCards.remove(0);

        return card;

    }


}
