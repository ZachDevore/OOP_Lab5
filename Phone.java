/**
 * @author Zachary Devore
 * Date: 3/13/26
 * Section: CSC 311-002
 */
public class Phone extends ElectronicItem {

    /** Operating System the phone uses */
    private String os;

    /** The kind of port the phone uses to charge */
    private String chargerPort;

   /**
    * Constructor for Iphone
    */
    public Phone(int itemID, double price, int quantity,
                String brand, int warrantyMonths, double powerWatts, boolean isRechargeable,
                String os, String chargerPort) {

       super(itemID, price, quantity, brand, warrantyMonths, powerWatts, isRechargeable); // Calling constructor from ElectronicItem

       this.os = os;
       this.chargerPort = chargerPort;
    }

    /**
     * Retrieves the phones operating system
     * @return the phones operating system
     */
    public String getOs() {return this.os;}

    /**
     * Retrieves the phones charger port
     * @return the charger port of the phone
     */
    public String getChargerPort() {return this.chargerPort;}

    /**
     * Sets the operating system of the phone
     * @param os
     */
    public void setOs(String os) {this.os = os;}

    /**
     * Sets the chargerPort of the phone
     * @param chargerPort
     */
    public void setChargerPort(String chargerPort) {this.chargerPort = chargerPort;}

    /**
     * Represents a Phone with the attributes ItemID, Price, Quantity, Brand, Warrenty Months,
     * Power Watts, isRechargable, Operating System, Charger Port.
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
                "\nOperating System: " + this.getOs() + 
                "\nCharger Port: " + this.getChargerPort();
    }





}