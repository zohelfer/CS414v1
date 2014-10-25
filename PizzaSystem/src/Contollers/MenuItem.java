package Contollers;

import TempPackage.Menu;

/**
 * Created by Nik on 10/2/14.
 */
public class MenuItem {

    private String name;
    private double price;
    private boolean isSpecial;

    public MenuItem(String name, double price, boolean isSpecial) {
        this.name = name;
        this.price = price;
        this.isSpecial = isSpecial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public void makeSpecial() {
        this.isSpecial = true;
    }

    public boolean equals(Object o){
        if(o instanceof MenuItem){
            MenuItem newM = (MenuItem) o;
            return this.name.equalsIgnoreCase(newM.getName());
        }
        return false;
    }

    public String toString(){
        return "MenuItem: " + this.name + " " + this.price + " " + this.isSpecial;
    }
}
