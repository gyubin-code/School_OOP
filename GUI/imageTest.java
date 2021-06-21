import java.awt.EventQueue;
import javax.swing.*;
public class imageTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(
            ()->
            {
                JFrame frame = new imageFrame();
                frame.setLocation(200,500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("imageTest");
                frame.setVisible(true);
            }
        );
    }
}
