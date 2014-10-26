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

    public Hashtable<MenuItem, Integer> getOrderItems(){
        return orderItems;
    }
    // Returns the size of the order (# items)
    public int addToOrder(String n, double p, ItemType type){
        MenuItem adding = new MenuItem(n,p,type);
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
    public int getQuantity(String n, double p, ItemType type){
        MenuItem looking = new MenuItem(n,p,type);
        int quantity = -1;
        for(MenuItem m: orderItems.keySet()){
            if(m.equals(looking)){
                quantity = orderItems.get(m);
                break;
            }
        }
        return quantity;
    }

    public boolean completeItem(String n, double p, ItemType type) {
        MenuItem removing = new MenuItem(n, p, type);
        for(MenuItem m: orderItems.keySet()) {
            if(m.equals(removing)) {
                int oldQ = orderItems.get(m);
                orderItems.remove(m);
                if(oldQ > 1) {
                    orderItems.put(removing, oldQ - 1);
                }
                fileWriter.writeIncompleteOrders(orderItems);
                return true;
            }
        }
        return false;
    }

    public boolean sendBackToKitchen(String n, double p, ItemType type) {
        MenuItem sending = new MenuItem(n, p, type);
        for(MenuItem m: orderItems.keySet()) {
            if(m.equals(sending)) {
                int oldQ = orderItems.get(m);
                orderItems.remove(m);
                orderItems.put(sending, oldQ + 1);

                fileWriter.writeIncompleteOrders(orderItems);
                return true;
            }
        }
        orderItems.put(sending, 1);
        fileWriter.writeIncompleteOrders(orderItems);
        return false;
    }

    // Return: False - item not found
    public boolean removeAllMatchingItems(String n, double p, ItemType type){
        boolean found = false;
        MenuItem removing = new MenuItem(n,p,type);
        for(MenuItem m: orderItems.keySet()){
            if(m.equals(removing)){
                orderItems.remove(m);
                found = true;
                break;
            }
        }
        return found;
    }

    public double getOrderTotal(){
        double total = 0.0;
        for(MenuItem m: orderItems.keySet()){
            total += m.getPrice() * orderItems.get(m);
        }
        return total;
    }

    public boolean submitOrder(){
        return fileWriter.writeIncompleteOrders(orderItems);
    }
}
