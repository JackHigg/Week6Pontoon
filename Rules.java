/**
 * <h1>Rules</h1>
 * <p>Rules class to show rules and keep classes small</p>
 */


public class Rules {

    public Rules() {
        displayRules();
    }

    public void displayRules(){

        System.out.println("\n-----------------------------------------------------------------------------------");
        System.out.println("\nRules");
        System.out.println("\nPlayer will receive two cards with values from 1-11");
        System.out.println("Following this user will be asked to hit or stick");
        System.out.println("\nIf user hits another card will be given if total value of cards exceed 21 user");
        System.out.println("Will bust automatically");
        System.out.println("\nIf user sticks and values is >17 and <21 user total value will be compared to the");
        System.out.println("dealers hand the closest one to 21 wins");
        System.out.println("\n-----------------------------------------------------------------------------------");

    }
}

