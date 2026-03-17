import java.util.Scanner;
public class WQSDevoreWesleyWilkersonSmith {
    
    /** Array of the Store Inventory */
    private StoreItem[] storeInventory;

    private int inventoryCount;


    /** Constructor for the Store */
    public WQSDevoreWesleyWilkersonSmith() {
        this.storeInventory = new StoreItem[1000]; // Initialize with a capacity of 1000 items
        this.inventoryCount = 0;
    }

    public StoreItem[] getStoreInventory() {return this.storeInventory;}

    public int getInventoryCount() {return this.inventoryCount;}

   

    public static void main(String[] args) {
        WQSDevoreWesleyWilkersonSmith store = new WQSDevoreWesleyWilkersonSmith(); // Initialize store object
        Scanner scanner = new Scanner(System.in); // Initialize scanner object to read from the Standard Input

        boolean flag = false;
        

        do { // Ask the user if they want to add an item to inventory or sell the item

            System.out.println("Press 1 to add inventory\nPress 2 to sell an item\nPress 0 to exit");
            int addOrSellItem = scanner.nextInt();

            switch(addOrSellItem) {

                case 1:
                   System.out.println("Which kind of item would you like to add?\n Press 1 for Clothing Item\n Press 2 for Electronic Item\n Press 3 for Cleaning Item\n Press 0 to stop adding items");
                   int typeOfItem = scanner.nextInt();

                   switch (typeOfItem) {
                    case 1:
                        //ClothingItem
                        System.out.println("Which kind of Clothing Item would you like to add?\nPress 1 for Shoe, Press 2 for Shirt");
                        int typeOfClothingItem = scanner.nextInt();
                        if (typeOfClothingItem == 1) { // Add Shoe
                            System.out.print("(int) Enter ItemID: ");
                            int itemID = scanner.nextInt();

                            System.out.print("(String) Enter the Brand: ");
                            String brand = scanner.next();

                            System.out.print("(String) Enter the Color: ");
                            String color = scanner.next();

                            System.out.print("(double) Enter the Price: $");
                            double price = scanner.nextDouble();

                            System.out.print("(int) Enter the Quantity: ");
                            int quantity = scanner.nextInt();

                            System.out.print("(String) Enter the Size: ");
                            String size = scanner.next();

                            System.out.print("(String) Enter the Category: ");
                            String category = scanner.next();

                            System.out.print("(boolean) Enter weather is slip resistant: ");
                            boolean isSlipResistant = scanner.nextBoolean();

                            System.out.print("(String) Enter the Closure type: ");
                            String closureType = scanner.next();

                            // Reads as store[inventoryCount] = new Shoe()
                            store.getStoreInventory()[store.getInventoryCount()] = new Shoe(itemID, brand, color, price, quantity, size, category, isSlipResistant, closureType);

                            store.inventoryCount++; // Incriment count
                            continue; // exit

                        } else { // Add Shirt
                            System.out.print("(int) Enter ItemID: ");
                            int itemID = scanner.nextInt();

                            System.out.print("(String) Enter the Brand: ");
                            String brand = scanner.next();

                            System.out.print("(String) Enter the Color: ");
                            String color = scanner.next();

                            System.out.print("(double) Enter the Price: $");
                            double price = scanner.nextDouble();

                            System.out.print("(int) Enter the Quantity: ");
                            int quantity = scanner.nextInt();

                            System.out.print("(String) Enter the Size: ");
                            String size = scanner.next();

                            System.out.print("(String) Enter the type of sleeve: ");
                            String sleeveType = scanner.next();

                            System.out.print("(String) Enter the type of material: ");
                            String material = scanner.next();

                            // Add the Shirt reads as store[inventoryCount] = new Shirt()
                            store.getStoreInventory()[store.getInventoryCount()] = new Shirt(itemID, price, quantity, brand, size, color, sleeveType, material);

                            store.inventoryCount++;
                            continue; // exit 
                            
                        }
                    case 2:
                        //ElectricItem
                        continue;
                    case 3:
                        //CleaningItem
                        continue;
                    case 0:
                        //Exit
                        break;
                   }
                case 2:
                    //Sell Inventory
                case 0:
                    flag = true;
                    break;
            }
        } while (!flag); // until the flag is triggered the program will keep prompting the user
    }

    





}
