import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HailStone {
  public static void main(String[] args){
    System.out.println("This is the Hailstone app!");
    JFrame frame = new JFrame("Hailstone");
    JPanel content = new JPanel();
    content.setLayout(new GridLayout());
    JTextField hailTF = new JTextField("       7            ");
    JButton nextB = new JButton("next");
    content.add(hailTF);
    content.add(nextB);
    frame.add(content);
    frame.setSize(300,200);
    frame.show(true);

    nextB.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
        int hail = Integer.parseInt(hailTF.getText().trim());
        if (hail%2==0){
          hail = hail/2;
        }else {
          hail = hail*3 + 1;
        }
        hailTF.setText(""+ hail);
      }
    });
  }
}
