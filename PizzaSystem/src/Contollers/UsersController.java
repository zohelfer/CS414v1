package Contollers;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ydubale on 10/25/14.
 */
public class UsersController {
    private static UsersController ourInstance = new UsersController();

    public static UsersController getInstance() {
        return ourInstance;
    }

    private HashSet<Customer> customers;
    private HashSet<Manager> managers;
    private Reader fileReader;
    private Writer fileWriter;

    private UsersController() {
        customers = new HashSet<Customer>();
        managers = new HashSet<Manager>();
        fileReader = new Reader();
        fileWriter = new Writer();
        customers = fileReader.readCustomer();
    }

    //False: if customer already exists
    public boolean createNewCust(String n, String p, String a, String e){
        boolean custE = customers.add(new Customer(n,p,a,e,customers.size()));


        return custE;
    }
}
