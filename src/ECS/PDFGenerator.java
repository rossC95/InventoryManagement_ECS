package ECS;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class PDFGenerator {
    
    public static String GeneratePDF() throws FileNotFoundException, DocumentException{
        Document document = new Document();
        document.addCreationDate();
        // Get current date for filename
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM_dd_uuuu");
        String date = dtf.format(LocalDate.now());
        // PdfWriter added to Document, Element added written to the outputstream.
        PdfWriter.getInstance(document, new FileOutputStream("ECS_Report_" + date + ".pdf"));
        document.open();
        // Font for title Paragraph
        Font font = FontFactory.getFont(FontFactory.COURIER_BOLD, 16, BaseColor.BLACK);
        // ZonedDateTime for display with title
        String dateTime = ZonedDateTime.now().withNano(0).format(DateTimeFormatter.ISO_DATE_TIME);
        // Title Paragraph with ZonedDateTime and applied font
        Paragraph para = new Paragraph("Equipment Checkout System (Transaction History)\n" 
                + dateTime, font);
        // Increase spacing to negate table clipping
        para.setSpacingAfter(50);
        // PdfTable argument - number of columns
        PdfPTable table = new PdfPTable(8);
        // Increase width to reduce text wrap
        table.setWidthPercentage(110);

        // MySQL DB Credentials
        final String CONNECTION_STRING =  "jdbc:mysql://equipmentcheckoutsystem.cp71biwqhxn1.us-east-2.rds.amazonaws.com:3306/equipmentcheckoutsystem";
        final String USER_NAME = "admin";
        final String PASSWORD = "CEIS400isGreat!";
        
        try{
            // Initiate driver
            Class.forName("com.mysql.jdbc.Driver");
            // Establish connection
            Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
            // Query for report information
            String query = "SELECT orders.TRANSACTION_ID, employees.FNAME, employees.LNAME, \n" +
                "orders.ITEM_ID, equipment.NAME, orders.QUANTITY, \n" +
                "orders.TIME_ORDERED, orders.TIME_RETURNED\n" +
                "FROM employees \n" +
                "INNER JOIN orders ON orders.EMPLOYEE_ID=employees.ID\n" +
                "INNER JOIN equipment ON equipment.ID=orders.ITEM_ID;";

            // Static SQL statement
            Statement statement = conn.createStatement();
            // Store results inside ResultSet instance
            ResultSet rs = statement.executeQuery(query);
            // Extract metadata (column types and properties)
            ResultSetMetaData metadata = rs.getMetaData();
            // Counter variable for loop
            int columnCount = metadata.getColumnCount();
            
            // ---TEST---
            // ArrayList to store all column names
            ArrayList<String> columnNames = new ArrayList();
            
            for (int i = 1; i <= columnCount; i++){
                String columnName = metadata.getColumnName(i);
                columnNames.add(columnName);
                // ---TEST---
              }
            // Add the table header to the table using the columnNames ArrayList
            addTableHeader(table, columnNames);

        } catch(Exception e) {
            // Value for JOptionPane display
            return "Error: " + e;
        }
        // Add transaction information to table
        addRows(table);
        
        // Add the Paragraph Object to the Document
        document.add(para);
        // Add the PdfPTable Object to the Document
        document.add(table);
        
        // Close the document stream
        document.close();
        
        // Value for JOptionPane display
        return "Report Successfully Created.";
    }
        
    private static void addTableHeader(PdfPTable table, ArrayList<String> columns) {
        // Stream containing column names from ArrayList
        // Manual input to reduce text wrap from database naming
        Stream.of("TXN_ID", columns.get(1), columns.get(2),
                columns.get(3), columns.get(4), columns.get(5), "TIME_OUT", "TIME_IN")
                .forEach(columnTitle -> {
            // cell in PdfPTable
            PdfPCell header = new PdfPCell();
            // cell background color
            header.setBackgroundColor(BaseColor.LIGHT_GRAY);
            // cell border width
            header.setBorderWidth(1);
            // set phrase/text for cell to columnTitle
            header.setPhrase(new Phrase(columnTitle));
            // add cell to the PdfPTable
            table.addCell(header);
            });
    }
    
    private static void addRows(PdfPTable table) {
        
        // MySQL DB Credentials
        final String CONNECTION_STRING =  "jdbc:mysql://equipmentcheckoutsystem.cp71biwqhxn1.us-east-2.rds.amazonaws.com:3306/equipmentcheckoutsystem";
        final String USER_NAME = "admin";
        final String PASSWORD = "CEIS400isGreat!";
        
        try{
            // Initiate driver
            Class.forName("com.mysql.jdbc.Driver");
            // Establish connection
            Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
            // Query for report information
            String query = "SELECT orders.TRANSACTION_ID, employees.FNAME, employees.LNAME, \n" +
                "orders.ITEM_ID, equipment.NAME, orders.QUANTITY, \n" +
                "orders.TIME_ORDERED, orders.TIME_RETURNED\n" +
                "FROM employees \n" +
                "INNER JOIN orders ON orders.EMPLOYEE_ID=employees.ID\n" +
                "INNER JOIN equipment ON equipment.ID=orders.ITEM_ID;";
            
            // Static SQL statement
            Statement statement = conn.createStatement();
            // Store results inside ResultSet instance
            ResultSet rs = statement.executeQuery(query);
            

            // Declare variables to hold each transaction record during loop          
            int transactionID = 0;
            String firstName;
            String lastName;
            int itemID = 0;
            String itemName;
            int quantity = 0;
            LocalDateTime timeOrdered = null;
            LocalDateTime timeReturned = null;
            
            // While ResultSet Object has transaction records
            while (rs.next()) {
                // Set each variable to the individual field values
                transactionID = rs.getInt(1);
                firstName = rs.getString(2);
                lastName = rs.getString(3);
                itemID = rs.getInt(4);
                itemName = rs.getString(5);
                quantity = rs.getInt(6);
                timeOrdered = rs.getObject(7, LocalDateTime.class);
                timeReturned = rs.getObject(8, LocalDateTime.class);
                
                /* 
                 * add PdfPTable cells for each field
                 * Note: the number of cells should be divisible by the number
                 * of fields created using the PdfPTable's argument, additional
                 * fields are truncated
                */
                table.addCell(String.valueOf(transactionID));
                table.addCell(firstName);
                table.addCell(lastName);
                table.addCell(String.valueOf(itemID));
                table.addCell(itemName);
                table.addCell(String.valueOf(quantity));
                table.addCell(String.valueOf(timeOrdered));
                table.addCell(String.valueOf(timeReturned));
                }

            } catch(Exception e) {
                System.out.println("Error: " + e);
            }   
    }  
}
