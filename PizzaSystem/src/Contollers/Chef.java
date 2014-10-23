package Contollers;

import TempPackage.User;

/**
 * Created by Nik on 10/2/14.
 */
public class Chef implements User {

    private String name;
    private int empID;

    public Chef(String name, int empID) {
        this.name = name;
        this.empID = empID;
    }

    public int getID(){ return empID; }

    public String getName(){ return name; }

    public void setName(String name){ this.name = name; }

    public String toString(){ return "Chef " + empID + ": " + name; }
}







