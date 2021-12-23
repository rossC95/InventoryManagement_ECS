package ECS;

public class Employee {
    // Private instance variables
    private int employeeID;
    private String username, password, firstName, lastName;
    private boolean isManager;
    
    // Default constructor
    Employee() {
        this.employeeID = -1;
        this.firstName = "";
        this.lastName = "";
        this.username = "";
        this.password = "";
        this.isManager = false;
    }
    
    // Parameterized constructor
    Employee(String firstName, String lastName,
            String username, String password, boolean isManager) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.isManager = isManager;
    }
    
    Employee(int employeeID, String firstName, String lastName,
            String username, String password, boolean isManager) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.isManager = isManager;
    }
    
    // Methods/Behaviors
    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }

    // Setter and getter methods
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setIsManager(boolean isManager) {
        this.isManager = isManager;
    }
    public int getEmployeeID() {
        return this.employeeID;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public boolean getIsManager() {
        return this.isManager;
    }
}
