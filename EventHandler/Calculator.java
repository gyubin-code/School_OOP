import java.awt.EventQueue;
import javax.swing.*;
public class Calculator {
    public static void main(String[] args) {
        EventQueue.invokeLater(
                ()->
            {   JFrame con = new JFrame();
                CalculatorPanel frame =new CalculatorPanel();

                con.setTitle("Calculator");
                con.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                con.setSize(500,500);
                con.add(frame);
                con.setVisible(true);
            }
        );
    }
}
