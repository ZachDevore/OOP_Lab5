import java.util.Scanner;
import java.util.ArrayList;

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
            if (scanner.hasNextInt()) {
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

    /**
     * Displays the menu options for the user to select
     */
    private static void displayMainMenu(){
        System.out.println("\n-----------------------------");
        System.out.println("1. Sell an item.");
        System.out.println("Add an item to inventory.");
        System.out.println("Exit the Store.");
        System.out.println("\n-----------------------------");
    }

    private static void sellItem(){
        //logic for method
    }

    private static void addItem(){
        /*
        The logic for the method would be to add an item to the array list and keep track of
        all the important info such as SKU #, Brand, Color, amount, etc.
         */
    }


}//end of class
