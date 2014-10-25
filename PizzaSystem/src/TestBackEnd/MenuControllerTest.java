package TestBackEnd;

import Contollers.MenuController;
import TempPackage.Menu;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;
import Contollers.MenuItem;
import java.util.Set;
/**
 * Created by yabsubu12 on 10/25/14.
 */
public class MenuControllerTest {

    MenuController mc;

    @Test
    public void testGetInstance() throws Exception {
        mc = MenuController.getInstance();
        assertNotNull(mc);
    }

    @Test
    public void testLoadMenu() throws Exception {
        mc = MenuController.getInstance();
        assertNotNull(mc.loadMenu());
    }
    // Test items are loaded properly as a set

    @Test
    public void testAddNewItem() throws Exception {
        mc = MenuController.getInstance();
        System.out.println(mc.loadMenu());
        mc.addItem("Donuts", 4.5, false);
        System.out.println(mc.loadMenu());
        System.out.println(mc.loadMenu().contains(new MenuItem("Donuts", 4.5, false)));
    }
    // Add test for adding null existing item

    @Test
    public void testRemoveItem() throws Exception {
        mc = MenuController.getInstance();
        Set<MenuItem> menuItems = mc.loadMenu();
        MenuItem removed = new MenuItem("Pepperoni", 3.5, false);
        mc.removeItem("Pepperoni", 3.5, false);
        assertFalse(menuItems.contains(removed));
    }

    @Test
    public void testSaveMenu() throws Exception {

    }

    @Test
    public void testEditItem() throws Exception {

    }
}
