import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Inventory {
    //idea here is to add hashmap to store the items in the machine
    /*
    {(A1),((COUNT, "Doritos"))] the first slot will contain the number of items left and the second slot will be
    the slot and name of the item

     */
    public static HashMap<String,List<String>> pairs = new HashMap<>(); //for now, we will not keep track of the items

    public static void initializeInventory(){
        pairs.put("A1",Arrays.asList("5","Doritos"));
        pairs.put("A2",Arrays.asList("5","Pringles"));
        pairs.put("A3",Arrays.asList("5","Pretzels"));
        pairs.put("B1",Arrays.asList("5","Coke"));
        pairs.put("B2",Arrays.asList("5","Pepsi"));
        pairs.put("B3",Arrays.asList("5","Sprite"));
        pairs.put("C1",Arrays.asList("5","Skittles"));
        pairs.put("C2",Arrays.asList("5","M&M"));
        pairs.put("C3",Arrays.asList("5","Twixs"));
        pairs.put("D1",Arrays.asList("5","Hersheys"));
        pairs.put("D2",Arrays.asList("5","KitKat"));
        pairs.put("D3",Arrays.asList("5","Popcorn"));
    }

    public void dispense(String id){
        int count = Integer.parseInt(pairs.get(id).get(0)); //number of items left in the machine
        //remove the amount taken out of it
        count--;
        pairs.get(id).set(0,String.valueOf(count));
        if(count == 0){
            System.out.println("Sorry this is out of stock. Come again later!");
        }
        else{
            System.out.println("Here is the " + pairs.get(id).get(1));
        }
    }

}
