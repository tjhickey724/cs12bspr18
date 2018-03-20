import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator{
  public static void main(String[] args){
    JLabel header = new JLabel("Calculator");
    JLabel footer = new JLabel("The result of 1+1 is 2");
    JTextField n1 = new JTextField("1");
    JTextField n2 = new JTextField("1");
    JButton b1 = new JButton("+");
    JButton b2 = new JButton("*");
    // now put them all together in a grid(0,1) layout
    JPanel content = new JPanel();
    content.setLayout(new GridLayout(0,1));
    content.add(header);
    content.add(n1);
    content.add(n2);
    content.add(b1);
    content.add(b2);
    content.add(footer);
    JFrame frame = new JFrame("Calculator Demo");
    frame.setContentPane(content);
    frame.setSize(300,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    b1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        int num1 = Integer.parseInt(n1.getText());
        int num2 = Integer.parseInt(n2.getText());
        int sum = num1+num2;
        String msg = "The result of " + num1 + "+" + num2 + " is " + sum;
        footer.setText(msg);
      }
    });

    b2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        int num1 = Integer.parseInt(n1.getText());
        int num2 = Integer.parseInt(n2.getText());
        int sum = num1*num2;
        String msg = "The result of " + num1 + "*" + num2 + " is " + sum;
        footer.setText(msg);
      }
    });

    // and put them in a frame
    // and add the action listener to the button ..

  }
}
