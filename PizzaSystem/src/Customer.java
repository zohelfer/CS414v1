/**
 * Created by Nik on 10/2/14.
 */
public class Customer {

    String name;
    String phone;
    String address;

    Order currentOrder;

    public Customer(String name, String phone) { //In store customer
        this.name = name;
        Registry.addCustomer(this);
    }

    public Customer(String name, String phone, String address) { //Phone or online customer
        this.name = name;
        this.phone = phone;
        this.address = address;
        Registry.addCustomer(this);
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

    public void cancelOrder() {
        currentOrder = null;
    }
}
