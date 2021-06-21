  //Circle.java
// Program calculates the area, circumference
// and diameter for a circle and draws the circle
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Circle
{
   public static void main(String args[])
   {
      // starting from line 13, create a frame that tests  CirclesJPanel and dispaly 
	   // four figures one by one  
      String radius =
			   JOptionPane.showInputDialog("Enter radius:");
	   String xCoordinate =
			   JOptionPane.showInputDialog("Enter x-coordinate:");
	   String yCoordinate =
			   JOptionPane.showInputDialog("Enter y-coordinate:");
      
      double intRadius=Double.parseDouble(radius);
      int intX=Integer.parseInt(xCoordinate);
      int intY=Integer.parseInt(yCoordinate);

      CirclesJPanel panel = new CirclesJPanel(intRadius, intX, intY);
      JFrame frame = new JFrame();
      frame.setTitle("Circle");
      frame.setSize(200,250);
      frame.add(panel);
      JComponent circle = new CirclesJPanel(intRadius, intX, intY);
      frame.add(circle);
      frame.setVisible(true);
      

   
      //JOptionPane.showMessageDialog(null,panel,"circle",JOptionPane.PLAIN_MESSAGE);
      
   }
} // end class Circle

