<!-- Main Title -->
# InventoryManagement_ECS

<!-- ABOUT THE PROJECT -->
## About The Project

The Equipment Management System uses Java and the Swing framework to track an organizations maintenance equipment.
* Track when employees checkout/return maintenance equipment items.
* Provides detailed information such as the item, employee, time, date, and quantity.
* The application has the ability to generate a PDF version of the transaction history and can be filtered by date.

## Employee Interface Capabilities

The following functionality is present when using the application after registering as an employee.
* Checkout equipment items by selecting from the table model and using the checkout button.
* View the equipment items currently checked out and return equipment from the table model in the same manner as checking out.
* Reload inventory list to provide an accurate description of what items are available.
* Logout functionality that will return the user to the login frame.

## Manager Interface Capabilities

The following functionality is present when using the application after registering as a manager.
* View the equipment transaction log for all employees which can be filtered by date.
* Add, remove, and update equipment items from the MySQL database.
* Update, and view equipment item limits on an individual employee and global scale.
* Generate a PDF report for all equipment item transactions.
* Reload inventory list to provide an accurate description of what items are available.
* Logout functionality that will return the user to the login frame.


<!-- Screenshots -->
### Sample Screenshots

![ScreenShot](ECS_Images/Login_Frame.png)

## Employee Interface

![ScreenShot](ECS_Images/EmployeeInterface/Main_Interface_Reload_Inventory_Button.png)

![ScreenShot](ECS_Images/EmployeeInterface/Checkout_Equipment_Quantity.png)

![ScreenShot](ECS_Images/EmployeeInterface/Checkout_Equipment_Confirmation.png)

![ScreenShot](ECS_Images/EmployeeInterface/Checkout_Equipment_Approval.png)

![ScreenShot](ECS_Images/EmployeeInterface/Checked_Out_Items_Button.png)

![ScreenShot](ECS_Images/EmployeeInterface/Return_Equipment_Confirmation.png)

![ScreenShot](ECS_Images/EmployeeInterface/Return_Equipment_Approval.png)

## Manager Interface

![ScreenShot](ECS_Images/ManagerInterface/Main_Manager_Interface.png)

![ScreenShot](ECS_Images/ManagerInterface/View_Equipment_Log.png)

![ScreenShot](ECS_Images/ManagerInterface/Add_Item.png)

![ScreenShot](ECS_Images/ManagerInterface/Add_Item_Success.png)

![ScreenShot](ECS_Images/ManagerInterface/Remove_Item_Confirmation.png)

![ScreenShot](ECS_Images/ManagerInterface/Remove_Item_Success.png)

![ScreenShot](ECS_Images/ManagerInterface/Update_Item.png)

![ScreenShot](ECS_Images/ManagerInterface/Update_Item_Success.png)

![ScreenShot](ECS_Images/ManagerInterface/Add_Limit_Search_Employee.png)

![ScreenShot](ECS_Images/ManagerInterface/Report_Success.png)

![ScreenShot](ECS_Images/ManagerInterface/Report_PDF.png)

## Data Model

![ScreenShot](ECS_Images/InventoryManagement_DataModel.png)

## Class Diagram

![ScreenShot](ECS_Images/Class_Diagram.png)
