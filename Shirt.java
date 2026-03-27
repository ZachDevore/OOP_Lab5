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
     * @param name
     * @param price
     * @param quantity
     * @param brand
     * @param size
     * @param color
     */

    public Shirt(int itemID, String name, double price, int quantity,String brand, double size, String color, String sleeve_type, String material){

        super(itemID, name, price, quantity, brand, size, color);

        this.sleeve_type = sleeve_type;
        this.material = material;
    }

    public String getMaterial() {return this.material;}

    public String getSleeve_type() {return this.sleeve_type;}

    public void setMaterial(String material) {this.material = material;}

    public void setSleeve_type(String sleeve_type) {this.sleeve_type = sleeve_type;}

    @Override
    public String toString(){
        return String.format("ItemID: %d\t|\tName: %s\t|\tPrice: %.2f\t|\tQuantity: %d\t|\tBrand: %s\t|\tSize: %s\t|\tColor: %s\t|\tSleeve Type:  %b\t|\tCategory: %s|",
                            getItemID(), getName(), getPrice(), getQuantity(), getBrand(), getSize(), getColor(), getSleeve_type(), getMaterial());

        // return "ItemId" + this.getItemID() +
        //         "\nPrice" + this.getPrice() +
        //         "\nQuantity" + this.getQuantity() +
        //         "\nBrand" + this.getBrand() +
        //         "\nColor" + this.getColor() +
        //         "\nSize" + this.getSize() +
        //         "\nSleeve Type" + this.getSleeve_type() +
        //         "\n Material" + this.getMaterial();
    }


}