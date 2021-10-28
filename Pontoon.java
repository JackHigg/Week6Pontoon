/**
 * <h1>Pontoon</h1>
 * <p>Pontoon game class to carry out the only the action of the pontoon game to keep classes small</p>
 */

public class Pontoon {

    private UserHand cards = new UserHand();
    private HouseHand house = new HouseHand();
    private SystemMessages output = new SystemMessages();
    private Deck deck1 = new Deck();

    private boolean busted = false;
    private boolean stick = false;

    public Pontoon(){

        deck1.generateCards();
        deck1.shuffle();

        this.startDraw2();

        for (int x=0; x<12; x++){

            this.hitOrStick();

            if (busted || !stick) {
                x=12;
            }

        }

        if (!busted){
            int houseTotal=house.checkHouseTotal();
            cards.checkHandValue(output, stick, houseTotal);
        }

    }

    public void startDraw2(){

        output.start();
        cards.drawTwo(deck1);
        house.drawTwo(deck1);

        cards.displayFullHand();
        this.busted= cards.checkHandValue(output);

    }

    public void hitOrStick(){

        this.stick = output.hitOrStick(busted);

        if (stick==true){

            cards.drawOne(deck1);
            house.drawOne(deck1);
            cards.displayLatestCard();
            this.busted= cards.checkHandValue(output);

        }

    }

}










