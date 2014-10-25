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
        return orderItems.get(adding);
    }

//    public int addToOrder(MenuItem mi){
//        //orderItems.add()
//    }
}
