import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PQ1b {
	public static void main(String[] args){
		JFrame frame = new JFrame("PQ1b");
		JPanel content = new JPanel();
		content.setLayout(new FlowLayout());
		JLabel instructions = new JLabel("Enter in two integers:");
		JTextField input1 = new JTextField("333333333");
		JTextField input2 = new JTextField("222222222");

		JButton go = new JButton("go");
		JButton clear = new JButton("clear");
		JLabel result = new JLabel("Their sum is 555555555 and their difference is 111111111 ");
		content.add(instructions);
		content.add(input1);
		content.add(input2);
		content.add(go);
		content.add(clear);
		content.add(result);

		frame.setContentPane(content);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);
		frame.show(true);

		go.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int x = Integer.parseInt(input1.getText().trim());
				int y = Integer.parseInt(input2.getText().trim());
				result.setText("The sum of "+x+" and "+y+" is "+(x+y)+" and the difference is "+(x-y));

			}
		});

		clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				input1.setText("               ");
				input2.setText("               ");
			}
		});

	}
}
