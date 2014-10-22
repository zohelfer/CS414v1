package UI;

/**
 * Created by Nik on 10/2/14.
 */
public class Manager implements User {

    String name;
    int empID;
    Menu currentMenu;

    public Manager(String name, int empID) {
        this.name = name;
        this.empID = empID;
    }

    public int getID(){
        return empID;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "Manager " + empID + ": " + name;
    }

    public void createMenu() {
        currentMenu = Menu.getInstance();
    }

    public void createMenuItem(String name, double price, boolean isSpecial) {
        currentMenu.addItem(name, price, isSpecial);
    }

    public void modifyItem(String name, double newPrice) {
        currentMenu.modifyItem(name, newPrice);
    }

    public void removeItem(String name) {
        currentMenu.removeItem(name);
    }

    public void setSpecial(String name, boolean isSpecial) {
        currentMenu.setSpecial(name, isSpecial);
    }
}
