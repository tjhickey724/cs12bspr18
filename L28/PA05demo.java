import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class PA05demo {
  public static void main(String[] args){
    JFrame window = new JFrame("PA05demo");
    MouseDrawDemo drawWidget1 = new MouseDrawDemo();
    MouseDrawDemo drawWidget2 = new MouseDrawDemo();
    JButton clear = new JButton("Clear");
    JPanel content = new JPanel();
    content.setLayout(new GridLayout(1,3));
    content.add(drawWidget1);
    content.add(clear);
    content.add(drawWidget2);
    window.setContentPane(content);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLocation(120,70);
    window.setSize(400,300);
    window.setVisible(true);

    clear.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        drawWidget1.points.clear();
        drawWidget1.repaint();
        System.out.println("points1 length="+
           drawWidget1.points.size());
        drawWidget2.points.clear();
        drawWidget2.repaint();
      }
    });

  }
}
