// ConvertFrame.java
// Temperature-conversion program
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;




import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ConvertFrame extends JFrame implements ActionListener,KeyListener
{
	public static final int TEXTAREA_ROWS = 10;
	
	private JLabel northlable;
	
	private JTextField textField;
	private JTextArea f_textField;

	private JLabel southlable;



	public  ConvertFrame(){

			super("Temp...");

			northlable = new JLabel("Enter Fahrenheit temperature");
			
			textField = new JTextField(TEXTAREA_ROWS);

			southlable = new JLabel("Temperature in Celsius is:");

			f_textField= new JTextArea(TEXTAREA_ROWS,TEXTAREA_ROWS);

		
		

		


			textField.addKeyListener(this);

			textField.addActionListener(
				new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
					JTextField t =(JTextField)e.getSource();
					int intX=Integer.parseInt(t.getText());
					int result =(9/5)*(intX-32);
					String st_result= Double.toString(result) ;
					
					f_textField.setText(st_result);
					t.setText("");
				}
			});
		
			
		

			
			

			/*add field*/
			setLayout(new FlowLayout());
			add(northlable,BorderLayout.NORTH);
			add(textField,BorderLayout.CENTER);
			add(southlable);
		add(f_textField,BorderLayout.SOUTH);

		

	}
} // end class ConvertFrame



