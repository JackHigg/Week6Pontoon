import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

/**
 * <h1>Menu</h1>
 * <p>menu class used to be the main way for user to start stop and explain rules of pontoon</p>
 */

public class Menu {

    private int choice;

    //Boolean set to true to loop program until option 3 entered then it is set to false;
    private boolean repeat= true;

    /**
     *<p>Menu to repeat until user want to exit so user can play as many games as they want</p>
     */
    public Menu() throws IOException {

        while (repeat){

            displayOptions();

            optionChoice();

        }
    }

    /**
     * <h1>displayOption</h1>
     * @throws IOException on input mismatch l
     */
    public void displayOptions()throws IOException{

        Scanner kboard = new Scanner(System.in);

        try{

            System.out.println("\nMenu");
            System.out.println("\n1: Play pontoon");
            System.out.println("\n2: View rules");
            System.out.println("\n3: Exit");

            choice=kboard.nextInt();
        }
        catch (InputMismatchException e){

            String invalid = kboard.nextLine();
            System.out.println("\nINVALID VALUE ENTERED *PLEASE ENTER A NUMERICAL NUMBER* ");
            System.out.println("VALUE ENTERED: "+invalid);
            choice=0;
        }

    }

    public void optionChoice(){

        switch (choice){

            case 1:

                Pontoon game = new Pontoon();

                break;

            case 2:

                Rules r1 = new Rules();

                break;

            case 3:

                System.out.println("\nExiting program.... Goodbye!");
                repeat=false;

                break;

            default:

                System.out.println("\nPlease enter a valid option number from 1-3");

                break;
        }

    }


}
