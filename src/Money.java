import java.util.HashMap;
import java.util.Scanner;

public class Money {
    public static HashMap<String,Double> costMap = new HashMap<>();

    public Money() {
        costMap.put("A1", 2.50);
        costMap.put("A2", 1.25);
        costMap.put("A3", 2.00);
    }

    public static void cashBack(Scanner input, String id, double amount){
        var change = 0.0;
        if(Integer.parseInt(Inventory.inventoryMap.get(id).get(0)) == 0){
            System.out.println("Sorry the item you want is out of stock!");
            System.out.println("Here is your money back: " + amount);
            return;
        }
        if(amount == costMap.get(id)){
            Inventory.dispense(id);
            return;
        }
        while(amount < costMap.get(id)){ //when it is less than the amount
            amount += Double.parseDouble(input.nextLine());
            if(amount >= costMap.get(id)){
                break;
            }
        }
        change = amount - costMap.get(id);
        if(change != 0){
            Inventory.dispense(id);
            System.out.println("Change back: $" + String.format("%.2f",change));
        }
        else{
            Inventory.dispense(id);
        }
    }
}
