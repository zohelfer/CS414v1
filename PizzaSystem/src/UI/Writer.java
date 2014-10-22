package UI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Writer {

	public void writeMenu(Menu m) {
		try {
			PrintWriter pw = new PrintWriter(new File("MENU"));
			for(MenuItem item : m.getMenuItems()) {
				pw.println(item.getName() + " " + item.getPrice() + " " + item.isSpecial());
			}
			pw.close();
		}
		catch(FileNotFoundException e) { }
	}
    public void writeOrders(ArrayList<Order> order) {
        try {
            PrintWriter pw = new PrintWriter(new File("ORDERS"));
            ArrayList<MenuItem> m = new ArrayList<MenuItem>();;
            for(Order o : order) {
                m = o.getOrderList();
                pw.println(o.getOrderNumber() + " " + o.getAmountDue() + " " + o.isComplete() + " " + m.size());
                for(MenuItem i : m) {
                    pw.println(i.getName() + " " + i.getPrice() + " " + i.isSpecial());
                }
            }
            pw.close();
        } catch(FileNotFoundException e) { }
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
