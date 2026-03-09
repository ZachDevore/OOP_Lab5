/**
 * Class purpose: determine if an item is Shelf Stable
 * @author Zachary Devore
 * Date: 3/9/26
 * Section: CSC 311-002
 */
public class ShelfStable {
    
    /** Boolean instance variable to tell weather an item is shelf stable or not */
    private boolean isShelfStable;

    /**
     * Initializes a new instance is ShelfStable
     */
    public ShelfStable() {
        isShelfStable = true;
    }

    /**
     * Sets isShelfStable to the provides boolean param
     * @param isShelfStable
     */
    public void setIsShelfStable(boolean isShelfStable) {
        this.isShelfStable = isShelfStable;
    }

    /**
     * Gets the current value of isShelfStable
     * @return If it is shelf stable or not
     */
    public boolean getIsShelfStable() {
        return this.isShelfStable;
    }

}
