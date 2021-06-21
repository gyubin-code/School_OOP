	import java.awt.BorderLayout;
      import java.awt.FlowLayout;
      import java.awt.GridLayout;
	import javax.swing.JFrame;
	import javax.swing.JButton;
	import javax.swing.JCheckBox;
	import javax.swing.JComboBox;
	import javax.swing.JPanel;
      import javax.swing.border.Border;
		
	public class ColorSelectFrame extends JFrame 
	{
            private JComboBox<String> comboBox;

            private JPanel panel_1;
            private JCheckBox checkBox_1;
            private JCheckBox checkBox_2;

            private JPanel panel_2;
            private JButton button_1;
            private JButton button_2;

            private JPanel panel_3;

            private String[] names = { 
                  "RED"};

            public ColorSelectFrame(){
                  super("ColorSelect");
                  comboBox = new JComboBox<String>(names);

                  panel_1 = new JPanel();
                  panel_1.setLayout(new GridLayout(1, 2,10,5));
                  checkBox_1 = new JCheckBox("BackGround");
                  checkBox_2 = new JCheckBox("Foreground");
                  panel_1.add(checkBox_1); panel_1.add(checkBox_2);

                  panel_2 = new JPanel();
                  panel_2.setSize(150,40);
                  panel_2.setLayout(new GridLayout(1, 2,5,5));
                  button_1 = new JButton("Ok");
                  button_2 = new JButton("Cancel");
                  panel_2.add(button_1); panel_2.add(button_2);



                  /* 위치설정*/
                  panel_3 = new JPanel();
                  panel_3.setLayout(new FlowLayout(FlowLayout.CENTER));
                  panel_3.add(panel_1,BorderLayout.CENTER);
                  panel_3.add(panel_2,BorderLayout.SOUTH);


                  /* add to frame*/
                  
                  add(comboBox,BorderLayout.NORTH);
                  add(panel_3,BorderLayout.CENTER);
            }
	} // end class ColorSelectFram