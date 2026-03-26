import java.util.Arrays;

/**
 * Class representing a cleaning item
 */
public class CleaningSupply extends HouseholdItem {

    /** Chemicals contained in the cleaning item */
    private String[] chemicalsContained;

    /** Whether the cleaning item is toxic or not */
    private boolean toxic;

    /** Whether the cleaning item is flammale */
    private boolean flammable;

    /**
     * Constructor
     * @param itemID
     * @param name
     * @param price
     * @param quantity
     * @param weight
     * @param material
     * @param areaOfUse
     * @param chemicalsContained
     * @param toxic
     * @param flammable
     */
    public CleaningSupply(int itemID, String name, double price, int quantity,
                          double weight, String material, String areaOfUse,
                          String[] chemicalsContained,
                          boolean toxic, boolean flammable){

        super(itemID, name, price, quantity, weight, material, areaOfUse);

        this.chemicalsContained = chemicalsContained;
        this.toxic = toxic;
        this.flammable = flammable;
    }

    /**
     * Getter for chemicalsContained
     * @return The chemicals contained in the cleaning item
     */
    public String[] getChemicalsContained(){ return this.chemicalsContained; }

    /**
     * Getter for isToxic
     * @return Whether the item is toxic or not
     */
    public boolean isToxic(){ return this.toxic; }

    /**
     * Getter for isFlammable
     * @return Whether the item is flammable or not
     */
    public boolean isFlammable(){ return this.flammable; }

    /**
     * Setter for chemicalsContained
     * @param chemicalsContained
     */
    public void setChemicalsContained(String[] chemicalsContained){
        this.chemicalsContained = chemicalsContained;
    }

    /**
     * Setter for isToxic
     * @param toxic
     */
    public void setToxic(boolean toxic){
        this.toxic = toxic;
    }

    /**
     * Setter for isFlammable
     * @param flammable
     */
    public void setFlammable(boolean flammable){
        this.flammable = flammable;
    }

    /**
     * String representation of a cleaning item
     */
    @Override
    public String toString() {
        return String.format("ItemID: %d| Name: %s| Price: $%.2f| Quantity: %d| Weight: %.2f| Material: %s| Area of Use: %s| ChemicalsContained: %s, Is toxic? %b| Is flammable? %b", 
                    getItemID(), getName(), getPrice(), getQuantity(), getWeight(), getMaterial(), getAreaOfUse(), Arrays.toString(getChemicalsContained()), isToxic(), isFlammable());
    }
}
