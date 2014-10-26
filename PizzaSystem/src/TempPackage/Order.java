package TempPackage;

import Contollers.MenuItem;

import java.util.ArrayList;

/**
 * Created by Nik on 10/2/14.
 */
public class Order {

    ArrayList<MenuItem> orderList;
    int orderNumber;
    double amountDue;
    boolean isComplete;

    public Order() {
        orderList = new ArrayList<MenuItem>();
        orderNumber = 0;
        amountDue = 0;
        isComplete = false;
    }

    public Order(ArrayList<MenuItem> orderList, int orderNumber, double amountDue, boolean isComplete){
        this.orderList = orderList;
        this.orderNumber = orderNumber;
        this.amountDue = amountDue;
        this.isComplete = isComplete;
    }

    public void addItem(MenuItem anItem) {
        orderList.add(anItem);
    }

    public void removeItem(MenuItem anItem) {
        orderList.remove(anItem);
    }

    public ArrayList<MenuItem> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<MenuItem> orderList) {
        this.orderList = orderList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void markComplete() {
        this.isComplete = true;
    }

}
