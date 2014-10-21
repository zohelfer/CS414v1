import java.util.ArrayList;

/**
 * Created by Nik on 10/2/14.
 */
public class Chef implements User{

    String name;
    int empID;
    Login empLogin;

    public Chef(String name, int empID, Login empLogin) {
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

    public void setEmpLogin(Login empLogin) {
        this.empLogin = empLogin;
    }

    public String toString(){
        return "Chef " + empID + ": " + name;
    }
    public ArrayList<Order> viewOrders() {
        return Registry.getCurrentOrders();
    }

    public void markComplete(int orderNumber) {
        ArrayList<Order> currentOrders = viewOrders();
        for(Order anOrder: currentOrders) {
            if(anOrder.getOrderNumber() == orderNumber) {
                anOrder.setComplete(true);
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Chef))
            return false;
        if (obj == this)
            return true;

        Chef aChef = (Chef) obj;
        if(aChef.getName().equals(this.name) && aChef.getID() == this.empID && aChef.empLogin.equals(this.empLogin)) {
            return true;
        } else {
            return false;
        }
    }
}
