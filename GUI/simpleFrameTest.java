import java.awt.*; // java.awt.EventQueue
import javax.swing.*;
import java.awt.EventQueue;

public class simpleFrameTest  {
    public static void main(String[] args) {

      
           EventQueue.invokeLater (
( ) ->
{
simpleFrame frame = new simpleFrame(); // user defined class(next slide)
// what happen when user clicks close button.
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this method is inherited.
frame.setVisible(true); // inherited method
} ) ; 
            
    }// end of main()
}
