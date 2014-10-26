package Contollers;

import TempPackage.Order;

import java.io.*;
import java.util.ArrayList;

import java.util.Hashtable;
import java.util.Set;

public class Writer {

    private String splitDelimiter = " ";

	public boolean writeMenu(Set<MenuItem> m) {
        boolean wroteSuccess;
		try {
			PrintWriter pw = new PrintWriter(new File(FileName.MENU.name()));
			for(MenuItem item : m) {
				pw.println(item.getName() +
                        splitDelimiter +
                        item.getPrice() +
                        splitDelimiter +
                        item.isSpecial());
			}
			pw.close();
            wroteSuccess = true;
		}
		catch(FileNotFoundException e) { wroteSuccess = false; }
        return wroteSuccess;
	}
    public void writeOrders(ArrayList<Order> order) {
        try {
            PrintWriter pw = new PrintWriter(new File(FileName.ORDER.name()));
            ArrayList<MenuItem> m = new ArrayList<MenuItem>();
            for(Order o : order) {
                m = o.getOrderList();
                pw.println(o.getOrderNumber() + splitDelimiter +
                        o.getAmountDue() + splitDelimiter +
                        o.isComplete() + splitDelimiter + m.size());

                for(MenuItem i : m) {
                    pw.println(i.getName() + splitDelimiter +
                            i.getPrice() + splitDelimiter + i.isSpecial());
                }
            }
            pw.close();
        } catch(FileNotFoundException e) { }
    }

    public boolean writeIncompleteOrders(Hashtable<MenuItem, Integer> orderItems){
        try{
            File f = new File(FileName.INCOMPLETE.name());
            if(!f.exists()){
                f.createNewFile();
                return false;
            }
            // is it this easy? lol
            synchronized(f){
                BufferedWriter bfw = new BufferedWriter(new FileWriter(f));
                for(MenuItem m : orderItems.keySet()){
                    String quantity = String.valueOf(orderItems.get(m)) + splitDelimiter;
                    bfw.write(quantity, 0, quantity.length());
                    bfw.write(m.toString(),0,m.toString().length());
                    bfw.newLine();
                }
                bfw.close();
            }
        }
        catch(IOException ioE){
            System.out.println("Problem writing INCOMPLETE file");
            ioE.printStackTrace();
            return false;
        }
        return true;
    }

/*
    public static void main(String[] args) {
        Writer w = new Writer();
        ArrayList<MenuItem> m = new ArrayList<MenuItem>();
        MenuItem pep = new MenuItem("Pepperoni", 3.5, false);
        MenuItem cheese = new MenuItem("Cheese", 9.5, true);
        MenuItem soda = new MenuItem("Soda", 1.5, false);
        MenuItem cookie = new MenuItem("Cookie", 22.2, false);
     //   Menu m = Menu.getInstance();
        m.add(pep);
        m.add(cheese);
        m.add(soda);
        m.add(cookie);
        Order o = new Order(m, 1, 1.5, false);
        Order a = new Order(m, 2, 4.6, false);
        ArrayList<Order> ol = new ArrayList<Order>();
        ol.add(o);
        ol.add(a);
        w.writeOrders(ol);

    }
	*/
}
