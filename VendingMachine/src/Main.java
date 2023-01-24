import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //idea here is to call the functions
        Inventory inventory = new Inventory();
        Display display = new Display();
        Money money = new Money();
        inventory.initializeInventory();
        money.initializeInventory();
        Scanner input = new Scanner(System.in);
        String item = "";
        while(Display.loop){
            display.welcomeScreen();
            display.showMenu();
            item = input.nextLine().toUpperCase();
            display.takeInput(item);
        }
    }
}