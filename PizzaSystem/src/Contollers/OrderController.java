package Contollers;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by yabsubu12 on 10/23/14.
 */
public class OrderController {
    private static OrderController ourInstance = new OrderController();

    public static OrderController getInstance() {
        return ourInstance;
    }

    private Hashtable<MenuItem, Integer> orderItems;
    private Reader fileReader;
    private Writer fileWriter;

    private OrderController() {
        fileWriter = new Writer();
        orderItems = new Hashtable<MenuItem, Integer>();
    }

    // Resets to an empty order
    public void resetInstance(){
        ourInstance = new OrderController();
    }
    // Returns the size of the order (# items)
    public int addToOrder(String n, double p, boolean isS){
        MenuItem adding = new MenuItem(n,p,isS);
        int oldQuantity = 0;
        for(MenuItem m: orderItems.keySet()){
            if(m.equals(adding)){
                oldQuantity = orderItems.get(m);
                orderItems.remove(m);
                break;
            }
        }
        orderItems.put(adding, oldQuantity + 1);
        return orderItems.get(adding); //Size of new item
    }

    // Return: -1 if item not found
    public int getQuantity(String n, double p, boolean isS){
        MenuItem looking = new MenuItem(n,p,isS);
        int quantity = -1;
        for(MenuItem m: orderItems.keySet()){
            if(m.equals(looking)){
                quantity = orderItems.get(m);
                break;
            }
        }
        return quantity;
    }

    // -1 if item not found
    public int removeSingleItemFromOrder(String n, double p, boolean isS){
        MenuItem removing = new MenuItem(n,p,isS);
        int newQuantity = -1;
        for(MenuItem m: orderItems.keySet()){
            if(m.equals(removing)){
                int oldQuantity = orderItems.get(m);
                orderItems.remove(m);
                orderItems.put(removing, oldQuantity -1);
                newQuantity = orderItems.get(removing);
                break;
            }
        }
        return newQuantity;
    }

    // Return: False - item not found
    public boolean removeAllMatchingItems(String n, double p, boolean isS){
        boolean found = false;
        MenuItem removing = new MenuItem(n,p,isS);
        for(MenuItem m: orderItems.keySet()){
            if(m.equals(removing)){
                orderItems.remove(m);
                found = true;
                break;
            }
        }
        return found;
    }

    public boolean submitOrder(){
        return fileWriter.writeIncompleteOrders(orderItems);
    }
}
