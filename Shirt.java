/**
 * @author thomaswesley
 * date: 3/13/26
 * section: 331-002
 */


public class Shirt extends ClothingItem{
    private String sleeve_type;
    private String material;


    /**
     * @param itemID
     * @param brand
     * @param color
     * @param price
     * @param quantity
     * @param size
     */

    public Shirt(int itemID, String name, double price, int quantity,String brand, String size, String color, String sleeve_type, String material){

        super(itemID, name, price, quantity, brand, size, color);

        this.sleeve_type = sleeve_type;
        this.material = material;
    }

    public String getMaterial() {return material;}

    public String getSleeve_type() {return sleeve_type;}

    public void setMaterial(String material) {this.material = material;}

    public void setSleeve_type(String sleeve_type) {this.sleeve_type = sleeve_type;}

    @Override
    public String toString(){
        return "ItemId" + this.getItemID() +
                "\nPrice" + this.getPrice() +
                "\nQuantity" + this.getQuantity() +
                "\nBrand" + this.getBrand() +
                "\nColor" + this.getColor() +
                "\nSize" + this.getSize() +
                "\nSleeve Type" + this.getSleeve_type() +
                "\n Material" + this.getMaterial();
    }


}