package Contollers;

import TempPackage.Order;

import java.io.*;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Reader {

    private String splitDelimiter = " ";

    public HashSet<MenuItem> readMenu() {
		HashSet<MenuItem> m = new HashSet<MenuItem>();
		MenuItem mi;
		try {
			Scanner scan = new Scanner(new File(FileName.MENU.name()));
			while(scan.hasNextLine()) {
             String[] line = scan.nextLine().split(splitDelimiter);
             if(line.length > 1) {
                 mi = new MenuItem(line[0], Double.parseDouble(line[1]), Boolean.parseBoolean(line[2]));
                 m.add(mi);
             }
            }
			scan.close();
		}
		catch(FileNotFoundException e) {
            System.err.print("Could not find file\n");
        }
		return m;
	}
	public ArrayList<Order> readOrders() {
		ArrayList<Order> o = new ArrayList<Order>();
		Order order;
		MenuItem m;
		int orderNumber;
		double amountDue;
		boolean isComplete;
		try {
			Scanner scan = new Scanner(new File(FileName.ORDER.name()));
            ArrayList<MenuItem> items = new ArrayList<MenuItem>();
			while(scan.hasNextLine()) {
                String[] info = scan.nextLine().split(splitDelimiter);
                if(info.length > 1) {
                    for (int i = 0; i < Integer.parseInt(info[3]); i++) {
                        String[] item = scan.nextLine().split(splitDelimiter);
                        MenuItem mi = new MenuItem(item[0],
                                Double.parseDouble(item[1]),
                                Boolean.parseBoolean(item[2]));
                        items.add(mi);
                    }
                    order = new Order(items, Integer.parseInt(info[0]),
                            Double.parseDouble(info[1]),
                            Boolean.parseBoolean(info[2]));
                    o.add(order);
                }
			}
			scan.close();
		}
		catch(FileNotFoundException e) {
            System.err.print("Could not find file\n");
		}
		return o;
	}

    public Hashtable<MenuItem, Integer> readIncomplete(){
        Hashtable<MenuItem, Integer> incompleteOrders = new Hashtable<MenuItem, Integer>();
        try{
            File f = new File(FileName.INCOMPLETE.name());
            if(!f.exists()){
                f.createNewFile();
                return incompleteOrders;
            }
            synchronized (f){
                BufferedReader bfr = new BufferedReader(new FileReader(f));
                String line;
                while((line = bfr.readLine()) != null){
                    String[] allLines = line.split(splitDelimiter);
                    Integer quantity = new Integer(allLines[0]);
                    MenuItem m = new MenuItem(
                            allLines[1],
                            Double.parseDouble(allLines[2]),
                            Boolean.parseBoolean(allLines[3]));

                    incompleteOrders.put(m,quantity);
                }
            }
        }
        catch(IOException ioE){
            System.err.print("Error with " + FileName.INCOMPLETE.name());
            return new Hashtable<MenuItem, Integer>();
        }
        return incompleteOrders;
    }
    /*
    public static void main(String[]args ) {
       Reader r = new Reader();
       ArrayList<MenuItem> m = new ArrayList<MenuItem>();
       m = r.readMenu();
        for(MenuItem i : m) {
            System.out.println(i.getName() + " " + i.getPrice());
        }
        ArrayList<Order> o = new ArrayList<Order>();
        o = r.readOrders();
        for(Order or : o) {
            System.out.println("OrderNumber: " + or.getOrderNumber());
        }
    } */
		
}
