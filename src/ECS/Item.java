package ECS;

public class Item {
    // Private instance variables
    private int ID, quantity;
    private String name, description;
    
    // Default Constructor
    Item() {
        this.ID = -1;
        this.quantity = 0;
        this.name = "";
        this.description = "";
    }
    
    // Parameterized constructors
    Item(int ID, int quantity, String name, String description) {
        this.ID = ID;
        this.quantity = quantity;
        this.name = name;
        this.description = description;
    }
    Item(int quantity, String name, String description) {
        this.quantity = quantity;
        this.name = name;
        this.description = description;
    }

    // Setter and Getter Methods
    public void setItemID(int itemID) {
        this.ID = itemID;
    }
    public void setName(String itemName) {
        this.name = itemName;
    }
    public void setDescription(String itemDescription) {
        this.description = itemDescription;
    }
    public void setQuantity(int itemQuantity) {
        this.quantity = itemQuantity;
    }
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public int getID() {
        return this.ID;
    }
}
