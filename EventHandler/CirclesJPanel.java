//CirclesJPanel.java
// Program calculates the area, circumference
// and diameter for a circle and draws the circle
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class CirclesJPanel extends JPanel
{
   private double radius;
   private int x;
   private int y;

   // constructor initialize applet by obtaining values from user
   public CirclesJPanel(double inputRadius, int inputX, int inputY)
   {
      radius = inputRadius;
      x = inputX;
      y = inputY;
   } 

   // draw results on applet's background
   public void paintComponent(Graphics g)
   {
      // Graphics2D g2d = (Graphics2D) g;
      super.paintComponent(g);
      
      Graphics2D g2d = (Graphics2D) g;
      g2d.drawString(String.format(
         "Diameter is %f", (2 * radius)), 25, 30);
      g2d.drawString(String.format(
         "Area is %f", (Math.PI * radius * radius)), 25, 45);
      g2d.drawString(String.format(
         "Circumference is %f", (2 * Math.PI * radius)), 25, 60);
      

      g2d.setColor(Color.BLACK);
      
      
   } 
} // end class CirclesJPanel

