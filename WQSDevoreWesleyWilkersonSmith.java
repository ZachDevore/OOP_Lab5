import java.util.Scanner;
public class WQSDevoreWesleyWilkersonSmith {
    
    /** Array of the Store Inventory */
    private  StoreItem[] electricItemInventory;

    private  StoreItem[] clothingItemInventory;

    private  StoreItem[] foodItemInventory;

    private int electricInventoryCount;

    private int clothingItemInventoryCount;

    private int foodItemInventoryCount;




    /** Constructor for the Store */
    public WQSDevoreWesleyWilkersonSmith() {
        this.electricItemInventory = new StoreItem[1000]; // Initialize with a capacity of 1000 items
        this.clothingItemInventory = new StoreItem[1000];
        this.foodItemInventory = new StoreItem[1000];
        
        this.electricInventoryCount = 0;
        this.clothingItemInventoryCount = 0;
        this.foodItemInventoryCount = 0;
    }

    // Getters
    public StoreItem[] getElectricItemInventory() {return this.electricItemInventory;}
    public StoreItem[] getClothingItemInventory() {return this.clothingItemInventory;}
    public StoreItem[] getFoodItemInventory() {return this.foodItemInventory;}

    public int getElectricItemInventoryCount() {return this.electricInventoryCount;}
    public int getClothingItemInventoryCount() {return this.clothingItemInventoryCount;}
    public int getFoodItemInventoryCount() {return this.foodItemInventoryCount;} 

    // Methods to increment count
    public void incrementElectricInventoryItemCount() {
        this.electricInventoryCount++;
    }

    public void incrementClothingItemInventory() {
        this.clothingItemInventoryCount++;
    }

    public void incrementFoodItemInventoryCount() {
        this.foodItemInventoryCount++;
    }




   

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
                        // Adding a Clothing Item
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
                            store.getClothingItemInventory()[store.getClothingItemInventoryCount()] = new Shoe(itemID, brand, color, price, quantity, size, category, isSlipResistant, closureType);

                            store.incrementClothingItemInventory(); // Increment count
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
                            store.getClothingItemInventory()[store.getClothingItemInventoryCount()] = new Shirt(itemID, price, quantity, brand, size, color, sleeveType, material);

                            store.incrementClothingItemInventory();
                            continue; // exit 
                            
                        }
                    case 2:
                        // Adding an ElectricItem
                        System.out.println("Which kind of electric item do you want to sell?\nPress 1 for TV\nPress 2 for Phone\nPress 3 for Laptop");
                        int typeOfElectricItem = scanner.nextInt();

                        switch(typeOfElectricItem) {
                            case 1: {
                                // Add TV
                                System.out.println("(int) Enter the ItemID: ");
                                int itemID = scanner.nextInt();

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

                                store.getElectricItemInventory()[store.getElectricItemInventoryCount()] = new TV(itemID, price, quantity, brand, warrentyMonths, powerWatts, isRechargable, isSmart, isVesaCombatiable);
                                store.incrementElectricInventoryItemCount();
                                continue;
                            }
                            case 2: {
                                // Add Phone
                                 System.out.println("(int) Enter the ItemID: ");
                                int itemID = scanner.nextInt();

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

                                store.getElectricItemInventory()[store.getElectricItemInventoryCount()] = new Phone(itemID, price, quantity, brand, warrentyMonths, powerWatts, isRechargable, os, chargerPort);
                                store.incrementElectricInventoryItemCount();
                                continue;
                            }
                            case 3: {
                                // Add Laptop
                                System.out.println("(int) Enter the ItemID: ");
                                int itemID = scanner.nextInt();

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

                                store.getElectricItemInventory()[store.getElectricItemInventoryCount()] = new Laptop(itemID, price, quantity, brand, warrentyMonths, powerWatts, isRechargable, screenSize, ram);
                                store.incrementElectricInventoryItemCount();
                                continue;
                            }
                        }
                        continue;
                    case 3:
                        // FoodItem
                        System.out.println("What kind of food item would you like to add?\nPress 1 for Fruit\nPress 2 for Vegetable");
                        int fruitToAdd = scanner.nextInt();

                        if (fruitToAdd == 1) { // Add Fruit
                            System.out.println("(int) Enter the ItemID: ");
                            int itemID = scanner.nextInt();

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

                            System.out.println("(boolean) Does the fruit have seeds?");
                            boolean hasSeeds = scanner.nextBoolean();

                            System.out.println("(boolean) Does the fruit have a peel?");
                            boolean hasPeel = scanner.nextBoolean();

                            System.out.println("(boolean) Is the fruit Sweet?");
                            boolean isSweet = scanner.nextBoolean();

                            System.out.println("(String) What is the shape of the fruit?");
                            String shape = scanner.next();

                            store.getFoodItemInventory()[store.getFoodItemInventoryCount()] = new Fruit(itemID, price, quantity, calories, expirationDate, color, hasSeeds, hasPeel, isSweet, shape);
                            store.incrementFoodItemInventoryCount();
                        
                        continue;
                        } else { // Add Vegetable
                            System.out.println("(int) Enter the ItemID: ");
                            int itemID = scanner.nextInt();

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

                            System.out.println("(boolean) Is the Vegetable a root?");
                            boolean isRoot = scanner.nextBoolean();

                            System.out.println("(boolean) Is the Vegetable a flower?");
                            boolean isFlower = scanner.nextBoolean();

                            System.out.println("(boolean) Is the Vegetable a leaf?");
                            boolean isLeaf = scanner.nextBoolean();

                            System.out.println("(boolean) Is the Vegetable a stem?");
                            boolean isStem = scanner.nextBoolean();

                            store.getFoodItemInventory()[store.getFoodItemInventoryCount()] = new Vegetable(itemID, price, quantity, calories, expirationDate, color, flag, isRoot, isFlower, isLeaf, isStem);
                            store.foodItemInventoryCount++;
                            continue;
                        }
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

        scanner.close(); // Close the scanner
    }

    





}
