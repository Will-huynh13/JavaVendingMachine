import java.util.Scanner;

public class Main {
    /*
        The plan:

        3 classes, one to manage the inventory, one to manage the money, one to manage the display

        Main class will just be objects and their corresponding methods

        INVENTORY CLASS:
        Hashmap to store the inventory with item ID, count of the item and the name of the item
        We also want to show the current inventory
        Dispense method - returns the requested item the user inputted

        MONEY CLASS:
        Hashmap to store the ID of the item, and it is "parallel"  to inventory
        Cashback method

        DISPLAY CLASS:
        Menu method will show the items in the vending machine
        takeInput method will take the user's input from command line

     */
    public static void main(String[] args) {
        Display d = new Display();
        new Inventory();
        new Money();
        Scanner input = new Scanner(System.in);
        while(d.loop){
            d.showMenu();
            String item = input.nextLine().toUpperCase();
            d.takingUserInput(item);
        }
    }
}