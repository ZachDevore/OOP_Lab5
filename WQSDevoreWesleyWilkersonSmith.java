import java.util.Scanner;
public class WQSDevoreWesleyWilkersonSmith {
    
    /** Array of the Electric Item Inventory */
    private  StoreItem[] electricItemInventory;

    /** Array of Clothing Item Inventory */
    private  StoreItem[] clothingItemInventory;

    /** Array of Food Item Inventory */
    private  StoreItem[] foodItemInventory;

    /** Keeps track of the number of items in electricItemInventory */
    private int electricInventoryCount;

    /** Keeps track of the number of items in clothingItemInventory */
    private int clothingItemInventoryCount;

    /** Keeps track of the number of items in foodItemInventory */
    private int foodItemInventoryCount;

    /** Constructor for the Store */
    public WQSDevoreWesleyWilkersonSmith() {
        this.electricItemInventory = new StoreItem[1000]; // Initialize with a capacity of 1000 items
        this.clothingItemInventory = new StoreItem[1000]; // Initialize with a capacity of 1000 items
        this.foodItemInventory = new StoreItem[1000]; // Initialize with a capacity of 1000 items
        
        this.electricInventoryCount = 0;
        this.clothingItemInventoryCount = 0;
        this.foodItemInventoryCount = 0;
    }

    /** @return the array of electric items in inventory */
    public StoreItem[] getElectricItemInventory() {return this.electricItemInventory;}

    /** @return the array of clothing items in inventory */
    public StoreItem[] getClothingItemInventory() {return this.clothingItemInventory;}

    /** @return the array of food items in inventory */
    public StoreItem[] getFoodItemInventory() {return this.foodItemInventory;}

    /** @return the number of items in the electric inventory */
    public int getElectricItemInventoryCount() {return this.electricInventoryCount;}

    /** @return the number of clothing items in the inventory */
    public int getClothingItemInventoryCount() {return this.clothingItemInventoryCount;}

    /** @return the number of food items in the inventory */
    public int getFoodItemInventoryCount() {return this.foodItemInventoryCount;} 

    /** increments the count to reflect the number of electric items in the inventory */
    public void incrementElectricInventoryItemCount() {
        this.electricInventoryCount++;
    }

    /** increments the count to reflect the number of clothing items in the inventory */
    public void incrementClothingItemInventory() {
        this.clothingItemInventoryCount++;
    }

    /** increments the count to reflect the number of food items in the inventory */
    public void incrementFoodItemInventoryCount() {
        this.foodItemInventoryCount++;
    }
//
    /**
     * Prints out the items in the inventory
     * @param items the array of items
     * @param itemCount the number of items in the inventory
     */
    public void displayItems(StoreItem[] items, int itemCount) {
            // Hard coding a few instances in the main method so no need to check if the array is empty
        if (itemCount == 0) {
            System.out.println("There are no items in the inventory yet");
        } else {
            for (int i = 0; i < itemCount; i++) {
                System.out.println(items[i] + "\n");
            }
        }
    
    /**
     * Calculates the sales tax on an item
     * @param item
     * @return the sales tax of the item
     */
    public double calculateSalexTax(StoreItem item) {
        if (item instanceof FoodItem) {
            return item.getPrice() * .03; // 3% sales tax for food
        } else {
            return item.getPrice() * .07; // 7% sales tax for all other items
        }
    }

    /**
     * Calculate the total price of the item
     * @param item
     * @return the total price of the item
     */
    public double calculatePrice(StoreItem item) {
        return item.getPrice() * calculateSalexTax(item); // Item Price * Sales Tax
    }

    /**
     * Adds a item to the store inventory
     * @param scanner
     */
    public void addInventory(Scanner scanner) {
         System.out.println("Which kind of item would you like to add?\n Press 1 for Clothing Item\n Press 2 for Electronic Item\n Press 3 for Cleaning Item\n Press 0 to stop adding items");
        int typeOfItem = scanner.nextInt();

         switch (typeOfItem) {
                    case 1: // Adding a Clothing Item
                        displayItems(clothingItemInventory, clothingItemInventoryCount); // Prints out the items the inventory
                        System.out.println("Which kind of Clothing Item would you like to add?\nPress 1 for Shoe, Press 2 for Shirt");
                        int typeOfClothingItem = scanner.nextInt();

                        if (typeOfClothingItem == 1) { // Add Shoe
                            System.out.print("(int) Enter ItemID: ");
                            int itemID = scanner.nextInt();

                            System.out.println("(String) Enter the Name: ");
                            String name = scanner.next();

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

                            getClothingItemInventory()[getClothingItemInventoryCount()] = new Shoe(itemID, name, brand, color, price, quantity, size, category, isSlipResistant, closureType); // Add Shoe

                            incrementClothingItemInventory(); // Increment count for number of clothingItems in inventory
                            return; // exit

                        } else { // Add Shirt
                            System.out.print("(int) Enter ItemID: ");
                            int itemID = scanner.nextInt();

                            System.out.println("(String) Enter the Name: ");
                            String name = scanner.next();

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

                            getClothingItemInventory()[getClothingItemInventoryCount()] = new Shirt(itemID, name, price, quantity, brand, size, color, sleeveType, material); // Adds Shirt
                           
                            incrementClothingItemInventory(); // increment count for number of clothing items in inventory
                            return; // exit 
                            
                        }
                    case 2: // Adding an ElectricItem
                        displayItems(electricItemInventory, electricInventoryCount); // Displays the items in the electric inventory
                        System.out.println("Which kind of electric item do you want to sell?\nPress 1 for TV\nPress 2 for Phone\nPress 3 for Laptop");
                        int typeOfElectricItem = scanner.nextInt();

                        switch(typeOfElectricItem) {
                            case 1: {
                                // Add TV
                                System.out.println("(int) Enter the ItemID: ");
                                int itemID = scanner.nextInt();

                                System.out.println("(String) Enter the Name: ");
                                String name = scanner.next();

                                System.out.println("(double) Enter the price $");
                                double price = scanner.nextDouble();

                                System.out.println("(int) Enter the quantity: ");
                                int quantity = scanner.nextInt();

                                System.out.println("(String) Enter the brand: ");
                                String brand = scanner.next();

                                System.out.println("(int) Enter the warrenty months: ");
                                int warrentyMonths = scanner.nextInt();

                                System.out.println("(double) Enter the power usage in Watts: ");
                                double powerWatts = scanner.nextDouble();

                                System.out.println("(boolean) Is the TV rechargable?");
                                boolean isRechargable = scanner.nextBoolean();

                                System.out.println("(boolean) Is the TV Smart?");
                                boolean isSmart = scanner.nextBoolean();

                                System.out.println("(boolean) Is the TV VESA compatable?");
                                boolean isVesaCombatiable = scanner.nextBoolean();

                                getElectricItemInventory()[getElectricItemInventoryCount()] = new TV(itemID, name, price, quantity, brand, warrentyMonths, powerWatts, isRechargable, isSmart, isVesaCombatiable); // Adds TV
                                incrementElectricInventoryItemCount(); // Increments the count for number of electric items in the inventory
                                return; // Exit
                            }
                            case 2: { // Add Phone
                                System.out.println("(int) Enter the ItemID: ");
                                int itemID = scanner.nextInt();

                                System.out.println("(String) Enter the Name: ");
                                String name = scanner.next();

                                System.out.println("(double) Enter the price $");
                                double price = scanner.nextDouble();

                                System.out.println("(int) Enter the quantity: ");
                                int quantity = scanner.nextInt();

                                System.out.println("(String) Enter the brand: ");
                                String brand = scanner.next();

                                System.out.println("(int) Enter the warrenty months: ");
                                int warrentyMonths = scanner.nextInt();

                                System.out.println("(double) Enter the power usage in Watts: ");
                                double powerWatts = scanner.nextDouble();

                                System.out.println("(boolean) Is the TV rechargable?");
                                boolean isRechargable = scanner.nextBoolean();

                                System.out.println("(String) Enter the operating system: ");
                                String os = scanner.next();

                                System.out.println("(String) Enter the type of chargerPort");
                                String chargerPort = scanner.next();

                                getElectricItemInventory()[getElectricItemInventoryCount()] = new Phone(itemID, name, price, quantity, brand, warrentyMonths, powerWatts, isRechargable, os, chargerPort); // Adds Phone to the inventory

                                incrementElectricInventoryItemCount(); // Increments the count for number of electric items in the inventory
                                return;
                            }
                            case 3: { // Add Laptop
                                System.out.println("(int) Enter the ItemID: ");
                                int itemID = scanner.nextInt();

                                System.out.println("(String) Enter the Name: ");
                                String name = scanner.next();

                                System.out.println("(double) Enter the price $");
                                double price = scanner.nextDouble();

                                System.out.println("(int) Enter the quantity: ");
                                int quantity = scanner.nextInt();

                                System.out.println("(String) Enter the brand: ");
                                String brand = scanner.next();

                                System.out.println("(int) Enter the warrenty months: ");
                                int warrentyMonths = scanner.nextInt();

                                System.out.println("(double) Enter the power usage in Watts: ");
                                double powerWatts = scanner.nextDouble();

                                System.out.println("(boolean) Is the Laptop rechargable?");
                                boolean isRechargable = scanner.nextBoolean();

                                System.out.println("(double) Enter the screenSize of the Laptop");
                                double screenSize = scanner.nextDouble();

                                System.out.println("(int) Enter the amount of RAM in the Laptop: ");
                                int ram = scanner.nextInt();

                                getElectricItemInventory()[getElectricItemInventoryCount()] = new Laptop(itemID, name, price, quantity, brand, warrentyMonths, powerWatts, isRechargable, screenSize, ram); // Adds Laptop to the inventory

                                incrementElectricInventoryItemCount(); // Increments the count for number of electric items in the store
                                return;
                            }
                            
                        }
                        break;
                    case 3: // Add Food Item
                        displayItems(foodItemInventory, foodItemInventoryCount); // displays the items in the food inventory
                        System.out.println("What kind of food item would you like to add?\nPress 1 for Fruit\nPress 2 for Vegetable");
                        int fruitToAdd = scanner.nextInt();

                        if (fruitToAdd == 1) { // Add Fruit
                            System.out.println("(int) Enter the ItemID: ");
                            int itemID = scanner.nextInt();

                            System.out.println("(String) Enter the Name: ");
                            String name = scanner.next();

                            System.out.println("(double) Enter the price $");
                            double price = scanner.nextDouble();

                            System.out.println("(int) Enter the quantity: ");
                            int quantity = scanner.nextInt();

                            System.out.println("(int) Enter the calories: ");
                            int calories = scanner.nextInt();

                            System.out.println("(int) Enter the expiration Date in the format MMDDYYYY"); // Not using a Date Object
                            int expirationDate = scanner.nextInt();

                            System.out.println("(String) Enter the color: ");
                            String color = scanner.next();

                            System.out.println("(boolean) Does the fruit have seeds?");
                            boolean hasSeeds = scanner.nextBoolean();

                            System.out.println("(boolean) Does the fruit have a peel?");
                            boolean hasPeel = scanner.nextBoolean();

                            System.out.println("(boolean) Is the fruit Sweet?");
                            boolean isSweet = scanner.nextBoolean();

                            System.out.println("(String) What is the shape of the fruit?");
                            String shape = scanner.next();

                            getFoodItemInventory()[getFoodItemInventoryCount()] = new Fruit(itemID, name, price, quantity, calories, expirationDate, color, hasSeeds, hasPeel, isSweet, shape); // Adds fruit to the store inventory

                            incrementFoodItemInventoryCount(); // Increments the count for number of food items in the store inventory
                        
                        } else { // Add Vegetable
                            System.out.println("(int) Enter the ItemID: ");
                            int itemID = scanner.nextInt();

                            System.out.println("(String) Enter the Name: ");
                            String name = scanner.next();

                            System.out.println("(double) Enter the price $");
                            double price = scanner.nextDouble();

                            System.out.println("(int) Enter the quantity: ");
                            int quantity = scanner.nextInt();

                            System.out.println("(int) Enter the calories: ");
                            int calories = scanner.nextInt();

                            System.out.println("(int) Enter the expiration Date in the format MMDDYYYY");
                            int expirationDate = scanner.nextInt();

                            System.out.println("(String) Enter the color: ");
                            String color = scanner.next();

                            System.out.println("(boolean) Does the Vegetable have seeds?");
                            boolean hasSeeds = scanner.nextBoolean();

                            System.out.println("(boolean) Is the Vegetable a root?");
                            boolean isRoot = scanner.nextBoolean();

                            System.out.println("(boolean) Is the Vegetable a flower?");
                            boolean isFlower = scanner.nextBoolean();

                            System.out.println("(boolean) Is the Vegetable a leaf?");
                            boolean isLeaf = scanner.nextBoolean();

                            System.out.println("(boolean) Is the Vegetable a stem?");
                            boolean isStem = scanner.nextBoolean();

                            getFoodItemInventory()[getFoodItemInventoryCount()] = new Vegetable(itemID, name, price, quantity, calories, expirationDate, color, hasSeeds, isRoot, isFlower, isLeaf, isStem); // Adds Vegetable to the store inventory

                            incrementFoodItemInventoryCount(); // Increments the count for the number of food items in the inventory
                        }
                   }
    }




   

    public static void main(String[] args) {
        WQSDevoreWesleyWilkersonSmith store = new WQSDevoreWesleyWilkersonSmith(); // Initialize store object
        Scanner scanner = new Scanner(System.in); // Initialize scanner object to read from the Standard Input

        boolean flag = false; // flag is to exit the loop when the user prompts 0
        

        do { // Ask the user if they want to add an item to inventory or sell the item
        

            System.out.println("Press 1 to add inventory\nPress 2 to sell an item\nPress 0 to exit");
            int addOrSellItem = scanner.nextInt();

            switch(addOrSellItem) {

                case 1: // Add Inventory
                   store.addInventory(scanner); // Call the addInventory Method
                   break;
                case 2:
                    //Sell Inventory
                    break;
                case 0:
                    flag = true;
                    break;
            }
        } while (!flag); // until the flag is triggered the program will keep prompting the user

        scanner.close(); // Close the scanner
    }

    





}
