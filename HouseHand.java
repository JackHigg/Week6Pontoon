import java.util.ArrayList;

public class HouseHand extends Hand{

    private ArrayList<String> HouseHand = new ArrayList<>();

    private int total=0;

    public void drawTwo(Deck deck1){

        for (int x=0; x<2; x++){

            this.HouseHand.add(deck1.drawCard());

        }

    }

    public void drawOne(Deck deck1){

        this.HouseHand.add(deck1.drawCard());

    }

    public void displayFullHand(){

        for (String x: this.HouseHand){

            System.out.println(x);

        }

    }

    public int checkHouseTotal(){

        this.total=0;

        for (String x: this.HouseHand){

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


        return total;

    }

}

