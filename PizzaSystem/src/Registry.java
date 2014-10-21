import java.util.ArrayList;

/**
 * Created by Nik on 10/2/14.
 */

//This class is a bit conceptual right now.  We might end up deleting it later on.
public class Registry { //Singleton class, represents the system information. This may also be a controller.

    static int orderNumbers = 0;
    static ArrayList<Order> currentOrders;
    static ArrayList<Customer> customers;
    static ArrayList<Manager> managers;

    private static Registry aRegistry;

    private Registry() {
        currentOrders = new ArrayList<Order>();
        customers = new ArrayList<Customer>();
        managers = new ArrayList<Manager>();
    }

    public static Registry getInstance() {
        if (aRegistry == null) {
            aRegistry = new Registry();
        }

        return aRegistry;
    }

    public static void addCustomer(Customer aCustomer) { //May need to refine this. Don't know if contains will do it correctly
        if(!customers.contains(aCustomer)) {
            customers.add(aCustomer);
        }
    }

    public static void addOrder(Order anOrder) {
        currentOrders.add(anOrder);
    }

    public static int getNewOrderNumber() {
        orderNumbers = orderNumbers + 1;
        return orderNumbers;
    }

    public static ArrayList<Order> getCurrentOrders() {
        return currentOrders;
    }

    public static void setCurrentOrders(ArrayList<Order> currentOrders) {
        Registry.currentOrders = currentOrders;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
