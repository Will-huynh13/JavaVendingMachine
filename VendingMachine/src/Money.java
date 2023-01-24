import java.util.HashMap;
import java.util.Scanner;

public class Money extends Inventory{
    public static HashMap<String,Double> priceOfItem = new HashMap<>();

    public static void initializeInventory(){
        priceOfItem.put("A1", 2.50);
        priceOfItem.put("A2", 3.50);
        priceOfItem.put("A3", 1.50);
        priceOfItem.put("B1", 1.50);
        priceOfItem.put("B2", 1.50);
        priceOfItem.put("B3", 1.50);
        priceOfItem.put("C1", 1.20);
        priceOfItem.put("C2", 1.20);
        priceOfItem.put("C3", 1.50);
        priceOfItem.put("D1", 2.25);
        priceOfItem.put("D2", 2.50);
        priceOfItem.put("D3", 1.00);
    }

    public double changeToUser(Scanner input,String id,double amount){
        //does the calculations for the price of item and returns the amount left
        //first we need to check if the user enter less than what the amount is, prompt them until the amount is reached
        //then we can either dispense or if they enter more than what is needed then we
         var change = 0.0;
         if(amount < 0){ //we need to check
             System.out.println("this is not valid.");
             return -1;
         }
        if(itemCheck == 0){
            System.out.println("Here is your money back" + amount);
            return amount;
        }
         while(amount < priceOfItem.get(id)){
             amount += Double.parseDouble(input.nextLine());
             if (amount == priceOfItem.get(id)){
                 return 0;
             }
             if(amount >= priceOfItem.get(id)){
                 change = amount - priceOfItem.get(id);
                 System.out.println("Here is your change back " + change);
                 return change;
             }
         }
             return change;
    }

}
