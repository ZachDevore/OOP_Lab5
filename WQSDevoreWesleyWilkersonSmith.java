import java.util.Scanner;
public class WQSDevoreWesleyWilkersonSmith {
    
    /** Array of the Electric Item Inventory */
    private  StoreItem[] electricItemInventory;

    /** Array of Clothing Item Inventory */
    private  StoreItem[] clothingItemInventory;

    /** Array of Food Item Inventory */
    private  StoreItem[] foodItemInventory;

    /** Array of Household Item Inventory*/
    private StoreItem[] householdItemInventory;

    /** Array to hold items added to the cart during a sale */
    private StoreItem[] cart;

    /** Tracks the quantity of each item in the cart, index matches cart[] */
    private int[] cartQuantities;

    /** Tracks how many items are currently in the cart */
    private int cartCount;

    /** Keeps track of the number of items in electricItemInventory */
    private int electricInventoryCount;

    /** Keeps track of the number of items in clothingItemInventory */
    private int clothingItemInventoryCount;

    /** Keeps track of the number of items in foodItemInventory */
    private int foodItemInventoryCount;

    /** Keeps track of the number of items in householdItemInventory*/
    private int householdItemInventoryCount;

    /** Constructor for the Store */
    public WQSDevoreWesleyWilkersonSmith() {
        this.electricItemInventory = new StoreItem[1000]; // Initialize with a capacity of 1000 items
        this.clothingItemInventory = new StoreItem[1000]; // Initialize with a capacity of 1000 items
        this.foodItemInventory = new StoreItem[1000]; // Initialize with a capacity of 1000 items
        this.householdItemInventory = new StoreItem[1000];  // Initialize with a capacity of 1000 items
        
        this.electricInventoryCount = 0;
        this.clothingItemInventoryCount = 0;
        this.foodItemInventoryCount = 0;
        this.householdItemInventoryCount = 0;

        this.cart = new StoreItem[100];
        this.cartQuantities = new int[100];
        this.cartCount = 0;

    }

    /** @return the array of electric items in inventory */
    public StoreItem[] getElectricItemInventory() {return this.electricItemInventory;}

    /** @return the array of clothing items in inventory */
    public StoreItem[] getClothingItemInventory() {return this.clothingItemInventory;}

    /** @return the array of food items in inventory */
    public StoreItem[] getFoodItemInventory() {return this.foodItemInventory;}

    /** @ return the array of household items in inventory*/
    public StoreItem[] getHouseholdItemInventory(){ return  this.householdItemInventory;}

    /** @return the number of items in the electric inventory */
    public int getElectricItemInventoryCount() {return this.electricInventoryCount;}

    /** @return the number of clothing items in the inventory */
    public int getClothingItemInventoryCount() {return this.clothingItemInventoryCount;}

    /** @return the number of food items in the inventory */
    public int getFoodItemInventoryCount() {return this.foodItemInventoryCount;}

    /** @return the number of household items in the inventory*/
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

    /** increments the count to reflect the number of household items in the inventory*/
    public void incrementHouseholdItemInventoryCount(){this.householdItemInventoryCount++;}

    /**
     * Matches the name of an item to the items in inventory
     * @param items Inventory array
     * @param itemCount Number of items in inventory
     * @param name The name of the item to be matched
     * @return The matches item
     */
    public StoreItem getStoreItem(StoreItem[] items, int itemCount, String name) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getName().toLowerCase().equals(name.toLowerCase())) { // If item passed equals name pass it's a match
                return items[i];
            }
        }
        return null; // If no items match return null
    }

    public void addInventoryHardCoded() {
        // ++ at the end means it adds to the count after the item is added ++ before means it adds before the item is added

        // Add clothing items
        clothingItemInventory[clothingItemInventoryCount++] = new Shirt(1, "Executive", 25.99, 2, "polo", 18, "black", "short", "cotten");
        clothingItemInventory[clothingItemInventoryCount++] = new Shoe(2, "AirMax", 150.00, 30, "Nike", 10.0, "Black", "BasketBall", false, "lace");
        clothingItemInventory[clothingItemInventoryCount++] = new Outerwear(3, "RainJacket", 10, 89.99, "Columbia", 34, "Navy", true, true);
        // Add electric items
        electricItemInventory[electricInventoryCount++] = new Phone(3, "Iphone", 1000, 100, "Apple", 24, 50, true, "IOS", "USB-C");
        electricItemInventory[electricInventoryCount++] = new Laptop(4, "Macbook", 2500, 50, "Apple", 24, 100, true, 14, 32);
        electricItemInventory[electricInventoryCount++] = new TV(5, "LP-505", 500, 20, "Samsung", 12, 20, false, true, true);

        // Add food items
        foodItemInventory[foodItemInventoryCount++] = new Vegetable(6, "Brocoli", 2, 30, 80, 06132026, "Green", false, false, false, false, true); // I'm pretty sure brocoli is a stem not sure though
        foodItemInventory[foodItemInventoryCount++] = new Vegetable(7, "Kale", 1.99, 40, 20, 06132026, "Green", false, false, false, true, false);

        //Add household items
        householdItemInventory[householdItemInventoryCount++] = new Furniture(8,"Klein",1299.99, 4, 125, "leather", "living room", "Couch", true, true, 5, 4, 72.00, 40 );
        householdItemInventory[householdItemInventoryCount++] = new Furniture(9,"Ralph Lauren",2899.99, 4, 220, "Blend", "Bedroom", "Bed", false, true, 6, 3, 84.00, 72 );


    }

    /**
     * Prints out the items in the inventory
     * @param items the array of items
     * @param itemCount the number of items in the inventory
     */
    public void displayItems(StoreItem[] items, int itemCount) {
            // Hard coding a few instances in the main method so no need to check if the array is empty
            System.out.println("-------------------------------------------------------------------------");
            
            for (int i = 0; i < itemCount; i++) {
                System.out.println(items[i]);
                System.out.println();
            }
           System.out.println("-------------------------------------------------------------------------");
        }

    /**
     * Displays store items in a formatted table with name, price, stock, brand, and return policy.
     * Polymorphism: StoreItem references resolve to subclass types via instanceof at runtime.
     * @param items     the inventory array to display
     * @param itemCount the number of valid items in the array
     */
    public void displayItemsAsTable(StoreItem[] items, int itemCount) {
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("%-15s %-10s %-8s %-12s %-30s%n",
                "Name", "Price", "Stock", "Brand", "Return Policy");
        System.out.println("-------------------------------------------------------------------------");

        for (int i = 0; i < itemCount; i++) {
            StoreItem item = items[i];

            //  instanceof checks subclass type at runtime to get brand
            String brand = "N/A";
            if (item instanceof ElectronicItem)  brand = ((ElectronicItem) item).getBrand();
            else if (item instanceof ClothingItem) brand = ((ClothingItem) item).getBrand();

            // instanceof checks subclass type at runtime to get return policy
            String policy;
            if (item instanceof ElectronicItem)     policy = "Return within 30 days";
            else if (item instanceof ClothingItem)  policy = "Return within 60 days";
            else if (item instanceof FoodItem)      policy = "Return if expired, 7 days";
            else if (item instanceof HouseholdItem) policy = "Return within 45 days";
            else                                    policy = "Contact customer service";

            System.out.printf("%-15s $%-9.2f %-8d %-12s %-30s%n",
                    item.getName(),
                    item.getPrice(),
                    item.getQuantity(),
                    brand,
                    policy);
        }
        System.out.println("-------------------------------------------------------------------------");
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
        return item.getPrice() + calculateSalexTax(item); // Item Price * Sales Tax
    }

    /**
     * Prints the return policy for a given item
     * @param item the item to print the return policy for
     */
    public void printReturnPolicy(StoreItem item) {
        if (item instanceof ElectronicItem) {
            System.out.println("Electronics Return Policy: Electronics can be returned within 30 days with original receipt and packaging.");
        } else if (item instanceof ClothingItem) {
            System.out.println("Clothing Return Policy: Clothing can be returned within 60 days, unworn with original tags attached.");
        } else if (item instanceof FoodItem) {
            System.out.println("Food Return Policy: Food items can only be returned if expired or damaged within 7 days of purchase.");
        } else if (item instanceof HouseholdItem) {
            System.out.println("Household Return Policy: Household items can be returned within 45 days, unused and in original packaging.");
        } else {
            System.out.println("No specific return policy found. Please contact customer service.");
        }
    }

    /**
     * Sell item uses scanner to complete the sales process
     * @param scanner
     * swtich statements are for category selections
     */
    public void sellItem(Scanner scanner){

        //cart count resets for each transaction
        cartCount = 0;

        //choose the category
        System.out.println("which category would you like to sell from\n" +
                "Press 1 for Clothing Item\n" +
                "Press 2 for Electronic Item\n" +
                "Press 3 for Food Item\n" +
                "Press 4 for Household Item");

        int category = scanner.nextInt();

        StoreItem[] inventory;
        int itemCount;

        switch (category) {
            case 1:
                inventory = clothingItemInventory;
                itemCount = clothingItemInventoryCount;
                break;
            case 2:
                inventory = electricItemInventory;
                itemCount = electricInventoryCount;
                break;
            case 3:
                inventory = foodItemInventory;
                itemCount = foodItemInventoryCount;
                break;
            case 4:
                inventory = householdItemInventory;
                itemCount = householdItemInventoryCount;
                break;
            default:
                System.out.println("Invalid Category.");
                return;
        }
        //displays in table format
        displayItemsAsTable(inventory, itemCount);

        // --- Step 3: Loop — add items to cart until user types 'done' ---
        boolean shopping = true;
        while (shopping) {
            System.out.print("\nEnter the name of the item to add to cart (or 'done' to checkout): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("done")) {
                shopping = false;
                continue;
            }

            StoreItem item = getStoreItem(inventory, itemCount, name);
            if (item == null) {
                System.out.println("Item not found. Please try again.");
                continue;
            }

            System.out.print("Enter quantity: ");
            int qty = scanner.nextInt();
            scanner.nextLine(); // clear buffer after nextInt

            if (qty > item.getQuantity()) {
                System.out.println("Not enough stock. Available: " + item.getQuantity());
                continue;
            }

            boolean alreadyInCart = false;
            for (int i = 0; i < cartCount; i++) {
                if (cart[i].getName().equalsIgnoreCase(item.getName())) {
                    cartQuantities[i] += qty;
                    alreadyInCart = true;
                    System.out.println("Updated cart: " + item.getName() + " x" + cartQuantities[i]);
                    break;
                }
            }

            if (!alreadyInCart) {
                cart[cartCount] = item;
                cartQuantities[cartCount] = qty;
                cartCount++;
                System.out.println("Added to cart: " + item.getName() + " x" + qty);
            }
        }

        // --- Validate cart is not empty ---
        if (cartCount == 0) {
            System.out.println("No items in cart. Returning to main menu.");
            return;
        }

        // --- Step 4: Order summary grouped by item type ---
        System.out.println("\n==================== ORDER SUMMARY ====================");

        String[] groups = {"Electronics", "Clothing", "Food", "Other"};
        double grandTotal = 0;

        for (String group : groups) {
            boolean headerPrinted = false;

            for (int i = 0; i < cartCount; i++) {
                StoreItem item = cart[i];

                //instanceof resolves subclass type at runtime
                boolean matches =
                        (group.equals("Electronics") && item instanceof ElectronicItem)  ||
                                (group.equals("Clothing")    && item instanceof ClothingItem)    ||
                                (group.equals("Food")        && item instanceof FoodItem)        ||
                                (group.equals("Other")       && !(item instanceof ElectronicItem)
                                        && !(item instanceof ClothingItem)
                                        && !(item instanceof FoodItem));

                if (matches) {
                    if (!headerPrinted) {
                        System.out.println("\n  [ " + group + " ]");
                        headerPrinted = true;
                    }

                    int qty = cartQuantities[i];
                    // calculatePrice applies correct tax rate via instanceof at runtime
                    double priceWithTax = calculatePrice(item);
                    double lineTotal = priceWithTax * qty;
                    grandTotal += lineTotal;

                    System.out.printf("  %-15s x%-3d  $%.2f each  =>  $%.2f%n",
                            item.getName(), qty, priceWithTax, lineTotal);
                }
            }
        }

        System.out.printf("%n  Grand Total: $%.2f%n", grandTotal);
        System.out.println("=======================================================");

        // Confirm checkout

        System.out.print("\nConfirm checkout? (yes/no): ");
        String confirm = scanner.nextLine();
        //scanner.nextLine();


        if (!confirm.equalsIgnoreCase("yes")) {
            System.out.println("Checkout cancelled. Returning to main menu.");
            return;
        }

        // Deduct sold quantities from inventory
        for (int i = 0; i < cartCount; i++) {
            StoreItem item = cart[i];
            item.setQuantity(item.getQuantity() - cartQuantities[i]);
            if (item.getQuantity() == 0) {
                System.out.println("Warning: " + item.getName() + " is now out of stock.");
            }
        }

        System.out.println("\nThank you for your purchase!");

        // Print return policies (once per category purchased)

        System.out.println("\n--- Return Policies for Your Purchase ---");
        boolean printedElec = false, printedCloth = false, printedFood = false;
        for (int i = 0; i < cartCount; i++) {
            StoreItem item = cart[i];
            if (item instanceof ElectronicItem && !printedElec) {
                printReturnPolicy(item);
                printedElec = true;
            } else if (item instanceof ClothingItem && !printedCloth) {
                printReturnPolicy(item);
                printedCloth = true;
            } else if (item instanceof FoodItem && !printedFood) {
                printReturnPolicy(item);
                printedFood = true;
            }
        }

        //  Display updated inventory after sale
        System.out.println("\n--- Updated Inventory ---");
        displayItemsAsTable(inventory, itemCount);
    }

    public void addQuantity(StoreItem[] inventory, String name, Scanner scanner, int itemCount) {
        System.out.println("How much inventory would you like to add? ");
        int quantity = scanner.nextInt();

        StoreItem itemtoAddQuantityTo = getStoreItem(inventory, itemCount, name);

        itemtoAddQuantityTo.setQuantity(itemtoAddQuantityTo.getQuantity() + quantity); // Current quantity + quantity added
    }

    /**
     * Adds a item to the store inventory
     * @param scanner
     */
    public void addInventory(Scanner scanner) {
        System.out.println(
        "Which kind of item would you like to add?\n" +
        " Press 1 for Clothing Item\n" +
        " Press 2 for Electronic Item\n" +
        " Press 3 for Food Item\n" +
        " Press 4 for Household Item\n " +
        " Press 0 to stop adding items\n");

        int userChoice;

        int typeOfItem = scanner.nextInt();

         switch (typeOfItem) {
                    case 1: // Adding a Clothing Item
                        displayItems(clothingItemInventory, clothingItemInventoryCount); // Prints out the items the inventory

                        System.out.println("Press 1 to add to an existing item and 2 to add a new item: ");
                        userChoice = scanner.nextInt();
                        if (userChoice == 1) {
                            System.out.println("What is the name of the item you want to add");
                            String name = scanner.nextLine();
                            scanner.nextLine();
                            addQuantity(clothingItemInventory, name, scanner, clothingItemInventoryCount);
                        } else {

                        
                        System.out.println("Which kind of Clothing Item would you like to add?\nPress 1 for Shoe, Press 2 for Shirt\nPress 3 for Outerwear:");
                        int typeOfClothingItem = scanner.nextInt();
                        scanner.nextLine(); //


                        if (typeOfClothingItem == 1) { // Add Shoe

                            System.out.print("(int) Enter ItemID: ");
                            int itemID = scanner.nextInt();
                            scanner.nextLine(); //


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
                            scanner.nextLine();

                            System.out.print("(double) Enter the Size: ");
                            double size = scanner.nextDouble();

                            System.out.print("(String) Enter the Category: ");
                            String category = scanner.nextLine();

                            System.out.print("(boolean) Enter weather is slip resistant: ");
                            boolean isSlipResistant = scanner.nextBoolean();

                            System.out.print("(String) Enter the Closure type: ");
                            String closureType = scanner.nextLine();

                            getClothingItemInventory()[getClothingItemInventoryCount()] = new Shoe(itemID, name, price, quantity, brand, size, color, category, isSlipResistant, closureType);                            incrementClothingItemInventory(); // Increment count for number of clothingItems in inventory
                            displayItemsAsTable(clothingItemInventory, clothingItemInventoryCount);//dislays updated item
                            return; // exit

                        } else { // Add Shirt
                            System.out.print("(int) Enter ItemID: ");
                            int itemID = scanner.nextInt();
                            scanner.nextLine();

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
                            scanner.nextLine();

                            System.out.print("(String) Enter the Size: ");
                            double size = scanner.nextDouble();

                            System.out.print("(String) Enter the type of sleeve: ");
                            String sleeveType = scanner.nextLine();

                            System.out.print("(String) Enter the type of material: ");
                            String material = scanner.nextLine();

                            getClothingItemInventory()[getClothingItemInventoryCount()] = new Shirt(itemID, name, price, quantity, brand, size, color, sleeveType, material); // Adds Shirt
                           
                            incrementClothingItemInventory(); // increment count for number of clothing items in inventory
                            displayItemsAsTable(clothingItemInventory, clothingItemInventoryCount);//dislays updated item
                            return; // exit 
                        }
                        }
                    case 2: // Adding an ElectricItem
                        displayItems(electricItemInventory, electricInventoryCount); // Displays the items in the electric inventory

                        System.out.println("Press 1 to add to an existing item and 2 to add a new item: ");
                        userChoice = scanner.nextInt();

                        if (userChoice == 1) {
                            System.out.println("What is the name of the item you want to add");
                            String name = scanner.nextLine();
                            addQuantity(electricItemInventory, name, scanner, electricInventoryCount);
                        } else {
                        System.out.println("Which kind of electric item do you want to sell?\nPress 1 for TV\nPress 2 for Phone\nPress 3 for Laptop");
                        int typeOfElectricItem = scanner.nextInt();

                        switch(typeOfElectricItem) {
                            case 1: {
                                // Add TV
                                System.out.println("(int) Enter the ItemID: ");
                                int itemID = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("(String) Enter the Name: ");
                                String name = scanner.nextLine();


                                System.out.println("(double) Enter the price $");
                                double price = scanner.nextDouble();

                                System.out.println("(int) Enter the quantity: ");
                                int quantity = scanner.nextInt();
                                scanner.nextLine();

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
                                displayItemsAsTable(electricItemInventory, electricInventoryCount);//displays updated inventory
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
                                scanner.nextLine();

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
                                displayItemsAsTable(electricItemInventory, electricInventoryCount);//displays updated inventory
                                return;
                            }
                            case 3: { // Add Laptop
                                System.out.println("(int) Enter the ItemID: ");
                                int itemID = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("(String) Enter the Name: ");
                                String name = scanner.nextLine();

                                System.out.println("(double) Enter the price $");
                                double price = scanner.nextDouble();

                                System.out.println("(int) Enter the quantity: ");
                                int quantity = scanner.nextInt();
                                scanner.nextLine();

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

                                incrementElectricInventoryItemCount();// Increments the count for number of electric items in the store
                                displayItemsAsTable(electricItemInventory, electricInventoryCount);//displays updated inventory
                                return;
                            }
                            
                        }
                    }
                        break;
                    case 3: // Add Food Item
                        displayItems(foodItemInventory, foodItemInventoryCount); // displays the items in the food inventory

                        System.out.println("Press 1 to add to an existing item and 2 to add a new item: ");
                        userChoice = scanner.nextInt();
                        if (userChoice == 1) {
                            System.out.println("What is the name of the item you want to add");
                            String name = scanner.nextLine();
                            addQuantity(foodItemInventory, name, scanner, foodItemInventoryCount); 
                        } else {

                        
                        System.out.println("What kind of food item would you like to add?\nPress 1 for Fruit\nPress 2 for Vegetable");
                        int fruitToAdd = scanner.nextInt();

                        if (fruitToAdd == 1) { // Add Fruit
                            System.out.println("(int) Enter the ItemID: ");
                            int itemID = scanner.nextInt();
                            scanner.nextLine();

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

                            incrementFoodItemInventoryCount();// Increments the count for number of food items in the store inventory
                            displayItemsAsTable(foodItemInventory, foodItemInventoryCount);//dislays updated item
                        
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
                    }
             case 4:
                 displayItems(householdItemInventory, householdItemInventoryCount);

                 System.out.println("Press 1 to add to an existing item and 2 to add a new item: ");
                 userChoice = scanner.nextInt();

                 if (userChoice == 1) {
                     System.out.println("What is the name of the item you want to add: ");
                     String name = scanner.nextLine();
                     scanner.nextLine();
                     addQuantity(householdItemInventory, name, scanner, householdItemInventoryCount);
                 } else {
                     System.out.print("(int) Enter ItemID: ");
                     int itemID = scanner.nextInt();

                     System.out.print("(String) Enter the Name: ");
                     String name = scanner.nextLine();

                     System.out.print("(double) Enter the Price: $");
                     double price = scanner.nextDouble();

                     System.out.print("(int) Enter the Quantity: ");
                     int quantity = scanner.nextInt();

                     System.out.print("(double) Enter the Weight: ");
                     double weight = scanner.nextDouble();

                     System.out.print("(String) Enter the Material: ");
                     String material = scanner.nextLine();

                     System.out.print("(String) Enter the Area of Use: ");
                     String areaOfUse = scanner.nextLine();

                     getHouseholdItemInventory()[getHouseholdItemInventoryCount()] =
                             new HouseholdItem(itemID, name, price, quantity, weight, material, areaOfUse);

                     incrementHouseholdItemInventoryCount();
                     displayItemsAsTable(householdItemInventory, householdItemInventoryCount);
                 }
                 break;
                   }
    }




   

    public static void main(String[] args) {

        System.out.println("Welcome to the Wilmington Quick Shop!");

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
                    store.sellItem(scanner);
                    break;
                case 0:
                    flag = true;
                    break;
            }
        } while (!flag); // until the flag is triggered the program will keep prompting the user

        scanner.close(); // Close the scanner
    }

    





}
