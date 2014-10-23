package Contollers;

/**
 * Created by yabsubu12 on 10/23/14.
 */
public class MenuController {
    private static MenuController ourInstance = new MenuController();

    public static MenuController getInstance() {
        return ourInstance;
    }

    private MenuController() {
        
    }
}
