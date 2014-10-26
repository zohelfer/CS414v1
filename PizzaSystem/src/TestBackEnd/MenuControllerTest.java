package TestBackEnd;

import Contollers.ItemType;
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

    MenuController mc= MenuController.getInstance();

    @Test
    public void testGetInstance() throws Exception {
        mc = MenuController.getInstance();
        assertNotNull(mc);
    }

    @Test
    public void testLoadMenu() throws Exception {
        assertNotNull(mc.loadMenu());
    }
    // Test items are loaded properly as a set

    @Test
    public void testAddNewItem() throws Exception {
        int initSize = mc.loadMenu().size();
        mc.addItem("Donuts", 4.5, ItemType.SPECIAL);
        int newSize = mc.loadMenu().size();
        assertEquals(initSize + 1, newSize);
    }
    // Add test for adding null existing item

    @Test
    public void testRemoveItem() throws Exception {
        int initSize = mc.loadMenu().size();
        mc.removeItem("Pepperoni", 3.5, ItemType.SPECIAL);
        int newSize = mc.loadMenu().size();
        assertEquals(initSize -1, newSize);
    }

    @Test
    public void testSaveMenu() throws Exception {

    }

    @Test
    public void testEditItem1() throws Exception {
        mc.addItem("Cheese", 6.7, ItemType.PIZZA);
        assertTrue(mc.editItem("Cheese", "Pepperoni", 7.0, ItemType.SPECIAL));
    }

    @Test
    public void testEditItem2() throws Exception {
        assertFalse(mc.editItem("Cheese", "Pepperoni", 7.0, ItemType.SPECIAL));
    }
}
