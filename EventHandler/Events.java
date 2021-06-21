//  Events.java
// Program displays events that occur during execution.
import javax.swing.JFrame;

public class Events
{
   public static void main(String[] args)
   {
     /* Starting from line 12, write the code to test "EventsFrame" that dispaly 
      * the given GUI elements 
     */
    EventsFrame frame = new EventsFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(375, 325);
    frame.setVisible(true);
	   
   } // end class Events
}
