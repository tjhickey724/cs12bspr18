import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LyftRide {
	public static void main(String[] args){

		JFrame frame = new JFrame("LyftRide");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());

		JPanel top = new JPanel();
		top.add(new JLabel("<html><h1>Lyft Ride Calculator</h1></html>"));
		content.add(top,BorderLayout.PAGE_START);

		JTextArea center = new JTextArea(
					"pickup fee: $5\n"+
					"distance fee: $3/mile\n"+
					"time fee: $0.20/minute"
			 );

		content.add(center,BorderLayout.LINE_START);


		JButton go = new JButton("<html><h1>calculate pay</h1></html>");
		content.add(go,BorderLayout.LINE_END);



		JPanel inputPanel = new JPanel();
		JTextField distTF = new JTextField("2");
		JTextField timeTF = new JTextField("10");
		JLabel totalL = new JLabel("$13");

		inputPanel.setLayout(new GridLayout(0,2));
		inputPanel.add(new JLabel("ride distance in miles:"));inputPanel.add(distTF);
		inputPanel.add(new JLabel("ride time in minutes:")); inputPanel.add(timeTF);
		inputPanel.add(new JLabel("pay for the ride:")); inputPanel.add(totalL);
		inputPanel.setBackground(Color.yellow);
		content.add(inputPanel,BorderLayout.CENTER);

		JLabel instructions = new JLabel("pay is calculated by 5 + 3*dist + 0.2*time");
		content.add(instructions,BorderLayout.PAGE_END);

		frame.setContentPane(content);
		frame.setSize(800,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		go.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double dist = Double.parseDouble(distTF.getText());
				double time = Double.parseDouble(timeTF.getText());
				double total = 5 + 3*dist + 0.2*time;
				totalL.setText("$"+total);

			}
		});
	}
}
