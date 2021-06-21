import java.awt.EventQueue;
import javax.swing.*;
public class Text {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            TextComponentFrame frame = new TextComponentFrame();
            frame.setSize(400,400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
        }
        );
    }
}
