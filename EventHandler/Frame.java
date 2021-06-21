import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Frame extends JFrame {
    public Frame(){
        this.setTitle("java");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(0,0);

       
        this.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        label.setSize(200,300);

        this.addMouseListener(new MouseListener(){
            public void mouseEntered(MouseEvent e){
                label.setText("이지은");
            }
            public void mouseExited(MouseEvent e){
                label.setText("바보");
            }
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseClicked(MouseEvent e){}
            
        });
        this.add(label);
        this.setVisible(true);
   

    }
    public static void main(String[] args) {
        JFrame frame= new Frame();
        frame.setSize(200,300);
        
    }
}
