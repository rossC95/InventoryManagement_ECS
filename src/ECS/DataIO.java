package ECS;

import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Date;
import java.util.Properties;
import javax.swing.table.DefaultTableModel;

public class DataIO {
    
    private final String CONNECTION_STRING =  "jdbc:mysql://localhost:3306/equipmentcheckoutsystem";
    private final String USER_NAME = "root";
    private final String PASSWORD = "devry123";
    
    public boolean checkUserAlreadyExists(Employee emp) throws ClassNotFoundException, SQLException {
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        // SQL query string
        String strSQL = "SELECT COUNT(USERNAME) FROM employees WHERE USERNAME=\"" +
                emp.getUsername() + "\"";
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(strSQL);
        // Count of usernames already in database

        int userAlreadyExists = 0;
        while (rs.next()) {
             userAlreadyExists = rs.getInt(1);
        }
        // Close connection 
        conn.close();
        
        if (userAlreadyExists != 0) {
            return true;
        }
        
        return false;
    }
    
    public boolean validateEmployee(String username, String password) throws ClassNotFoundException, SQLException {
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        // SQL statement to verify existence of employee
        String strSQL = "SELECT COUNT(*) FROM employees WHERE (USERNAME=\"" +
                username + "\" AND PASSWORD=\"" + password + "\");";
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(strSQL);
        
        int userExists = 0;
        while (rs.next()) {
             userExists = rs.getInt(1);
        }
        // Close connection 
        conn.close();
        
        if (userExists == 1) {
            return true;
        }
        
        return false;
    }
    
    public Employee login(String username, String password) throws ClassNotFoundException, SQLException {
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        // SQL query string
        String strSQL = "SELECT * FROM employees WHERE (USERNAME=\"" +
                username + "\" AND PASSWORD=\"" + password + "\");" ;
        // Create statement instance using database connection
        Statement statement = conn.createStatement();
        // Create resultset executing query
        ResultSet rs = statement.executeQuery(strSQL);

        // employee information variables
        String firstName = "";
        String lastName = "";
        int employeeID = -1;
        boolean isManager = false;
        int managerCheck = 0;
        
        // While the resultset contains more information
        while (rs.next()) {
            // Assign result set columns to employee information variables
            employeeID = rs.getInt(1);
            username = rs.getString(2);
            password = rs.getString(3);
            managerCheck = rs.getInt(4);
            firstName = rs.getString(5);
            lastName = rs.getString(6);
        }
        
        // Close connection 
        conn.close();
        if (managerCheck == 1) {
            isManager = true;
        }
        // Create new employee object using variables prev declared and initiailized
        Employee emp = new Employee(employeeID, firstName, lastName, username, password, isManager);
        // Return employee object
        return emp;
    }
    
    public void add(Employee emp) throws ClassNotFoundException, SQLException {
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        // SQL query string
        String strSQL = "INSERT INTO employees (USERNAME, PASSWORD, "
            + "IS_MANAGER, FNAME, LNAME) "
            + "VALUES(?, ?, ?, ?, ?)";
        // Prepared statement use unidentified values assigned below
        PreparedStatement pstmt = conn.prepareStatement(strSQL);
        // Assign prepared statement ?s
        pstmt.setString(1, emp.getUsername());
        pstmt.setString(2, emp.getPassword());
        pstmt.setBoolean(3, emp.getIsManager());
        pstmt.setString(4, emp.getFirstName());
        pstmt.setString(5, emp.getLastName());

        // Execute the prepared statement
        pstmt.execute();

        // Close connection 
        conn.close();
    }
    
    public int mapUserNameToID(String username) throws ClassNotFoundException, SQLException{
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        // SQL query string
        String query = "SELECT e.ID FROM employees e WHERE e.USERNAME = \"" + username + "\";";
        // Properties object for database credentials
        Properties connProps = new Properties();
        // Properties object credentials
        connProps.setProperty("user", "root");
        connProps.setProperty("password", "devry123");
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, connProps);
        // Static SQL statement
        Statement stmt = conn.createStatement();
        // Resultset of the query
        ResultSet rs = stmt.executeQuery(query);
        
        int id = 0;
        // Won't work without while loop
        while(rs.next()) {
            // Store employee_ID
            id = rs.getInt(1);
        }
        // End database session
        conn.close();
        // Mapped id from username
        return id;
    }
    
    public void addItem(Item item) throws ClassNotFoundException, SQLException {
        //initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        // SQL query string variable declaration
        String strSQL = "";
        // Prepared statement variable declaration
        PreparedStatement pstmt = null;
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        
        if (item.getID() == -1) {
            strSQL =  "INSERT INTO equipment (NAME, QUANTITY, "
                + "DESCRIPTION) "
                + "VALUES(?, ?, ?)";
            pstmt = conn.prepareStatement(strSQL);
            pstmt.setString(1, item.getName());
            pstmt.setInt(2, item.getQuantity());
            pstmt.setString(3, item.getDescription());
        } 
        
        else {
            strSQL =  "INSERT INTO equipment (ID, NAME, "
                + "QUANTITY, DESCRIPTION) "
                + "VALUES(?, ?, ?, ?)";
            pstmt = conn.prepareStatement(strSQL);
            pstmt.setInt(1, item.getID());
            pstmt.setString(2, item.getName());
            pstmt.setInt(3, item.getQuantity());
            pstmt.setString(4, item.getDescription());
        }
        
        // Execute the prepared statement
        pstmt.execute();
        // Close connection 
        conn.close();
    }
    
    public void removeItem(String itemID) throws ClassNotFoundException, SQLException {
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        // SQL query string
        String strSQL = "DELETE FROM equipment WHERE ID=\"" + itemID + "\"";
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        // Prepared statement using query string
        PreparedStatement pstmt = conn.prepareStatement(strSQL);
        // Execute the prepared statement
        pstmt.execute();
        // Close connection 
        conn.close();
    }
    
    public void updateItem(Item item) throws ClassNotFoundException, SQLException {
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        // SQL query string declaration
        String strSQL = "";
        // Prepared statement declaration
        PreparedStatement pstmt = null;
        // Create session to database 
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        
        strSQL =  "UPDATE equipment SET NAME=\"" + item.getName()
                + "\" WHERE ID=\"" + Integer.toString(item.getID()) + "\"";
        pstmt = conn.prepareStatement(strSQL);
        // Execute the prepared statement
        pstmt.execute();

        strSQL =  "UPDATE equipment SET QUANTITY=\"" + Integer.toString(item.getQuantity())
                + "\" WHERE ID=\"" + Integer.toString(item.getID()) + "\"";
        pstmt = conn.prepareStatement(strSQL);
        // Execute the prepared statement
        pstmt.execute();
        
        strSQL =  "UPDATE equipment SET DESCRIPTION=\"" + item.getDescription()
                + "\" WHERE ID=\"" + Integer.toString(item.getID()) + "\"";
        pstmt = conn.prepareStatement(strSQL);
        // Execute the prepared statement
        pstmt.execute();
        // Close connection 
        conn.close();
    }
    
    public void updateItemLimit(ArrayList<Integer> values) throws ClassNotFoundException, SQLException {
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        
        String resID = values.get(0).toString();
        String itemID = values.get(1).toString();
        String resQuantity = values.get(2).toString();
        String resType = values.get(3).toString();
        String resTypeString = (Integer.parseInt(resType) == 1) ? "Individual" : "Global";
        String empID = "";
        
        if (values.size() == 5) {
            empID = values.get(4).toString();
        }
        
        // variable declartion
        String strSQL = "";
        PreparedStatement pstmt = null;
        
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        strSQL =  "UPDATE item_limits SET ITEM_ID=\"" + itemID
                + "\" WHERE RESTRICTION_ID=\"" + resID + "\"";
        pstmt = conn.prepareStatement(strSQL);
        // Execute the prepared statement
        pstmt.execute();
        strSQL =  "UPDATE item_limits SET RESTRICTION_QUANTITY=\"" + resQuantity
                + "\" WHERE RESTRICTION_ID=\"" + resID + "\"";
        pstmt = conn.prepareStatement(strSQL);
        // Execute the prepared statement
        pstmt.execute();
        strSQL =  "UPDATE item_limits SET RESTRICTION_TYPE=\"" + resTypeString
                + "\" WHERE RESTRICTION_ID=\"" + resID + "\"";
        pstmt = conn.prepareStatement(strSQL);
        // Execute the prepared statement
        pstmt.execute();
        
        if (values.size() == 5) {
            strSQL =  "UPDATE item_limits SET EMPLOYEE_ID=\"" + empID
                    + "\" WHERE RESTRICTION_ID=\"" + resID + "\"";
            pstmt = conn.prepareStatement(strSQL);
            // Execute the prepared statement
            pstmt.execute();
        } else {
            strSQL =  "UPDATE item_limits SET EMPLOYEE_ID=null WHERE RESTRICTION_ID=\"" + resID + "\"";
            pstmt = conn.prepareStatement(strSQL);
            // Execute the prepared statement
            pstmt.execute();
        }
        // Close database connection
        conn.close();
    }
    
    public void addItemLimit(ArrayList<Integer> values) throws ClassNotFoundException, SQLException {
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        
        String itemID = values.get(0).toString();
        String resQuantity = values.get(1).toString();
        String resType = values.get(2).toString();
        String resTypeString = (Integer.parseInt(resType) == 1) ? "Individual" : "Global";
        String empID = "";
        
        if (values.size() == 4) {
            empID = values.get(3).toString();
        }
        
        // Vsariable declaration
        String strSQL = "";
        PreparedStatement pstmt = null;
        
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
       
        if (values.size() == 3) {
            strSQL =  "INSERT INTO item_limits (ITEM_ID, RESTRICTION_QUANTITY,"
                    + " RESTRICTION_TYPE) "
                + "VALUES(?, ?, ?)";
            pstmt = conn.prepareStatement(strSQL);
            pstmt.setInt(1, Integer.parseInt(itemID));
            pstmt.setInt(2, Integer.parseInt(resQuantity));
            pstmt.setString(3, resTypeString);
        } 
        
        else if (values.size() == 4) {
            strSQL = "INSERT INTO item_limits (ITEM_ID, RESTRICTION_QUANTITY,"
                    + " RESTRICTION_TYPE, EMPLOYEE_ID) "
                + "VALUES(?, ?, ?, ?)";
            pstmt = conn.prepareStatement(strSQL);
            pstmt.setInt(1, Integer.parseInt(itemID));
            pstmt.setInt(2, Integer.parseInt(resQuantity));
            pstmt.setString(3, resTypeString);
            pstmt.setInt(4, Integer.parseInt(empID));
        }
        
        // Execute the prepared statement
        pstmt.execute();
        
        // Close connection 
        conn.close();
    }
    
    public int checkoutItem(String itemID, String quantityToRemove, String empID) throws ClassNotFoundException, SQLException {
        
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        
        // Query resultset
        ResultSet rs = null;
        
        // Check if item restricted
        String strSQL = "SELECT MIN(RESTRICTION_QUANTITY) FROM item_limits WHERE"
                + " ITEM_ID=\"" + itemID + "\" AND (EMPLOYEE_ID=\"" + empID + "\" OR"
                + " RESTRICTION_TYPE=\"Global\")";
        
        Statement stmt = conn.createStatement();
        rs = stmt.executeQuery(strSQL);
        
        int restrictedTo = -1;
        
        while (rs.next()) {
            restrictedTo = rs.getInt(1);
        }
        
        int quantityRemoveInt = Integer.parseInt(quantityToRemove);
        
        if (restrictedTo != 0 && quantityRemoveInt > restrictedTo) {
            conn.close();
            return 1;
        }
        
        // Check current quantity checked out by employee
        strSQL = "SELECT SUM(QUANTITY) FROM orders WHERE"
                + " ITEM_ID=\"" + itemID + "\" AND EMPLOYEE_ID =\"" + empID + "\" "
                + "AND TIME_RETURNED IS NULL";
        
        stmt = conn.createStatement();
        rs = stmt.executeQuery(strSQL);
        
        int currQuantityOut = 0;
        
        while (rs.next()) {
            currQuantityOut = rs.getInt(1);
        }
        
        if (restrictedTo != 0 && currQuantityOut + quantityRemoveInt > restrictedTo) {
            conn.close();
            return 2;
        }
        
        // Checkout item
        strSQL =  "UPDATE equipment SET QUANTITY=QUANTITY-" + quantityRemoveInt
                + " WHERE ID=\"" + itemID + "\"";
        PreparedStatement pstmt = conn.prepareStatement(strSQL);
        // Execute the prepared statement
        pstmt.execute();
        // Update orders table
        strSQL =  "INSERT INTO orders (ITEM_ID, EMPLOYEE_ID, QUANTITY, TIME_ORDERED) VALUES(?, ?, ?, ?)";
        
        pstmt = conn.prepareStatement(strSQL);
        pstmt.setInt(1, Integer.parseInt(itemID));
        pstmt.setInt(2, Integer.parseInt(empID));
        pstmt.setInt(3, quantityRemoveInt);
        Date date = new Date();
        pstmt.setTimestamp(4, new Timestamp(date.getTime()));
        
        // Execute the prepared statement
        pstmt.execute();
        
        // Close connection 
        conn.close();
        
        return 0;
    }
    
    public int returnItem(String transID, String itemID, String quantity) throws ClassNotFoundException, SQLException {
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        Date date = new Date();
        Timestamp time = new Timestamp(date.getTime());
        // Update orders table
        String strSQL = "UPDATE orders SET TIME_RETURNED=? WHERE TRANSACTION_ID=?";
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        PreparedStatement pstmt = conn.prepareStatement(strSQL);
        // Prepare statement
        pstmt.setTimestamp(1, time);
        pstmt.setInt(2, Integer.parseInt(transID));
        // Execute the prepared statement
        pstmt.execute();
        // Update equipment table
        strSQL = "UPDATE equipment SET QUANTITY=QUANTITY+? WHERE ID=?";
        pstmt = conn.prepareStatement(strSQL);
        // Prepare statement
        pstmt.setInt(1, Integer.parseInt(quantity));
        pstmt.setInt(2, Integer.parseInt(itemID));
        // Execute the prepared statement
        pstmt.execute();

        // Close connection 
        conn.close();
        
        return 0;
    }
    
    public int removeLimit(int resID) throws ClassNotFoundException, SQLException {
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        // Update orders table
        String strSQL = "DELETE FROM item_limits WHERE RESTRICTION_ID = ?";
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        
        PreparedStatement pstmt = conn.prepareStatement(strSQL);
        // Prepare statement
        pstmt.setInt(1, resID);
        // Execute the prepared statement
        pstmt.execute();
        // Close connection 
        conn.close();
        
        return 0;
    }
    
    public DefaultTableModel viewLog() throws ClassNotFoundException, SQLException  {
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        
        Statement stmt = conn.createStatement();
        // Selects required data from table
        ResultSet rs = stmt.executeQuery(
                "SELECT e.ID, e.FNAME, e.LNAME, o.TRANSACTION_ID, "
                        + "o.ITEM_ID, eq.NAME, o.QUANTITY, o.TIME_ORDERED, "
                        + "o.TIME_RETURNED\n" +
                "FROM employees e\n" +
                "INNER JOIN orders o ON e.ID=o.EMPLOYEE_ID\n" +
                "INNER JOIN equipment eq ON eq.ID=o.ITEM_ID\n" +
                "ORDER BY TIME_ORDERED DESC"
            );
        
        DefaultTableModel table = buildTable(rs);
        
        // Close connection
        conn.close();
        
        return table;
    }
    
    public DefaultTableModel filterOrders(String date) throws ClassNotFoundException, SQLException  {
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        Statement stmt = conn.createStatement();
        
        // Selects required data from table
        ResultSet rs = stmt.executeQuery(
                "SELECT e.ID, e.FNAME, e.LNAME, o.TRANSACTION_ID, o.ITEM_ID, eq.NAME, o.QUANTITY, o.TIME_ORDERED, o.TIME_RETURNED\n" +
            "FROM employees e\n" +
            "INNER JOIN orders o ON e.ID=o.EMPLOYEE_ID\n" +
            "INNER JOIN equipment eq ON eq.ID=o.ITEM_ID\n" +
            "WHERE TIME_ORDERED > \"" + date + "\"\n" +
            "ORDER BY TIME_ORDERED DESC"
        );
        
        DefaultTableModel table = buildTable(rs);
        
        // Close connection
        conn.close();
        
        return table;
    }
    
    public DefaultTableModel loadInventory() throws ClassNotFoundException, SQLException {
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        Statement stmt = conn.createStatement();
        // Selects required data from table
        ResultSet rs = stmt.executeQuery("SELECT * FROM equipment");    
        
        DefaultTableModel table = buildTable(rs);
        
        // Close connection
        conn.close();
        
        return table;
    }
    
    public DefaultTableModel loadLimits() throws ClassNotFoundException, SQLException {
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        
        Statement stmt = conn.createStatement();
        // Selects required data from table
        ResultSet rs = stmt.executeQuery("SELECT i.RESTRICTION_ID, i.ITEM_ID, eq.NAME, i.RESTRICTION_QUANTITY, i.EMPLOYEE_ID, e.FNAME, e.LNAME FROM item_limits i"
        + " LEFT JOIN equipment eq ON eq.ID=i.ITEM_ID"
        + " LEFT JOIN employees e ON i.EMPLOYEE_ID=e.ID");    
        
        DefaultTableModel table = buildTable(rs);
        
        // Close connection
        conn.close();
        
        return table;
    }

    public DefaultTableModel checkedOutItems(String username) throws ClassNotFoundException, SQLException {
        // Initialize driver
        Class.forName("com.mysql.jdbc.Driver");
        // SQL query string
        String query = "SELECT e.ID, e.FNAME, e.LNAME, o.TRANSACTION_ID, o.ITEM_ID, eq.NAME, o.QUANTITY, o.TIME_ORDERED\n" +
            "FROM employees e\n" +
            "INNER JOIN orders o ON e.ID=o.EMPLOYEE_ID\n" +
            "INNER JOIN equipment eq ON eq.ID=o.ITEM_ID\n" +
            "WHERE e.USERNAME = \"" + username + "\" AND o.TIME_RETURNED IS NULL;";
                // AND TIME_RETURNED = null;
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        // Static sql statement
        Statement stmt = conn.createStatement();
        // Resultset of the query
        ResultSet rs = stmt.executeQuery(query);
        // Build table
        DefaultTableModel table = buildTable(rs);
        // Close connection
        conn.close();
        // Return table to handler (Object[][] data, Object[] columnNames)
        return table;
    }
    
    public DefaultTableModel employeeSearch(String keyword) throws ClassNotFoundException, SQLException{
        // Initiate driver
        Class.forName("com.mysql.jdbc.Driver");
        // SQL query --- keyword can be FNAME, LNAME, or USERNAME
        String query = "SELECT e.FNAME, e.LNAME, e.USERNAME\n" +
            "FROM employees e\n" +
            "WHERE e.FNAME = \"" + keyword + "\" OR e.LNAME = \"" + keyword + "\" OR e.USERNAME = \"" + keyword + "\";";
        // Login property
        Properties connProps = new Properties();
        connProps.setProperty("user", "root");
        connProps.setProperty("password", "devry123");
        // Create session to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, connProps);
        // Static sql statement
        Statement stmt = conn.createStatement();
        // Resultset of the query
        ResultSet rs = stmt.executeQuery(query);
        //b Bild table
        DefaultTableModel table = buildTable(rs);
        // Close database session
        conn.close();
        // Return table to handler (Object[][] data, Object[] columnNames)
        return table;   
    }
    
    public DefaultTableModel buildTable(ResultSet rs) throws ClassNotFoundException, SQLException {
        // Storing table metadata
        ResultSetMetaData metaData = rs.getMetaData();
        // Vector for columns
        Vector<String> columnNames = new Vector<String>();
        // Counter for loop
        int columnCount = metaData.getColumnCount();
        // For each column in columnCount
        for (int column = 1; column <= columnCount; column++) {
            // Store column names in vector for DefaultTableModel second argument
            columnNames.add(metaData.getColumnName(column));
        }
        // Data of the table for DefaultTableModel first argument
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        // While resultset contains more data
        while (rs.next()) {
            // Vector to hold each record inside loop
            Vector<Object> vector = new Vector<Object>();
            // For each field per record
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                // Add current column index data
                vector.add(rs.getObject(columnIndex));
            }
            // Add vector to the matrix variable data
            data.add(vector);
        }
    return new DefaultTableModel(data, columnNames);
    }
    
}
