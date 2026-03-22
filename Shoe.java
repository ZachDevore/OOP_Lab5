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
     * @param brand
     * @param color
     * @param price
     * @param quantity
     * @param size
     * @param category
     * @param closure_type
     * @param isSlip_resistant
     */
    public Shoe(int itemID, String name, String brand, String color, double price,
                int quantity, String size, String category, boolean isSlip_resistant,
                String closure_type){

        super(itemID, name, price, quantity, brand, size, color);

        this.category = category;
        this.isSlip_resistant = isSlip_resistant;
        this.closure_type = closure_type;
    }

    //getters and setters

    public String getCategory(){return category;}

    public boolean getIsSlip_Resistant(){return isSlip_resistant;}

    public String getClosure_Type(){return closure_type;}

    public void setCategory(){this.category = category;}

    public void setIsSlip_Resistant(){this.isSlip_resistant = isSlip_resistant;}

    public void setClosure_type(String closure_type) {this.closure_type = closure_type;}

    @Override
    public String toString(){
        return "Item Id" + this.getItemID() +
                "\nPrice" + this.getPrice() +
                "\nQuantity" + this.getQuantity() +
                "\nBrand" + this.getBrand() +
                "\nColor" + this.getColor() +
                "\nSize" + this.getSize() +
                "\nCategory" + this.getCategory() +
                "\nSlip Resistant" + this.getIsSlip_Resistant() +
                "\n Closure Type" + this.getClosure_Type();
    }
}