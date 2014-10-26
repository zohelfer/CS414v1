package TestBackEnd;

import Contollers.ItemType;
import Contollers.MenuItem;
import Contollers.Writer;
import junit.framework.TestCase;

import java.util.HashSet;



public class WriterTest extends TestCase {

    public Writer writer = new Writer();

    public void testWriteMenu() throws Exception {

        HashSet<MenuItem> m = new HashSet<MenuItem>();
        m.add(new MenuItem("Pepperoni", 3.5, ItemType.SPECIAL));
        m.add(new MenuItem("Cheese", 5.0, ItemType.PIZZA));
        assertTrue(writer.writeMenu(m));
    }

    public void testWriteOrders() throws Exception {

    }

    public void testWriteIncompleteOrders() throws Exception {

    }

    public void testWriteCustomer() throws Exception {

    }

    public void testWriteLogin() throws Exception {

    }
}