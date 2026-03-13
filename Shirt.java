/**
 * @author thomaswesley
 * date: 3/13/26
 * section: 331-002
 */


public class Shirt extends ClothingItem{
    private String sleeve_type;
    private String material;


    /**
     * @param itemId
     * @param brand
     * @param color
     * @param price
     * @param quantity
     * @param size
     */

    public Shirt(int itemId, double price, int quantity,String brand, int size, String color){

        super(itemId, price, quantity, brand, size, color)

        this.sleeve_type = sleeve_type;
        this.material = material;
    }

    public String getMaterial() {return material;}

    public String getSleeve_type() {return sleeve_type;}

    public void setMaterial(String material) {this.material = material;}

    public void setSleeve_type(String sleeve_type) {this.sleeve_type = sleeve_type;}


}