package TestBackEnd;

import org.junit.Test;
import Contollers.OrderController;

import static org.junit.Assert.*;

public class OrderControllerTest {

    OrderController oc = OrderController.getInstance();

    @Test
    public void testGetInstance() throws Exception {
//        System.out.println("Test 1");
        oc = OrderController.getInstance();
        assertNotNull(oc);
    }

    @Test
    public void testAddToOrder() throws Exception {
        int newQ = oc.addToOrder("New", 4.0, false);
        assertEquals(1, newQ);
    }

    @Test
    public void testSecondAddToOrder() throws Exception {
        int newQ = oc.addToOrder("New", 4.0, false);
        assertEquals(2, newQ);
    }
}