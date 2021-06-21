import java.awt.EventQueue;
import javax.swing.JFrame;

public class NotHelloWorld {
    public static void main(String[] args) {
        
    EventQueue.invokeLater(
        ()->
        {
            JFrame frame= new NotHelloWorldFrame();
            frame.setTitle("not hello");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300,500);
            frame.setVisible(true);

        }
    );

    }
}
