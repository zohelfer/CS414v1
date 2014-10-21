/**
 * Created by Nik on 10/2/14.
 */
public class Customer implements User {

    String name;
    String phone;
    String address;
    int id;

    Order currentOrder;

    public Customer(String name, int id) { //In store customer
        this.name = name;
        this.id = id;
        //Registry.addCustomer(this);
    }

    public Customer(String name, int id, String phone, String address) { //Phone or online customer
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.address = address;
        //Registry.addCustomer(this);
    }
    public void createOrder() {
        currentOrder = new Order();
    }

    public void addItem(MenuItem anItem) {
        currentOrder.addItem(anItem);
    }

    public void removeItem(MenuItem anItem) {
        currentOrder.removeItem(anItem);
    }

    public void finishOrdering() {
        currentOrder.setOrderNumber(Registry.getNewOrderNumber());
        Registry.addOrder(currentOrder);
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public void cancelOrder() {
        currentOrder = null;
    }

    public String toString(){
        return "Customer " + id + ": " + name;
    }
}
