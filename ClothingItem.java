/**
 * @author Thomas Wesley
 * date: 3-10-26
 * Puprose: class for all clothing items in the store.
 */


public class ClothingItem extends StoreItem{

    //brand name of the item
    private String brand;

    //size of the item
    private String size;

    //color of clothing item
    private String color;


    /**
     * Constructor for ClothingItem
     * @param brand
     * @param size
     * @param color
     */
    public ClothingItem(int itemID, String name, double price, int quantity, String brand, String size, String color){

        super(itemID, name, price, quantity);

        this.brand = brand;
        this.size = size;
        this.color = color;
    }


    /**
     * Getter for brand type of the clothing
     * @return  brand
     */
    public String getBrand() {return brand;}

    /**
     * getter the size of the clothing item
     * @return size
     */
    public String getSize() {return size;}

    /**
     * Getter the color of the
     * @return color
     */
    public String getColor() {return color;}


    /**
     * Setter for the brand
     * @param  brand
     */
    public void setBrand(String brand) {this.brand = brand;}

    public void setSize(String size) {this.size = size;}

    public void setColor(String color) {this.color = color;}
}