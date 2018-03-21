import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LyftApp {
	public static void main(String[] args){
		double totalPay=0;
		int numRides=0;
		JFrame frame = new JFrame("LyftApp");
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		JPanel top = new JPanel();
		top.add(new JLabel("<html><h1>LyftApp</h1></html>"));
		content.add(top,BorderLayout.PAGE_START);

		JTextArea center = new JTextArea(
		   "Ride 1: 20 miles 60 minutes $15\n" +
			 "Ride 2: 2 miles 10 minutes $10"
			 );
		content.add(center);
		center.setBackground(Color.yellow);

		JTextArea left = new JTextArea(
		 "pickup fee: $3\n"+
		 "distance fee: $3/mile\n"+
		 "time fee: $0.20/minute"
		);
		content.add(left,BorderLayout.LINE_END);




		JPanel bottom = new JPanel();
		JTextField distTF = new JTextField("2");
		JTextField timeTF = new JTextField("10");
		JButton go = new JButton("calculate pay");
		JButton clear = new JButton("reset");
		JLabel totalL = new JLabel("$25");
		bottom.setLayout(new GridLayout(0,2));
		bottom.add(new JLabel("ride distance in miles:"));bottom.add(distTF);
		bottom.add(new JLabel("ride time in minutes:")); bottom.add(timeTF);
		bottom.add(clear);bottom.add(go);
		bottom.add(new JLabel("Total Pay for the day:")); bottom.add(totalL);
		content.add(bottom,BorderLayout.PAGE_END);

		frame.setContentPane(content);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show(true);

		go.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double dist = Double.parseDouble(distTF.getText());
				double time = Double.parseDouble(timeTF.getText());
				double total = 3 + 3*dist + 0.2*time;
				String log = center.getText();
				log = log + "Ride "+numRides +" dist: "+dist+" time: "+time+" $"+total+"\n";
				center.setText(log);
				totalL.setText("$"+totalPay);

			}
		});
	}
}
