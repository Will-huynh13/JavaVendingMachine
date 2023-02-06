import java.util.Scanner;

public class Display{

    public boolean loop = true;
    public void showMenu() {
        System.out.println("Welcome to the Will's Vending machine!");
        System.out.println("select an option:");
        System.out.println("A1 --> Doritos");
        System.out.println("A2 --> Coke");
        System.out.println("A3 --> Skittles");
        System.out.println("\n");
        System.out.println("C to cancel");
        System.out.println("S --> show what's left");
    }
    public void takingUserInput(String input){
        Scanner str = new Scanner(System.in);
        double amount = 0.0;
        switch (input){
            case "A1":
                showPrice(input);
                amount = promptUser();
                Money.cashBack(str,input,amount);
                break;
            case "A2":
                showPrice(input);
                amount = promptUser();
                Money.cashBack(str,input,amount);
                break;
            case "A3":
                showPrice(input);
                amount = promptUser();
                Money.cashBack(str,input,amount);
                break;
            case "S":
                Inventory.showInventory();
                break;
            case "C":
                loop=false;
                break;
        }

    }

    public void showPrice(String id){
        System.out.println("You selected " + Inventory.inventoryMap.get(id).get(1) +
                " the price of this item is $" + String.format("%.2f",(Money.costMap.get(id))));
    }

    public double promptUser(){
        double amount = 0.0;
        Scanner str = new Scanner(System.in);
        System.out.println("Insert cash...");
        amount = Double.parseDouble(str.nextLine());
        return amount;
    }
}
