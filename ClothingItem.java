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
    public ClothingItem(String brand, String size, String color){
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    //getters and setters


    public String getBrand() {return brand;}

    public String getSize() {return size;}

    public String getColor() {return color;}

    public void setBrand(String brand) {this.brand = brand;}

    public void setSize(String size) {this.size = size;}

    public void setColor(String color) {this.color = color;}
}