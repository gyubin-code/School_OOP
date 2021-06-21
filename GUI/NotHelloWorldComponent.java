import java.awt.Graphics;
import java.awt.*;
import javax.swing.JComponent;

public class NotHelloWorldComponent extends JComponent {
    public static final int MESSAGE_X=75;
    public static final int MESSAGE_Y=100;
    private static final int DEFAULT_WIDTH=300;
    private static final int DEFAULT_HEIGHT=100;

    public void paintComponent(Graphics g){
        g.drawString("not a hello world programe", MESSAGE_X, MESSAGE_Y);
    }

    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
