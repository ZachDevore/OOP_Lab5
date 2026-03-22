/**
 * Author: Ryan Smith
 * Date: 3/13/2026
 * Section: CSC 311-002
 */

public class Fruit extends FoodItem {

    // Does the fruit have a peel?
    private boolean hasPeel;

    // Is the fruit sweet?
    private boolean isSweet;

    // What shape is the fruit?
    private String shape;

    /**
     * Initialize new instance of food item
     * @param itemID
     * @param price
     * @param quantity
     * @param calories
     * @param expirationDate
     * @param color
     * @param hasSeeds
     * @param hasPeel
     * @param isSweet
     * @param shape
     */
    public Fruit(int itemID, String name, double price, int quantity, int calories,
                 int expirationDate, String color, boolean hasSeeds, boolean hasPeel,
                 boolean isSweet, String shape){

        //call constructor of food item
        super(itemID, name, price, quantity, calories, expirationDate, color, hasSeeds);

        this.shape = shape;
        this.hasPeel = hasPeel;
        this.isSweet = isSweet;
    }

    //Accessors

    /**
     * Accessor for hasPeel
     * @return hasPeel
     */
    public boolean getHasPeel() {return hasPeel;}

    /**
     * Accessor for isSweet
     * @return isSweet
     */
    public boolean getIsSweet() {return isSweet;}

    /**
     * Accessor for shape
     * @return shape
     */
    public String getShape() {return shape;}


    //Mutator

    /**
     * Mutator for hasPeel
     * @param hasPeel
     */
    public void setHasPeel(boolean hasPeel) {this.hasPeel = hasPeel;}

    /**
     * Mutator for isSweet
     * @param isSweet
     */
    public void setIsSweet(boolean isSweet) {this.isSweet = isSweet;}

    /**
     * Mutator for Shape
     * @param shape
     */
    public void setShape(String shape) {this.shape = shape;}


    /**
     * Creates string to represent a fruit item with attributes:
     * itemID
     * price
     * quantity
     * calories
     * expirationDate
     * color
     * hasSeeds
     * hasPeel
     * isSweet
     * shape
     */

    @Override
    public String toString() {
        return "ItemId: " + this.getItemID() +
                "\nPrice: " + this.getPrice() +
                "\nQuantity: " + this.getQuantity() +
                "\nCalories: " + this.getCalories() +
                "\nExpiration Date: " + this.getExpirationDate() +
                "\nColor: " + this.getColor() +
                "\nHas Seeds: " + this.getHasSeeds() +
                "\nHas Peel: " + this.getHasPeel() +
                "\nIs Sweet: " + this.getIsSweet() +
                "\nShape: " + this.getShape();
    }

}