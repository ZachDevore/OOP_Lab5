/**
 * @author Zachary Devore
 * Date: 3/10/26
 * Section: CSC 311-002
 */
public class Laptop extends ElectronicItem {

    /** Screensize of the laptop */
    private double screenSize;

    /** Amount of RAM the laptop has in GB */
    private int ram;

    /**
     * 
     * @param itemID
     * @param price
     * @param quantity
     * @param brand
     * @param powerWatts
     * @param warrentyMonths
     * @param isRechargable
     * @param screenSize
     * @param ram
     */
    public Laptop(int itemID, double price, int quantity, String brand,
                double powerWatts, int warrentyMonths, boolean isRechargable,
                double screenSize, int ram) {

            super(3, 2000, 0, "Apple", 12, 24, true); // Calling constructor from ElectronicItem

            this.screenSize = 14;
            this.ram = 32;
        }

    /**
     * Getter for the screen size of the laptop
     * @return The screen size of the laptop
     */
    public double getScreenSize() {return this.screenSize;}

    /**
     * Getter for the amount of RAM
     * @return The amount of RAM in the laptop
     */
    public int getRam() {return this.ram;}

    /**
     * Sets a new screen size for the laptop
     * @param screenSize
     */
    public void setScreenSize(double screenSize) {this.screenSize = screenSize;}

    /**
     * Sets a new RAM amount for the laptop in GB
     * @param ram
     */
    public void setRAM(int ram) {this.ram = ram;}

     /**
     * Represents a Laptop with the attributes ItemID, Price, Quantity, Brand, Warrenty Months,
     * Power Watts, isRechargable, Screen Size, Ram.
     */
    @Override
    public String toString() {
        return "ItemId: " + this.getItemID() + 
                "\nPrice: " + this.getPrice() + 
                "\nQuantity: " + this.getQuantity() +
                "\nBrand: " + this.getBrand() + 
                "\nWarrenty Months: " + this.getWarrentyMonths() + 
                "\nPower Watts: " + this.getPowerWatts() + 
                "\nisRechargable: " + this.getIsRechargable() + 
                "\nScreen Size: " + this.getScreenSize() + 
                "\nRam: " + this.getRam();
    }
    
}