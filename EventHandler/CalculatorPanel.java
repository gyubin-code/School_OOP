import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorPanel extends JPanel{
    private JButton display;
    private JPanel panel;
    private double result;
    private String lastCommand;
    private boolean start;
    public  CalculatorPanel(){
        setLayout(new BorderLayout());
        result=0;
        lastCommand="=";
        start=true;

        display=new JButton("0");
        display.setEnabled(false);
        add(display,BorderLayout.NORTH);

        ActionListener insert = new InsertAction(); // see next slide: inner class by programmer
        ActionListener command = new CommandAction();

        panel=new JPanel();
        panel.setLayout(new GridLayout(4,4));

        // 여기 숫자 너ㅎ고 command넣는곳
        addButton("7", insert); // see next slide
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", command);
        
        addButton("4", insert );
        addButton("5", insert );
        addButton("6", insert);
        addButton("*", command);
        
        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", command);
        
        addButton("0", insert);
        addButton(".", insert);
        addButton("=", command);
        addButton("+", command);
        add(panel, BorderLayout.CENTER);
        }
    private void addButton(String label, ActionListener listener)
        {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        panel.add(button); // panel is filed of outer class
        }
        
        private class InsertAction implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                String input = event.getActionCommand();
                if (start)
                    {
                    display.setText("" ); // display refers to object of Jbutton class
                    start = false;
                    }
                display.setText(display.getText() + input);
            }
        }

        private class CommandAction implements ActionListener
            {
            public void actionPerformed(ActionEvent event)
                {
                String command = event.getActionCommand();

                if (start)
                {
                    if (command.equals ("-"))
                        {
                        display.setText(command);
                        start = false;
                        }
                    else lastCommand = command;
                }
                else
                {
                    calculate ( Double.parseDouble( display.getText( ) ) );
                    lastCommand = command;
                    start = true;
                }
           }
        }

        public void calculate(double x)
            {
                if (lastCommand.equals("+")) result += x;
                else if (lastCommand.equals("-")) result -= x;
                else if (lastCommand.equals("*")) result *= x;
                else if (lastCommand.equals("/")) result /= x;
                else if (lastCommand.equals("=")) result = x;
                display.setText(""  + result);
            }


}
