/**
 * Author: Ryan Smith
 * Date: 3/13/2026
 * Section: CSC 311-002
 */

public class Vegetable extends FoodItem {

    // Is the vegetable a root?
    private boolean isRoot;

    // Is the vegetable a flower?
    private boolean isFlower;

    // Is the vegetable a leaf?
    private boolean isLeaf;

    // Is the vegetable a stem?
    private boolean isStem;

//Constructor
    /**
     * Initialize new instance of food item
     * @param itemID
     * @param price
     * @param quantity
     * @param calories
     * @param expirationDate
     * @param color
     * @param isRoot
     * @param isFlower
     * @param isLeaf
     * @param isStem
     */
    public Vegetable(int itemID, String name, double price, int quantity, int calories,
                 int expirationDate, String color, boolean hasSeeds, boolean isRoot, boolean isFlower, boolean isLeaf, boolean isStem){

        //call constructor of food item
        super(itemID, name, price, quantity, calories, expirationDate, color, hasSeeds);

        this.isRoot = isRoot;
        this.isFlower = isFlower;
        this.isLeaf = isLeaf;
        this.isStem = isStem;
    }


//Accessors

    /**
     * Accessor for isRoot
     * @return isRoot
     */
    public boolean getIsRoot(){return isRoot;}

    /**
     * Accessor for isFlower
     * @return isFlower
     */
    public boolean getIsFlower(){return isFlower;}

    /**
     * Accessor for isLeaf
     * @return isLeaf
     */
    public boolean getIsLeaf(){return isLeaf;}

    /**
     * Accessor for isStem
     * @return isStem
     */
    public boolean getIsStem(){return isStem;}


//Mutators

    /**
     * Mutator for isRoot
     * @param isRoot
     */
    public void setIsRoot(boolean isRoot){this.isRoot = isRoot;}

    /**
     * Mutator for isFlower
     * @param isFlower
     */
    public void setIsFlower(boolean isFlower){this.isFlower = isFlower;}

    /**
     * Mutator for isLeaf
     * @param isLeaf
     */
    public void setIsLeaf(boolean isLeaf){this.isLeaf = isLeaf;}

    /**
     * Mutator for isStem
     * @param isStem
     */
    public void setIsStem(boolean isStem){this.isStem = isStem;}


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
                "\nIs Root: " + this.getIsRoot() +
                "\nIs Flower: " + this.getIsFlower() +
                "\nIs Leaf: " + this.getIsLeaf() +
                "\nIs Stem: " + this.getIsStem();
    }
}