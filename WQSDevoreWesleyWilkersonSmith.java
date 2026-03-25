import java.util.Scanner;
public class WQSDevoreWesleyWilkersonSmith {
    
    /** Array of the Electric Item Inventory */
    private  StoreItem[] electricItemInventory;

    /** Array of Clothing Item Inventory */
    private  StoreItem[] clothingItemInventory;

    /** Array of Food Item Inventory */
    private  StoreItem[] foodItemInventory;

    // Array of Household Item Inventory
    private  StoreItem[] householdItemInventory;

    /** Keeps track of the number of items in electricItemInventory */
    private int electricInventoryCount;

    /** Keeps track of the number of items in clothingItemInventory */
    private int clothingItemInventoryCount;

    /** Keeps track of the number of items in foodItemInventory */
    private int foodItemInventoryCount;

    // Number of items in householdItemInventory
    private int householdItemInventoryCount;

    /** Constructor for the Store */
    public WQSDevoreWesleyWilkersonSmith() {
        this.electricItemInventory = new StoreItem[1000]; // Initialize with a capacity of 1000 items
        this.clothingItemInventory = new StoreItem[1000]; // Initialize with a capacity of 1000 items
        this.foodItemInventory = new StoreItem[1000]; // Initialize with a capacity of 1000 items
        this.householdItemInventory = new StoreItem[1000]; // Initialize with a capacity of 1000 items

        this.electricInventoryCount = 0;
        this.clothingItemInventoryCount = 0;
        this.foodItemInventoryCount = 0;
        this.householdItemInventoryCount = 0;
    }

    /** @return the array of electric items in inventory */
    public StoreItem[] getElectricItemInventory() {return this.electricItemInventory;}

    /** @return the array of clothing items in inventory */
    public StoreItem[] getClothingItemInventory() {return this.clothingItemInventory;}

    /** @return the array of food items in inventory */
    public StoreItem[] getFoodItemInventory() {return this.foodItemInventory;}

    /**
     * @return the array of household items in inventory
     */
    public StoreItem[] getHouseholdItemInventory() {return this.householdItemInventory;}

    /** @return the number of items in the electric inventory */
    public int getElectricItemInventoryCount() {return this.electricInventoryCount;}

    /** @return the number of clothing items in the inventory */
    public int getClothingItemInventoryCount() {return this.clothingItemInventoryCount;}

    /** @return the number of food items in the inventory */
    public int getFoodItemInventoryCount() {return this.foodItemInventoryCount;}

    /**
     *
     * @return the number of household items in the inventory
     */
    public int getHouseholdItemInventoryCount() {return this.householdItemInventoryCount;}

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

    // increments the count to reflect the number of household items in the inventory
    public void incrementHouseholdItemInventoryCount() {this.householdItemInventoryCount++;}

    /**
     * Matches the name of an item to the items in inventory
     * @param items Inventory array
     * @param itemCount Number of items in inventory
     * @param name The name of the item to be matched
     * @return The matches item
     */
    public StoreItem getStoreItem(StoreItem[] items, int itemCount, String name) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getName().equals(name)) { // If item passed equals named pass it's a match
                return items[i];
            }
        }
        return null; // If no items match return null
    }

    public void addInventoryHardCoded() {
        // ++ at the end means it adds to the count after the item is added ++ before means it adds before the item is added

        // Add clothing items
        clothingItemInventory[clothingItemInventoryCount++] = new Shirt(1, "Executive", 25.99, 2, "polo", "medium", "black", "short", "cotten");
        clothingItemInventory[clothingItemInventoryCount++] = new Shoe(2, "AirMax", "NIke", "black", 150, 10, "10 1/2", "BasketBall", false, "lace");

        // Add electric items
        electricItemInventory[electricInventoryCount++] = new Phone(3, "Iphone", 1000, 100, "Apple", 24, 50, true, "IOS", "USB-C");
        electricItemInventory[electricInventoryCount++] = new Laptop(4, "Macbook", 2500, 50, "Apple", 24, 100, true, 14, 32);
        electricItemInventory[electricInventoryCount++] = new TV(5, "LP-505", 500, 20, "Samsung", 12, 20, false, true, true);

        // Add food items
        foodItemInventory[foodItemInventoryCount++] = new Vegetable(6, "Brocoli", 2, 30, 80, 06132026, "Green", false, false, true, false, false);
        foodItemInventory[foodItemInventoryCount++] = new Vegetable(7, "Kale", 1.99, 40, 20, 06132026, "Green", false, false, false, true, false);

        // Add household items
        householdItemInventory[householdItemInventoryCount++] = new CleaningSupply(8, "Lemon Pledge", 6.99, 5, 14.2, "can", "furniture", "lemon", true, true);
        householdItemInventory[householdItemInventoryCount++] = new Furniture(9, "couch", 800, 15, 100, "leather", "living room", "chair", false, true, 8, 3, 8, 4);
    }

    /**
     * Prints out the items in the inventory
     * @param items the array of items
     * @param itemCount the number of items in the inventory
     */
    public void displayItems(StoreItem[] items, int itemCount) {
            // Hard coding a few instances in the main method so no need to check if the array is empty
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
            return item.getPrice() + .03; // 3% sales tax for food
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
        return item.getPrice() + calculateSalexTax(item); // Item Price * Sales Tax
    }

    /**
     * Adds an item to the store inventory
     * @param scanner
     */
    public void addInventory(Scanner scanner) {
        System.out.println(
        "Which kind of item would you like to add?\n" +
        " Press 1 for Clothing Item\n" +
        " Press 2 for Electronic Item\n" +
        " Press 3 for Food Item\n" +
        " Press 4 for Household Item\n" +
        " Press 0 to stop adding items\n"
);
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
                            String name = scanner.nextLine();

                            System.out.print("(String) Enter the Brand: ");
                            String brand = scanner.nextLine();

                            System.out.print("(String) Enter the Color: ");
                            String color = scanner.nextLine();

                            System.out.print("(double) Enter the Price: $");
                            double price = scanner.nextDouble();

                            System.out.print("(int) Enter the Quantity: ");
                            int quantity = scanner.nextInt();

                            System.out.print("(String) Enter the Size: ");
                            String size = scanner.nextLine();

                            System.out.print("(String) Enter the Category: ");
                            String category = scanner.nextLine();

                            System.out.print("(boolean) Enter weather is slip resistant: ");
                            boolean isSlipResistant = scanner.nextBoolean();

                            System.out.print("(String) Enter the Closure type: ");
                            String closureType = scanner.nextLine();

                            getClothingItemInventory()[getClothingItemInventoryCount()] = new Shoe(itemID, name, brand, color, price, quantity, size, category, isSlipResistant, closureType); // Add Shoe

                            incrementClothingItemInventory(); // Increment count for number of clothingItems in inventory
                            return; // exit

                        } else { // Add Shirt
                            System.out.print("(int) Enter ItemID: ");
                            int itemID = scanner.nextInt();

                            System.out.println("(String) Enter the Name: ");
                            String name = scanner.nextLine();

                            System.out.print("(String) Enter the Brand: ");
                            String brand = scanner.nextLine();

                            System.out.print("(String) Enter the Color: ");
                            String color = scanner.nextLine();

                            System.out.print("(double) Enter the Price: $");
                            double price = scanner.nextDouble();

                            System.out.print("(int) Enter the Quantity: ");
                            int quantity = scanner.nextInt();

                            System.out.print("(String) Enter the Size: ");
                            String size = scanner.nextLine();

                            System.out.print("(String) Enter the type of sleeve: ");
                            String sleeveType = scanner.nextLine();

                            System.out.print("(String) Enter the type of material: ");
                            String material = scanner.nextLine();

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
                                String name = scanner.nextLine();

                                System.out.println("(double) Enter the price $");
                                double price = scanner.nextDouble();

                                System.out.println("(int) Enter the quantity: ");
                                int quantity = scanner.nextInt();

                                System.out.println("(String) Enter the brand: ");
                                String brand = scanner.nextLine();

                                System.out.println("(int) Enter the warrenty months: ");
                                int warrentyMonths = scanner.nextInt();

                                System.out.println("(double) Enter the power usage in Watts: ");
                                double powerWatts = scanner.nextDouble();

                                System.out.println("(boolean) Is the TV rechargable?");
                                boolean isRechargable = scanner.nextBoolean();

                                System.out.println("(boolean) Is the TV Smart?");
                                boolean isSmart = scanner.nextBoolean();

                                System.out.println("(boolean) Is the TV VESA compataile?");
                                boolean isVesaCombatiable = scanner.nextBoolean();

                                getElectricItemInventory()[getElectricItemInventoryCount()] = new TV(itemID, name, price, quantity, brand, warrentyMonths, powerWatts, isRechargable, isSmart, isVesaCombatiable); // Adds TV
                                incrementElectricInventoryItemCount(); // Increments the count for number of electric items in the inventory
                                return; // Exit
                            }
                            case 2: { // Add Phone
                                System.out.println("(int) Enter the ItemID: ");
                                int itemID = scanner.nextInt();

                                System.out.println("(String) Enter the Name: ");
                                String name = scanner.nextLine();

                                System.out.println("(double) Enter the price $");
                                double price = scanner.nextDouble();

                                System.out.println("(int) Enter the quantity: ");
                                int quantity = scanner.nextInt();

                                System.out.println("(String) Enter the brand: ");
                                String brand = scanner.nextLine();

                                System.out.println("(int) Enter the warrenty months: ");
                                int warrentyMonths = scanner.nextInt();

                                System.out.println("(double) Enter the power usage in Watts: ");
                                double powerWatts = scanner.nextDouble();

                                System.out.println("(boolean) Is the TV rechargable?");
                                boolean isRechargable = scanner.nextBoolean();

                                System.out.println("(String) Enter the operating system: ");
                                String os = scanner.nextLine();

                                System.out.println("(String) Enter the type of chargerPort");
                                String chargerPort = scanner.nextLine();

                                getElectricItemInventory()[getElectricItemInventoryCount()] = new Phone(itemID, name, price, quantity, brand, warrentyMonths, powerWatts, isRechargable, os, chargerPort); // Adds Phone to the inventory

                                incrementElectricInventoryItemCount(); // Increments the count for number of electric items in the inventory
                                return;
                            }
                            case 3: { // Add Laptop
                                System.out.println("(int) Enter the ItemID: ");
                                int itemID = scanner.nextInt();

                                System.out.println("(String) Enter the Name: ");
                                String name = scanner.nextLine();

                                System.out.println("(double) Enter the price $");
                                double price = scanner.nextDouble();

                                System.out.println("(int) Enter the quantity: ");
                                int quantity = scanner.nextInt();

                                System.out.println("(String) Enter the brand: ");
                                String brand = scanner.nextLine();

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
                            String name = scanner.nextLine();

                            System.out.println("(double) Enter the price $");
                            double price = scanner.nextDouble();

                            System.out.println("(int) Enter the quantity: ");
                            int quantity = scanner.nextInt();

                            System.out.println("(int) Enter the calories: ");
                            int calories = scanner.nextInt();

                            System.out.println("(int) Enter the expiration Date in the format MMDDYYYY"); // Not using a Date Object
                            int expirationDate = scanner.nextInt();

                            System.out.println("(String) Enter the color: ");
                            String color = scanner.nextLine();

                            System.out.println("(boolean) Does the fruit have seeds?");
                            boolean hasSeeds = scanner.nextBoolean();

                            System.out.println("(boolean) Does the fruit have a peel?");
                            boolean hasPeel = scanner.nextBoolean();

                            System.out.println("(boolean) Is the fruit Sweet?");
                            boolean isSweet = scanner.nextBoolean();

                            System.out.println("(String) What is the shape of the fruit?");
                            String shape = scanner.nextLine();

                            getFoodItemInventory()[getFoodItemInventoryCount()] = new Fruit(itemID, name, price, quantity, calories, expirationDate, color, hasSeeds, hasPeel, isSweet, shape); // Adds fruit to the store inventory

                            incrementFoodItemInventoryCount(); // Increments the count for number of food items in the store inventory
                        
                        } else { // Add Vegetable
                            System.out.println("(int) Enter the ItemID: ");
                            int itemID = scanner.nextInt();

                            System.out.println("(String) Enter the Name: ");
                            String name = scanner.nextLine();

                            System.out.println("(double) Enter the price $");
                            double price = scanner.nextDouble();

                            System.out.println("(int) Enter the quantity: ");
                            int quantity = scanner.nextInt();

                            System.out.println("(int) Enter the calories: ");
                            int calories = scanner.nextInt();

                            System.out.println("(int) Enter the expiration Date in the format MMDDYYYY");
                            int expirationDate = scanner.nextInt();

                            System.out.println("(String) Enter the color: ");
                            String color = scanner.nextLine();

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
                        break;
                    //add household item
                    case 4:
                        // display the items and their count in household item inventory
                        displayItems(householdItemInventory, householdItemInventoryCount);
                        System.out.println("What kind of household item would you like to add?\nPress 1 for Cleaning Supply\nPress 2 for Furniture");
                        int householdSelection = scanner.nextInt();

                        //add cleaning supply
                        if (householdSelection == 1) {
                            System.out.println("(int) Enter the ItemID: ");
                            int itemID = scanner.nextInt();

                            System.out.println("(String) Enter the Name: ");
                            String name = scanner.nextLine();

                            System.out.println("(double) Enter the price $");
                            double price = scanner.nextDouble();

                            System.out.println("(int) Enter the quantity: ");
                            int quantity = scanner.nextInt();

                            System.out.println("(double) Enter the weight: ");
                            double weight = scanner.nextDouble();

                            System.out.println("(String) Enter the material: ");
                            String material = scanner.nextLine();

                            System.out.println("(String) Enter the areaOfUse: ");
                            String areaOfUse = scanner.nextLine();

                            System.out.println("(String[]) Enter the chemicals contained separated by a \",\": ");
                            String[] chemicals = scanner.nextLine().split(",");

                            System.out.println("(boolean) Is the item toxic: ");
                            boolean toxic = scanner.nextBoolean();

                            System.out.println("(boolean) Is the item flammable: ");
                            boolean flammable = scanner.nextBoolean();

                            // Adds cleaning supply to the store inventory
                            getHouseholdItemInventory()[getHouseholdItemInventoryCount()] = new CleaningSupply(int itemID, String name, double price, int quantity, double weight, String material, String areaOfUse, String[] chemicalsContained, boolean toxic, boolean flammable);

                            // Increments the count for the number of household items in the store inventory
                            incrementHouseholdItemInventoryCount();
                        }
                        // Add Furniture
                        else{
                            System.out.println("(int) Enter the ItemID: ");
                            int itemID = scanner.nextInt();

                            System.out.println("(String) Enter the Name: ");
                            String name = scanner.nextLine();

                            System.out.println("(double) Enter the price $");
                            double price = scanner.nextDouble();

                            System.out.println("(int) Enter the quantity: ");
                            int quantity = scanner.nextInt();

                            System.out.println("(double) Enter the weight: ");
                            double weight = scanner.nextDouble();

                            System.out.println("(String) Enter the material: ");
                            String material = scanner.nextLine();

                            System.out.println("(String) Enter the areaOfUse: ");
                            String areaOfUse = scanner.nextLine();

                            System.out.println("(String) Enter the type of furniture: ");
                            String typeOfFurniture = scanner.nextLine();

                            System.out.println("(boolean) Is the item modular: ");
                            boolean modular = scanner.nextBoolean();

                            System.out.println("(boolean) Is the item sold in a set: ");
                            boolean soldInSet = scanner.nextBoolean();

                            System.out.println("(int) Enter the number of feet that the furniture item has: ");
                            int amountOfFeet = scanner.nextInt();

                            System.out.println("(int) Enter the number of people that the furniture item can hold: ");
                            int amountOfPeopleCanHold = scanner.nextInt();

                            System.out.println("(double) Enter the length : ");
                            double length = scanner.nextDouble();

                            System.out.println("(double) Enter the width : ");
                            double width = scanner.nextDouble();

                            // Adds cleaning supply to the store inventory
                            getHouseholdItemInventory()[getHouseholdItemInventoryCount()] = new Furniture(int itemID, String name, double price, int quantity, double weight, String material, String areaOfUse, String typeOfFurniture, boolean modular, boolean soldInSet, int amountOfFeet, int amountOfPeopleCanHold, double length, double width);

                            // Increments the count for the number of household items in the store inventory
                            incrementHouseholdItemInventoryCount();
                        }
                        break;
                   }
    }


    public static void main(String[] args) {


        WQSDevoreWesleyWilkersonSmith store = new WQSDevoreWesleyWilkersonSmith(); // Initialize store object
        store.addInventoryHardCoded(); // Add hardcoded items to the respective inventory
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
