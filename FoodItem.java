/**
 * Author: Ryan Smith
 * Date: 3/13/2026
 * Section: CSC 311-002
 */

public class FoodItem extends StoreItem {

    //number of calories per item unit
    private int calories;

    //expiration date of item in format YYYYMMDD
    private int expirationDate;

    //determine if the food item has seeds (vegetable vs fruit)
    private boolean hasSeeds;

    // What color is the fruit?
    private String color;

    /**
     * Initialize new instance of food item
     * @param itemID
     * @param price
     * @param quantity
     * @param calories
     * @param expirationDate
     * @param hasSeeds
     */
    public FoodItem(int itemID, double price, int quantity, int calories,
                    int expirationDate, String color, boolean hasSeeds) {

        //call constructor of StoreItem
        super(itemID, price, quantity);

        this.calories = calories;
        this.expirationDate = expirationDate;
        this.hasSeeds = hasSeeds;
        this.color = color;
    }

    //Accessors

    /**
     * Return the calories attribute
     * @return calories
     */
    public int getCalories() {return this.calories;}

    /**
     * Return expiration date attribute
     * @return expirationDate
     */
    public int getExpirationDate() {return this.expirationDate;}

    /**
     * Return if the item has seeds or not
     * @return hasSeeds
     */
    public boolean getHasSeeds() {return this.hasSeeds;}

    /**
     * Accessor for color
     * @return color
     */
    public String getColor() {return this.color;}


    //Mutators

    /**
     * Set the number of calories for the food item
     * @param calories
     */
    public void setCalories(int calories) {this.calories = calories;}

    /**
     * Set the expiration date of the food item (format YYYYMMDD)
     * @param expirationDate
     */
    public void setExpirationDate(int expirationDate) {this.expirationDate = expirationDate;}

    /**
     * Set the boolean attribute to determine if the food item has seeds
     * @param hasSeeds
     */
    public void setHasSeeds(boolean hasSeeds) {this.hasSeeds = hasSeeds;}

    /**
     * Mutator for color
     * @param color
     */
    public void setColor(String color) {this.color = color;}

}