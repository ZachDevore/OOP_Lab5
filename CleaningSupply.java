/**
 * CleaningSupply represents cleaning products sold in the store.
 * It extends HouseholdItem and includes properties related to chemical safety.
 */
import java.util.Arrays;
public class CleaningSupply extends HouseholdItem {

    /** List of chemicals contained in the cleaning supply */
    private String[] chemicalsContained;

    /** Indicates whether the product is toxic */
    private boolean toxic;

    /** Indicates whether the product is flammable */
    private boolean flammable;

    /**
     * Creates a new CleaningSupply item.
     *
     * @param itemID Unique ID of the item
     * @param name Name of the item
     * @param price Price of the item
     * @param quantity Quantity in inventory
     * @param weight Weight of the item
     * @param material Material of the container or product
     * @param areaOfUse Area where the product is used
     * @param chemicalsContained Array of chemicals in the product
     * @param toxic Whether the product is toxic
     * @param flammable Whether the product is flammable
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
     * Gets the chemicals contained in the cleaning supply.
     * @return an array of chemical names
     */
    public String[] getChemicalsContained(){ return chemicalsContained; }

    /**
     * Checks if the product is toxic.
     * @return true if toxic, false otherwise
     */
    public boolean isToxic(){ return toxic; }

    /**
     * Checks if the product is flammable.
     * @return true if flammable, false otherwise
     */
    public boolean isFlammable(){ return flammable; }

    /**
     * Sets the chemicals contained in the product.
     * @param chemicalsContained array of chemical names
     */
    public void setChemicalsContained(String[] chemicalsContained){
        this.chemicalsContained = chemicalsContained;
    }

    /**
     * Sets whether the product is toxic.
     * @param toxic true if toxic, false otherwise
     */
    public void setToxic(boolean toxic){
        this.toxic = toxic;
    }

    /**
     * Sets whether the product is flammable.
     * @param flammable true if flammable, false otherwise
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
