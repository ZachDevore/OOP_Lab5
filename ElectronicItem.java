/**
 * @author Zachary Devore
 * Date: 3/9/26
 * Section: CSC 311-002
 */
public class ElectronicItem extends StoreItem {
    
    /** Brandname of the Item */
    private String brand;

    /** Number of months the warrenty covers */
    private int warrantyMonths;

    /** the power usage of the device in Watts */
    private double powerWatts;

    /** Wheather or not the item is rechargable */
    private boolean isRechargeable;

    /**
     * Initialize a new instance of Electronic Item
     * @param itemID
     * @param price
     * @param quantity
     * @param brand
     * @param warrantyMonths
     * @param powerWatts
     * @param isRechargeable
     */
    public ElectronicItem(int itemID, String name, double price, int quantity,
                        String brand, int warrantyMonths, double powerWatts, boolean isRechargeable) {

        super(itemID, name, price, quantity); // Calling the constructor from StoreItem

        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
        this. powerWatts = powerWatts;
        this.isRechargeable = isRechargeable;
    }

    /**
     * Getter for the brand
     * @return the brand name of the item
     */
    public String getBrand() {return this.brand;}

    /**
     * Getter for the warrenty
     * @return number of months the warrenty covers
     */
    public int getWarrentyMonths() {return this.warrantyMonths;}

    /**
     * Getter for the power usage
     * @return power usage in Watts
     */
    public double getPowerWatts() {return this.powerWatts;}

    /**
     * Getter for wheather the item is rechargable or not
     * @return wheather the item is rechargable
     */
    public boolean getIsRechargable() {return this.isRechargeable;}

    /**
     * Sets the brand of the item
     * @param brand
     */
    public void setBrand(String brand) {this.brand = brand;}

    /**
     * Sets the warrenty months of the item
     * @param warrentyMonths
     */
    public void setWarrentyMonths(int warrentyMonths) {this.warrantyMonths = warrentyMonths;}

    /**
     * Sets the power usage of the item
     * @param powerWatts
     */
    public void setpowerWatts(double powerWatts) {this.powerWatts = powerWatts;}

    /**
     * sets if the item is rechargable
     * @param isRechargable
     */
    public void setIsRechargable(boolean isRechargable) {this.isRechargeable = isRechargable;}


}