/**
 * Created by Nik on 10/21/14.
 */
public class Login {

    String username;
    String password;
    int empID;

       public Login(String username, String password, int empID) {
           this.username = username;
           this.password = password;
           this.empID = empID;
       }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Login))
            return false;
        if (obj == this)
            return true;

        Login aLogin = (Login) obj;
        if(aLogin.getUsername().equals(this.username) && aLogin.getPassword().equals(this.password) && aLogin.getEmpID() == this.empID) {
            return true;
        } else {
            return false;
        }
    }
}
