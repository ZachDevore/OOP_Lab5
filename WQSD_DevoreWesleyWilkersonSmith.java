import java.util.Scanner

/**
 * @author Thomas Wesley
 * CSC 331-002
 * Date: 3/17/26
 * Purpose: The driver file shoule be able to handle inventory using arraylist
 * primary methods for use should be additem, sellitem, chekcout, and return policy
 */




import java.util.Scanner;



public class WQSD_DevoreWesleyWilkersonSmith {

    private static ArrayList<StoreItem> inventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Welcome to Wilmington Quick Shop");

        int selection = 0;

        while(selection !=3){
            displayMainMenu();
            // Check if the input is a number BEFORE we call nextInt()
            if (Scanner.hasNextInt()) {
                selection = scanner.nextInt();
                scanner.nextLine(); // Clear the buffer

                switch (selection) {
                    case 1:
                        sellItem();//gives the user the ability to sell an item
                    case 2:
                        addItem();//gives the user the ability to add to inventory
                    case 3:
                        System.out.println("Thank you for Shopping.");
                    default:
                        System.out.println("Error: Please enter a numeric value between 1-3.");
                }
            } else {
                // If the user typed a letter like 'A' or 'abc'
                System.out.println("Error: Please enter a numeric value between 1-3.");
                scanner.nextLine(); // clears the "junk" text
            }
        }



    }//end of main
}//end of class
