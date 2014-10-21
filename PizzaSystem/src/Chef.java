import java.util.ArrayList;

/**
 * Created by Nik on 10/2/14.
 */
public class Chef implements User{

    String name;
    int empID;

    public Chef(String name, int empID) {
        this.name = name;
        this.empID = empID;
    }

    public int getID(){
        return empID;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Order> viewOrders() {
        return Registry.getCurrentOrders();
    }

    public void markComplete(int orderNumber) {
        ArrayList<Order> currentOrders = viewOrders();
        for(Order anOrder: currentOrders) {
            if(anOrder.getOrderNumber() == orderNumber) {
                anOrder.setComplete(true);
            }
        }
    }
}
