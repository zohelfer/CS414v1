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
        Set<MenuItem> menuItems = mc.loadMenu();
        MenuItem testItem = new MenuItem("Pepperoni", 3.5, false);
        assertTrue(menuItems.contains(testItem));
    }

    @Test
    public void testAddItem() throws Exception {
        mc = MenuController.getInstance();

    }

    @Test
    public void testRemoveItem() throws Exception {

    }

    @Test
    public void testSaveMenu() throws Exception {

    }

    @Test
    public void testEditItem() throws Exception {

    }
}
