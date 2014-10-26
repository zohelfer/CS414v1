package TestBackEnd;

import Contollers.ItemType;
import Contollers.MenuItem;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by yabsubu12 on 10/23/14.
 */
public class MenuItemTest {
    @Test
    public void testGetName() throws Exception {

    }

    @Test
    public void testSetName() throws Exception {

    }

    @Test
    public void testGetPrice() throws Exception {

    }

    @Test
    public void testSetPrice() throws Exception {

    }

    @Test
    public void testIsSpecial1() throws Exception {
        MenuItem anItem = new MenuItem("Pizza", 6.5, ItemType.SPECIAL);
        assertEquals(ItemType.SPECIAL, anItem.getType());

    }

    @Test
    public void testIsSpecial2() throws Exception {
        MenuItem anItem = new MenuItem("Pizza", 6.5, ItemType.PIZZA);
        assertFalse(anItem.getType() == ItemType.SPECIAL);
    }

    @Test
    public void testChangeType() throws Exception {

    }
}
