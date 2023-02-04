import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Inventory {
    //a hashmap that looks like this {"ID",["5","NAME]}
   public static HashMap<String, List<String>> inventoryMap = new HashMap<>();

    public Inventory(){ //initializes the hashmap with items
        inventoryMap.put("A1", Arrays.asList("1","Doritos"));
        inventoryMap.put("A2", Arrays.asList("5","Coke"));
        inventoryMap.put("A3", Arrays.asList("5","Skittles"));
    }

    public static void dispense(String id){
        //we take the hashmap count of the item, subtract 1 from it and update the value
         int count = Integer.parseInt(inventoryMap.get(id).get(0));
        if (count != 0){
            count--;
            inventoryMap.get(id).set(0,String.valueOf(count));
            System.out.println("DISPENSED: " + inventoryMap.get(id).get(1));
        }
    }

    public static void showInventory(){
        String[] id = {"A1","A2","A3"};
        System.out.println("~~~~~INVENTORY~~~~~");
        for (String s : id) {
            System.out.println(inventoryMap.get(s).get(1) + " : " + inventoryMap.get(s).get(0)); // NAME : COUNT
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~");
    }
}
