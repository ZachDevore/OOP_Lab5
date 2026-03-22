/**
 * @author Zachary Devore
 * Date: 3/13/26
 * Section: CSC 311-002
 */
public class TV extends ElectronicItem {

    /** Whether is not the TV is a smart TV */
    private boolean isSmart;

    /** Whether or not the TV is compatible with a vesa mount */
    private boolean isVesaCompatible;

    /**
     * Constructor for a Samsung TV
     */
    public TV(int itemID, String name, double price, int quantity,
            String brand, int warrentyMonths, double powerWatts, boolean isRechargeable,
            boolean isSmart, boolean isVesaCompatible) {

        super(itemID, name, price, quantity, brand, warrentyMonths, powerWatts, isRechargeable); // Calling constructor from ElectronicItem

        this.isSmart = isSmart;
        this.isVesaCompatible = isVesaCompatible;
    }

    /** @return Whether or not the TV is smart or not */
    public boolean getIsSmart() {return this.isSmart;}

    /** @return Whether or not the TV is VESA compatible */
    public boolean getIsVesaCompatible() {return this.isVesaCompatible;}

    /**
     * Sets whether or not the TV is smart
     * @param isSmart
     */
    public void setIsSmart(boolean isSmart) {this.isSmart = isSmart;}

    /**
     * Sets whether or not the TV is VESA compatable
     * @param isVesaCompatable
     */
    public void setIsVesaCompatible(boolean isVesaCompatible) {this.isVesaCompatible= isVesaCompatible;}

     /**
     * Represents a TV with the attributes ItemID, Price, Quantity, Brand, Warrenty Months,
     * Power Watts, isRechargable, isSmart, isVesaCompatable.
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
                "\nIsSmart: " + this.getIsSmart() + 
                "\nVesa Compatible: " + this.getIsVesaCompatible();
    }

}
