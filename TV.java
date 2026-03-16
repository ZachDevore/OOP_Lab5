/**
 * @author Zachary Devore
 * Date: 3/13/26
 * Section: CSC 311-002
 */
public class TV extends ElectronicItem {

    /** Weather is not the TV is a smart TV */
    private boolean isSmart;

    /** Weather or not the TV is compatable with a vesa mount */
    private boolean isVesaCombatiable;

    /**
     * 
     * @param itemID
     * @param price
     * @param quantity
     * @param brand
     * @param powerWatts
     * @param warrentyMonths
     * @param isRechargable
     * @param isSmart
     * @param vesaCombatiable
     */
    public TV() {

        super(2, 300.00, 0, "Samsung", 12, 12, false); // Calling constructor from ElectronicItem

        this.isSmart = true;
        this.isVesaCombatiable = true;
    }

    /** @return Whether or not the TV is smart or not */
    public boolean getIsSmart() {return this.isSmart;}

    /** @return Whether or not the TV is VESA compatable */
    public boolean getIsVesaCompatable() {return this.isVesaCombatiable;}

    /**
     * Sets whether or not the TV is smart
     * @param isSmart
     */
    public void setIsSmart(boolean isSmart) {this.isSmart = isSmart;}

    /**
     * Sets whether or not the TV is VESA compatable
     * @param isVesaCompatable
     */
    public void setIsVesaCompatable(boolean isVesaCompatable) {this.isVesaCombatiable = isVesaCompatable;}

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
                "\nVesa Compatable: " + this.getIsVesaCompatable();
    }

}