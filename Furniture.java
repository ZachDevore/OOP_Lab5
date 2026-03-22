/**
 * Furniture represents furniture items sold in the store.
 * It extends HouseholdItem and includes properties specific to furniture.
 */
public class Furniture extends HouseholdItem {

    /** Type of furniture (chair, table, couch, etc.) */
    private String typeOfFurniture;

    /** Indicates if the furniture is modular */
    private boolean modular;

    /** Indicates if the furniture is sold as part of a set */
    private boolean soldInSet;

    /** Number of feet/legs the furniture has */
    private Integer amountOfFeet;

    /** Number of people the furniture can hold */
    private Integer amountOfPeopleCanHold;

    /** Length of the furniture */
    private Double length;

    /** Width of the furniture */
    private Double width;

    /**
     * Creates a new Furniture item
     * @param itemID Unique ID of the item
     * @param price Price of the item
     * @param quantity Quantity in inventory
     * @param weight Weight of the furniture
     * @param material Material the furniture is made of
     * @param areaOfUse Area where the furniture is used
     * @param typeOfFurniture Type of furniture
     * @param modular Whether it is modular
     * @param soldInSet Whether it is sold as a set
     * @param amountOfFeet Number of feet/legs
     * @param amountOfPeopleCanHold Number of people it can hold
     * @param length Length of the furniture
     * @param width Width of the furniture
     */
    public Furniture(int itemID, String name, double price, int quantity,
                     double weight, String material, String areaOfUse,
                     String typeOfFurniture, boolean modular, boolean soldInSet,
                     Integer amountOfFeet, Integer amountOfPeopleCanHold,
                     Double length, Double width) {

        super(itemID, name, price, quantity, weight, material, areaOfUse);

        this.typeOfFurniture = typeOfFurniture;
        this.modular = modular;
        this.soldInSet = soldInSet;
        this.amountOfFeet = amountOfFeet;
        this.amountOfPeopleCanHold = amountOfPeopleCanHold;
        this.length = length;
        this.width = width;
    }

    public String getTypeOfFurniture(){ return typeOfFurniture; }
    public boolean getModular(){ return modular; }
    public boolean getSoldInSet(){ return soldInSet; }
    public Integer getAmountOfFeet(){ return amountOfFeet; }
    public Integer getAmountOfPeopleCanHold(){ return amountOfPeopleCanHold; }
    public Double getLength(){ return length; }
    public Double getWidth(){ return width; }

    public void setTypeOfFurniture(String typeOfFurniture){
        this.typeOfFurniture = typeOfFurniture;
    }

    public void setModular(boolean modular){
        this.modular = modular;
    }

    public void setSoldInSet(boolean soldInSet){
        this.soldInSet = soldInSet;
    }

    public void setAmountOfFeet(Integer amountOfFeet){
        this.amountOfFeet = amountOfFeet;
    }

    public void setAmountOfPeopleCanHold(Integer amountOfPeopleCanHold){
        this.amountOfPeopleCanHold = amountOfPeopleCanHold;
    }

    public void setLength(Double length){
        this.length = length;
    }

    public void setWidth(Double width){
        this.width = width;
    }
}
