public class Outerwear extends ClothingItem{
    /** Whether a piece of clothing is water proof or not */
    private boolean isWaterproof;

    /** Whether a piece of clothing is reversable or not */
    private boolean isReversible;



    /**
     * @param itemID
     * @param name
     * @param quantity
     * @param price
     * @param brand
     * @param size
     * @param color
     * @param isReversible
     * @param isWaterproof
     */
    public Outerwear(int itemID, String name, int quantity, double price,
                      String brand,  double size,  String color,
                     boolean isReversible, boolean isWaterproof){

        super(itemID,  name, price,  quantity,  brand,  size,  color);

        this.isReversible = isReversible;
        this.isWaterproof = isWaterproof;
    }

    /**
     *Getter for isWaterProof
     * @return isWaterproof
     */
    public boolean getIsWaterproof(){ return this.isWaterproof;}

    /**
     * Getter for isReversable
     * @return
     */
    public boolean getIsReversible() {return this.isReversible;}

    /**
     * Setter for isWaterProof
     * @param isWaterProof
     */
    public void setIsWaterProof(boolean isWaterProof) {this.isWaterproof = isWaterProof;}

    /**
     * Setter for isReversable
     * @param isReversable
     */
    public void setIsReversable(boolean isReversable) {this.isReversible = isReversable;}



}