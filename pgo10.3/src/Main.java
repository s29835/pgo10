import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items=new ArrayList<>();
        items.add(new Item(1,"Bottle"));
        items.add(new Item(2,"T-shirt"));
        items.add(new Item(3,"Dress"));
        items.add(new Item(4,"Skirt"));
        items.add(new Item(5,"Jacket"));
        items.add(new Item(6,"Book"));
        items.add(new Item(7,"Laptop"));
        items.add(new Item(8,"Charger"));
        items.add(new Item(9,"Sandwich"));
        items.add(new Item(10,"Sunglasses"));


        List<Item> firstFiveItems = items.subList(0,5);
        Set<Item> itemSet = new HashSet<>(firstFiveItems);

        for(Item item: itemSet){
            System.out.println("ID: " + item.getId() + "," + "Name: " + item.getName());
        }

    }
}