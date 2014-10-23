package Contollers;

/**
 * Created by Nik on 10/2/14.
 */
public class MenuItem {

    String name;
    double price;
    boolean isSpecial;

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
}
