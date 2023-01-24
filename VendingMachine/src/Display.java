import java.util.Scanner;

public class Display extends Money{
    public static boolean loop = true;
    public boolean loop2 = true;

    public void welcomeScreen(){
        System.out.println("Hello, welcome to Wilaaay's vending machine!");
    }
    public void showMenu(){
        System.out.println("select and option:");
        System.out.println("A1 --> Doritos $2.50");
        System.out.println("A2 --> Pringles $3.50");
        System.out.println("A3 --> Pretzels $1.50");
        System.out.println("B1 --> Coke $1.50");
        System.out.println("B2 --> Pepsi $1.50");
        System.out.println("B3 --> Sprite $1.50");
        System.out.println("C1 --> Skittles $1.20");
        System.out.println("C2 --> M&M $1.20");
        System.out.println("C3 --> Twixs $1.50");
        System.out.println("D1 --> Heresies $2.25");
        System.out.println("D2 --> KitKat $2.50");
        System.out.println("D3 --> Popcorn $1.00");
        System.out.println("\n");
        System.out.println("C to cancel");
        System.out.println("S --> show what's left");
    }
    public void takeInput(String item){
        Scanner input = new Scanner(System.in);
        double amount = 0.0;
        switch (item) {
            case "C" -> loop = false;
            case "A1" -> {
                System.out.println("The price for this item is $" + String.format("%.2f", (priceOfItem.get("A1"))));
                System.out.println("Please insert your money");
                if (changeToUser(input, "A1", amount) != -1) {
                    dispense("A1");
                }
                menu2(item);
            }
            case "A2" -> {
                System.out.println("The price for this item is $" + String.format("%.2f", (priceOfItem.get("A2"))));
                System.out.println("Please insert your money");
                if (changeToUser(input, "A2", amount) != -1) {
                    dispense("A2");
                }
                menu2(item);
            }
            case "A3" -> {
                System.out.println("The price for this item is $" + String.format("%.2f", (priceOfItem.get("A3"))));
                System.out.println("Please insert your money");
                if (changeToUser(input, "A3", amount) != -1) {
                    dispense("A3");
                }
                menu2(item);
            }
            case "B1" -> {
                System.out.println("The price for this item is $" + String.format("%.2f", (priceOfItem.get("B1"))));
                System.out.println("Please insert your money");
                if (changeToUser(input, "B1", amount) != -1) {
                    dispense("B1");
                }
                menu2(item);
            }
            case "B2" -> {
                System.out.println("The price for this item is $" + String.format("%.2f", (priceOfItem.get("B2"))));
                System.out.println("Please insert your money");
                if (changeToUser(input, "B2", amount) != -1) {
                    dispense("B2");
                }
                menu2(item);
            }
            case "B3" -> {
                System.out.println("The price for this item is $" + String.format("%.2f", (priceOfItem.get("B3"))));
                System.out.println("Please insert your money");
                if (changeToUser(input, "B3", amount) != -1) {
                    dispense("B3");
                }
                menu2(item);
            }
            case "C1" -> {
                System.out.println("The price for this item is $" + String.format("%.2f", (priceOfItem.get("C1"))));
                System.out.println("Please insert your money");
                if (changeToUser(input, "C1", amount) != -1) {
                    dispense("C1");
                }
                menu2(item);
            }
            case "C2" -> {
                System.out.println("The price for this item is $" + String.format("%.2f", (priceOfItem.get("C2"))));
                System.out.println("Please insert your money");
                if (changeToUser(input, "C2", amount) != -1) {
                    dispense("C2");
                }
                menu2(item);
            }
            case "C3" -> {
                System.out.println("The price for this item is $" + String.format("%.2f", (priceOfItem.get("C3"))));
                System.out.println("Please insert your money");
                if (changeToUser(input, "C3", amount) != -1) {
                    dispense("C3");
                }
                menu2(item);
            }
            case "D1" -> {
                System.out.println("The price for this item is $" + String.format("%.2f", (priceOfItem.get("D1"))));
                System.out.println("Please insert your money");
                if (changeToUser(input, "D1", amount) != -1) {
                    dispense("D1");
                }
                menu2(item);
            }
            case "D2" -> {
                System.out.println("The price for this item is $" + String.format("%.2f", (priceOfItem.get("D2"))));
                System.out.println("Please insert your money");
                if (changeToUser(input, "D2", amount) != -1) {
                    dispense("D2");
                }
            }
            case "D3" -> {
                System.out.println("The price for this item is $" + String.format("%.2f", (priceOfItem.get("D3"))));
                System.out.println("Please insert your money");
                if (changeToUser(input, "D3", amount) != -1) {
                    dispense("D3");
                }
            }
            case "S" -> showInventory();
            default -> System.out.println("Sorry that is not valid!, try again!");
        }

    }
    public void menu2(String l){
        Scanner input = new Scanner(System.in);
        while(loop2) {
            System.out.println("Would you like to buy more? Y or N?");
            l = input.nextLine().toUpperCase();
            if (l.equals("Y")) {
                loop = true;
                loop2 = false;
            }
            if (l.equals("N")) {
                loop2 = false;
                loop = false;
                break;
            }
        }
    }
}
