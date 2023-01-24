import java.util.HashMap;

public class Money extends Inventory{
    private double amount;

    public void setAmount(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
    //thinking of a hashmap that links to the inventory.
    public static HashMap<String,Double> priceOfItem = new HashMap<String,Double>();

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

    public boolean changeToUser(String id,double amount){
        //does the calculations for the price of item and returns the amount left
         if(amount < priceOfItem.get(id)){
             System.out.println("insufficient funds for this item.");
             return false;
         }
         Double change = amount - priceOfItem.get(id);
        System.out.println("Here is your change back " + change);
        return true;
    }

}
