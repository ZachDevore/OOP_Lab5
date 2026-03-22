/**
 * @author Zachary Devore
 * Date: 3/9/26
 * Section: CSC 311-002
 */
public class StoreItem {
    
    /** Unique id for each item in the store */
    private int itemID;

    /** Name of the item */
    private String name;

    /** Price for each item in the store */
    private double price;

    /** Quantity of each item in the store */
    private int quantity;

    /**
     * Creates a new instance of StoreItem
     * @param itemID
     * @param price
     * @param quantity
     */
    public StoreItem(int itemID, String name, double price, int quantity) {
        this.itemID = itemID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Getter for ItemID
     * @return the ItemID of an item
     */
    public int getItemID() {return this.itemID;}

    /**
     * Getter for name
     * @return
     */
    public String getName() {return this.name;}

    /**
     * Getter for price
     * @return the price of an item
     */
    public double getPrice() {return this.price;}

    /**
     * Getter for quantity
     * @return The quantity of the items in the store
     */
    public int getQuantity() {return this.quantity;}


    /**
     * set the itemID
     * @param itemID 
     */
    public void setItemID(int itemID) {this.itemID = itemID;}

    /**
     * set the name
     * @param name
     */
    public void setName(String name) {this.name = name;}

    /**
     * set the price
     * @param price
     */
    public void setPrice(double price) {this.price = price;}

    /**
     * set the quantity
     * @param quantity
     */
    public void setQuantity(int quantity) {this.quantity = quantity;}

}