import javax.swing.*;
import java.awt.*;
/**
 * Created by yabsubu12 on 10/5/14.
 */
public class Menu extends JApplet  {

    private static final int APP_WIDTH = 600;
    private static final int APP_HEIGHT = 600;
    private static final String COMPANY_NAME = "THE PIZZA HOUSE";


    public void init(){
        setSize(APP_WIDTH, APP_HEIGHT);
        setLayout(new BorderLayout());
        addTop();

    }

    public void addTop(){
        JPanel topPane = new JPanel(new FlowLayout());

        JLabel compName = new JLabel(COMPANY_NAME);

        //Adding to topPane
        topPane.add(compName);

        this.add(topPane, BorderLayout.NORTH);
    }

}
