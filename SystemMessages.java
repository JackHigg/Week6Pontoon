import java.util.Scanner;

/**
 * <h1>SystemMessages</h1>
 * <p>class for displaying messages to user so classes are small and not overcrowded</p>
 */

public class SystemMessages {

    Scanner kboard = new Scanner(System.in);

    public void start(){
        System.out.println("\n----------------------------");
        System.out.println("\nCommencing game");

        System.out.println("\nDrawing 2 cards");
    }

    public boolean hitOrStick(boolean busted){

        char choice;

        System.out.println("\nDo you wish to draw another card? y/n");
        choice = kboard.next().charAt(0);

        return (choice == 'y' ? true : false);


    }

    public void busted(int total){

        System.out.println("\nYou have busted with a hand value of : "+total);
        System.out.println("which is over 21");

    }

    public void winOrLoose(int total, int houseTotal){

        String winTxt = "\nYou have won with " + total+ " compared to house with total of "+houseTotal;
        String lostTxt = "\nYou have lost with " + total+ " compared to house with total of "+houseTotal;
        String gameMessage=" ";

       if (total>17 && total<=21){

          if (houseTotal>17 && houseTotal<=21 && houseTotal>total){

              gameMessage=lostTxt;

          }
          else
          {
              gameMessage=winTxt;
          }


       }
       else
       {
           gameMessage=lostTxt;
       }


        System.out.println(gameMessage);

    }

}
