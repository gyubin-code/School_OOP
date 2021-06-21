import java.awt.EventQueue;
import javax.swing.*;
public class menu {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            MenuFrame frame = new MenuFrame();
            frame.setDefaultCloseOperation(JFrame .EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
        );
    }
}
