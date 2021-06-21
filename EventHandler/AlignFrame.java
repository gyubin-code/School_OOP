//  AlignFrame.java
// Program creates a simple GUI.
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AlignFrame extends JFrame 
{
   private JPanel panel_1;
   private JCheckBox checkBox_1;
   private JCheckBox checkBox_2;

   public static final int size=8;
   private JPanel panel_2;
   private JLabel label_1;
   private JTextField textField_1;

   private JPanel panel_3;
   private JLabel label_2;
   private JTextField textField_2;

   private JPanel panel_4;

   private JPanel panel_5;
   private JButton button_1;
   private JButton button_2;
   private JButton button_3;
   // Starting from line 17, write your code that creates and dispaly the given GUI application.
   //  Use the given guideline to write your code. 
   public AlignFrame()
   {
      super("창입니다");

       /* Step 1.create two check boxes and store them in a panel_1 */
      panel_1 = new JPanel();
      checkBox_1 = new JCheckBox("Snap to Grid");
      checkBox_2 = new JCheckBox("Show Grid");
      panel_1.setLayout(new GridLayout(2, 1));
      panel_1.add(checkBox_1);
      panel_1.add(checkBox_2);
     
      /* step 2.1 creating jlable and jtext field*/
      panel_2 = new JPanel();
      label_1 = new JLabel("X ");
      textField_1 = new JTextField("8");
      panel_2.setLayout(new FlowLayout());
      panel_2.add(label_1);
      panel_2.add(textField_1);
      /*STEP 2.2 T*/
      panel_3 = new JPanel();
      label_2 = new JLabel("Y ");
      textField_2 = new JTextField("8");
      panel_3.setLayout(new FlowLayout());
      panel_3.add(label_2);
      panel_3.add(textField_2);
      
      /*2.3*/
      panel_4 = new JPanel();
      panel_4.setLayout(new BorderLayout());
      panel_4.add(panel_2, BorderLayout.NORTH);
      panel_4.add(panel_3, BorderLayout.SOUTH);
      
      /*3*/
      panel_5 = new JPanel();
      button_1 = new JButton("Ok");
      button_2 = new JButton("Cancel");
      button_3 = new JButton("Help");
      panel_5.setLayout(new GridLayout(3, 1, 10, 5));
      panel_5.add(button_1);
      panel_5.add(button_2);
      panel_5.add(button_3);

      /*4*/
      setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
      add(panel_1);
      add(panel_4);
      add(panel_5);

   }


} // end class AlignFrame