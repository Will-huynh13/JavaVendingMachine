import java.util.Scanner;

public class Display extends Money{
    public static boolean loop = true;
    public void showInventory(){
        //method to show inventory

    }
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
        System.out.println("");
        System.out.println("C to cancel");
        System.out.println("S --> show what's left");
    }
    public void takeInput(String item){
        Scanner input = new Scanner(System.in);
        switch (item){
            case "C":
                loop = false;
                break;
            case "A1":
                System.out.println("The price for this item is $" + priceOfItem.get("A1"));
                System.out.println("Please insert your money");
                setAmount(Double.parseDouble(input.nextLine()));
                if(changeToUser("A1",getAmount())){
                    dispense("A1");
            }
                loop = false;
                break;
            case "A2":
                break;
            case "A3":
                break;
            case "B1":
                break;
            case "B2":
                break;
            case "B3":
                break;
            case "C1":
                break;
            case "C2":
                break;
            case "C3":
                break;
            case "D1":
                break;
            case "D2":
                break;
            case "D3":
                break;
            default:
                System.out.println("Sorry that is not valid!, try again!");
                break;
        }

    }
}
