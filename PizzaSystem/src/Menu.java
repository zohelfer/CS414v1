import java.util.ArrayList;

/**
 * Created by Nik on 10/2/14.
 */
public class Menu { //Singleton class, only 1 menu can exist.

    ArrayList<MenuItem> menuItems;
    MenuItem currentSpecial;
    private static Menu aMenu;

    private Menu() {
        menuItems = new ArrayList<MenuItem>();
        currentSpecial = null;
    }

    public static Menu getInstance() {
        if (aMenu == null) {
            aMenu = new Menu();
        }

        return aMenu;
    }

    public void addItem(String name, double price, boolean isSpecial) {
        MenuItem anItem = new MenuItem(name, price, isSpecial);
    }

    public void addItem(MenuItem anItem) {
        menuItems.add(anItem);
    }

    public void modifyItem(String name, double newPrice) {
        for(MenuItem anItem: menuItems) {
            if(anItem.getName().equals(name)) {
                anItem.setPrice(newPrice);
            }
        }
    }

    public void removeItem(String name) {
        for(MenuItem anItem: menuItems) {
            if(anItem.getName().equals(name)) {
                menuItems.remove(anItem);
            }
        }
    }

    public void setSpecial(String name, boolean isSpecial) {
        for(MenuItem anItem: menuItems) {
            if(anItem.getName().equals(name)) {
                anItem.setSpecial(isSpecial);
                if(isSpecial) {             //Making an item the special
                    currentSpecial = anItem;
                } else {                    //Removing an item from being the special
                    currentSpecial = null;
                }
            }
        }
    }
    public ArrayList<MenuItem> getMenuItems() {
    	return menuItems;
    }
}
