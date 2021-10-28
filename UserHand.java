import java.util.ArrayList;

/**
 * <h1>UserHand</h1>
 * <p>class created for users hand allowing for template for every user hand and the actions involved</p>
 */

public class UserHand extends Hand{

    private ArrayList<String> userHand = new ArrayList<>();

    private int total=0;

    public void drawTwo(Deck deck1){

        for (int x=0; x<2; x++){

            this.userHand.add(deck1.drawCard());

        }

    }

    public void drawOne(Deck deck1){

        this.userHand.add(deck1.drawCard());

    }

    public void displayFullHand(){

        for (String x: this.userHand){

            System.out.println(x);

        }

    }

    public void displayLatestCard(){

        System.out.println("\n"+this.userHand.get(this.userHand.size()-1));
    }

    /**
     *<h1>checkHandValue</h1>
     * <p>hand value for checking if user has busted</p>
     *
     * @param output
     * @return true || false
     */

    public boolean checkHandValue(SystemMessages output){

        this.total=0;

        for (String x: this.userHand){

            String[] split = x.split(" ",3);
            String theValue=split[0];

            switch (theValue){

                case "Ace":

                    this.total=this.total+1;

                    break;

                case "Two":

                    this.total=this.total+2;

                    break;

                case "Three":

                    this.total=this.total+3;

                    break;

                case "Four":

                    this.total=this.total+4;

                    break;

                case "Five":

                    this.total=this.total+5;

                    break;

                case "Six":

                    this.total=this.total+6;

                    break;

                case "Seven":

                    this.total=this.total+7;

                    break;

                case "Eight":

                    this.total=this.total+8;

                    break;

                case "Nine":

                    this.total=this.total+9;

                    break;

                case "Ten":

                    this.total=this.total+10;

                    break;

                case "Queen":

                    this.total=this.total+10;

                    break;

                case "Jack":

                    this.total=this.total+10;

                    break;

                case "King":

                    this.total=this.total+11;

                    break;

            }

        }

        if (this.total>21){output.busted(total);}

        return (this.total>21? true : false);

    }

    /**
     *<h1>checkHandValue</h1>
     * <p>hand value for checking if user has won or lost game</p>
     *
     * @param output
     * @param stick
     * @return false
     */

    public boolean checkHandValue(SystemMessages output, boolean stick, int houseTotal){

        this.total=0;

        for (String x: this.userHand){

            String[] split = x.split(" ",3);
            String theValue=split[0];

            switch (theValue){

                case "Ace":

                    this.total=this.total+1;

                    break;

                case "Two":

                    this.total=this.total+2;

                    break;

                case "Three":

                    this.total=this.total+3;

                    break;

                case "Four":

                    this.total=this.total+4;

                    break;

                case "Five":

                    this.total=this.total+5;

                    break;

                case "Six":

                    this.total=this.total+6;

                    break;

                case "Seven":

                    this.total=this.total+7;

                    break;

                case "Eight":

                    this.total=this.total+8;

                    break;

                case "Nine":

                    this.total=this.total+9;

                    break;

                case "Ten":

                    this.total=this.total+10;

                    break;

                case "Queen":

                    this.total=this.total+10;

                    break;

                case "Jack":

                    this.total=this.total+10;

                    break;

                case "King":

                    this.total=this.total+11;

                    break;

            }

        }

        output.winOrLoose(total,houseTotal);
        return false;

    }

}
