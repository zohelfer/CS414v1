package Contollers;

/**
 * Created by yabsubu12 on 10/23/14.
 */
public class OrderController {
    private static OrderController ourInstance = new OrderController();

    public static OrderController getInstance() {
        return ourInstance;
    }

    private Reader fileReader;
    private Writer fileWriter;

    private OrderController() {
        fileWriter = new Writer();

    }
}
