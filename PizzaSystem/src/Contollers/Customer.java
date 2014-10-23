package Contollers;

import TempPackage.User;

/**
 * Created by Nik on 10/2/14.
 */
public class Customer implements User {

    String name;
    String phone;
    String address;
    private int custID;

    public Customer(String name, int id, String phone, String address) {
        this.name = name;
        this.custID = id;
        this.phone = phone;
        this.address = address;
    }

    public String getName(){ return name; }

    public int getID(){ return custID; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String toString(){ return "Customer " + custID + ": " + name; }

    public boolean equals(Object obj) {
        if (!(obj instanceof Customer))
            return false;

        Customer aCustomer = (Customer) obj;
        return aCustomer.getID() == this.getID();
    }
}
