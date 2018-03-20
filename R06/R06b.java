import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class R06b {
	public static void main(String[] args){
		JFrame frame = new JFrame("Square Root Demo");
		JPanel panel = new JPanel();
		JTextField xTF = new JTextField("25");
		JTextField gTF = new JTextField("1");
		JLabel
		JButton goB = new JButton("go");

		panel.setLayout(new GridLayout(0,2));
		panel.add(new JLabel("Enter x:"));
		panel.add(xTF);
		panel.add(new JLabel("Current guess g:"));
		panel.add(gTF);
		panel.add(goB);
		panel.add(new JLabel("g = (g + x/g)/2"));


		frame.setContentPane(panel);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		goB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double x = Double.parseDouble(xTF.getText().trim());
				double g = Double.parseDouble(gTF.getText().trim());
				double newg = (g + x/g)/2;
				gTF.setText(""+newg);
			}
		});
	}
}
