package Facades;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Nik on 10/2/14.
 */

//This class is a bit conceptual right now.  We might end up deleting it later on.
//Singleton class, represents the system information. This may also be a controller.
public class Registry {

    static ArrayList<Integer> orderNumbers;
    static ArrayList<Order> currentOrders;
    static ArrayList<Customer> customers;
    static ArrayList<Manager> managers;
    static ArrayList<Chef> chefs;
    static ArrayList<MenuItem> menu;

    private Reader fileReader;
    private Writer fileWriter;
    private static Registry aRegistry;

    private Registry() {
        fileReader = new Reader();
        fileWriter = new Writer();
        currentOrders = fileReader.readOrders();
        menu = fileReader.readMenu();
        customers = new ArrayList<Customer>();
        managers = new ArrayList<Manager>();
        chefs = new ArrayList<Chef>();
    }

    public static Registry getInstance() {
        if (aRegistry == null) {
            aRegistry = new Registry();
        }
        return aRegistry;
    }

    public static void addCustomer(Customer aCustomer) {
        if(!customers.contains(aCustomer)) {
            customers.add(aCustomer);
        }
    }

    public static void addChef(Chef aChef) {
        if(!chefs.contains(aChef)) {
            chefs.add(aChef);
        }
    }

    public static void addManager(Manager aManager) {
        if(!managers.contains(aManager)) {
            managers.add(aManager);
        }
    }

    public static void addOrder(Order anOrder) {
        currentOrders.add(anOrder);
    }

    public static void removeOrder(Order anOrder) {
        currentOrders.remove(anOrder);
    }

    public static Integer getNewOrderNumber() {
        Random rand = new Random();
        Integer aNumber = rand.nextInt(Integer.MAX_VALUE) + 1;
        while(!orderNumbers.contains(aNumber)) {
            aNumber = rand.nextInt(Integer.MAX_VALUE) + 1;
        }
        orderNumbers.add(aNumber);
        return aNumber;
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

    public static ArrayList<Integer> getOrderNumbers() {
        return orderNumbers;
    }

    public static void setOrderNumbers(ArrayList<Integer> orderNumbers) {
        Registry.orderNumbers = orderNumbers;
    }

    public static ArrayList<Manager> getManagers() {
        return managers;
    }

    public static void setManagers(ArrayList<Manager> managers) {
        Registry.managers = managers;
    }

    public static ArrayList<Chef> getChefs() {
        return chefs;
    }

    public static void setChefs(ArrayList<Chef> chefs) {
        Registry.chefs = chefs;
    }

}
