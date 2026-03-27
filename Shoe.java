/**
 * @author thomaswesley
 * Date: 3/16/2026
 * Section: 331-002
 * Purpose:
 */




public class Shoe extends ClothingItem{
    private String category;
    private boolean isSlip_resistant;
    private String closure_type;

    /**
     * @param itemID
     * @param name
     * @param price
     * @param quantity
     * @param brand
     * @param size
     * @param color
     * @param category
     * @param isSlip_resistant
     * @param closure_type
     */
    public Shoe(int itemID, String name,double price, int quantity,String brand, double size,String color,
                  String category, boolean isSlip_resistant,
                String closure_type){

        super(itemID, name, price, quantity, brand, size, color);

        this.category = category;
        this.isSlip_resistant = isSlip_resistant;
        this.closure_type = closure_type;
    }

    //getters and setters

    public String getCategory(){return this.category;}

    public boolean getIsSlip_Resistant(){return this.isSlip_resistant;}

    public String getClosure_Type(){return this.closure_type;}

    public void setCategory(String category){this.category = category;}

    public void setIsSlip_Resistant(boolean isSlip_resistant){this.isSlip_resistant = isSlip_resistant;}

    public void setClosure_type(String closure_type) {this.closure_type = closure_type;}

    @Override
    public String toString(){
        return String.format("ItemID: %d\t|\tName: %s\t|\tPrice: %.2f\t|\tQuantity: %d\t|\tBrand: %s\t|\tSize: %s\t|\tColor: %s\t|\tIs Slip Resistant? %b\t|\tCategory: %s\t|\tClosure Type: %s",
                            getItemID(), getName(), getPrice(), getQuantity(), getBrand(), getSize(), getColor(), getIsSlip_Resistant(), getCategory(), getClosure_Type());

        // return "Item Id" + this.getItemID() +
        //         "\nPrice" + this.getPrice() +
        //         "\nQuantity" + this.getQuantity() +
        //         "\nBrand" + this.getBrand() +
        //         "\nColor" + this.getColor() +
        //         "\nSize" + this.getSize() +
        //         "\nCategory" + this.getCategory() +
        //         "\nSlip Resistant" + this.getIsSlip_Resistant() +
        //         "\n Closure Type" + this.getClosure_Type();
    }
}