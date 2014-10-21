/**
 * Created by Nik on 10/2/14.
 */
public class Manager implements User{

    String name;
    int empID;
    Login empLogin;
    Menu currentMenu;

    public Manager(String name, int empID, Login empLogin) {
        this.name = name;
        this.empID = empID;
        this.empLogin = empLogin;
    }

    public int getID(){
        return empID;
    }

    public String getName(){
        return name;
    }

    public Login getEmpLogin() {
        return empLogin;
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

    public boolean equals(Object obj) {
        if (!(obj instanceof Manager))
            return false;
        if (obj == this)
            return true;

        Manager aManager = (Manager) obj;
        if(aManager.getName().equals(this.name) && aManager.getID() == this.empID && aManager.empLogin.equals(this.empLogin)) {
            return true;
        } else {
            return false;
        }
    }
}
