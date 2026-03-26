/**
 * HouseholdItem represents general household products sold in the store.
 * It extends StoreItem and adds attributes specific to household goods.
 */
public class HouseholdItem extends ShelfStable {

    /** Weight of the household item */
    private double weight;

    /** Material the item is made of */
    private String material;

    /** Area where the item is typically used (kitchen, bathroom, etc.) */
    private String areaOfUse;

    /**
     * Creates a new HouseholdItem
     * @param itemID Unique ID for the item
     * @param price Price of the item
     * @param quantity Quantity available in the store
     * @param weight Weight of the item
     * @param material Material the item is made of
     * @param areaOfUse Area where the item is used
     */
    public HouseholdItem(int itemID, String name, double price, int quantity,
                         double weight, String material, String areaOfUse) {

        super(itemID, name, price, quantity);

        this.weight = weight;
        this.material = material;
        this.areaOfUse = areaOfUse;
    }

    /** @return the weight of the item */
    public double getWeight() { return this.weight; }

    /** @return the material of the item */
    public String getMaterial() { return this.material; }

    /** @return the area where the item is used */
    public String getAreaOfUse() { return this.areaOfUse; }

    /**
     * Setter for Weight
     * @param weight
     */
    public void setWeight(double weight) { this.weight = weight; }

    /**
     * Setter for Material
     * @param material
     */
    public void setMaterial(String material) { this.material = material; }

    /**
     * Setter for areaOfUSe
     * @param areaOfUse
     */
    public void setAreaOfUse(String areaOfUse) { this.areaOfUse = areaOfUse; }
}
