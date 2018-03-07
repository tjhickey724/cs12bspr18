// first we import all of the classes we will use
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
* This demo creates a telephone keyboard of buttons.
*/
public class Tip{
	public static void main(String[] args){

    JFrame window = new JFrame("Tip");
		JPanel content = new JPanel();
		JButton calculateB = new JButton("Calculate");
		JButton clearB = new JButton("Clear");
		JTextField mealCostTF = new JTextField("100");
		JTextField taxRateTF = new JTextField("6.5");
		JTextField tipRateTF = new JTextField("15.0");
		JLabel answerL = new JLabel("<html><h1>Enter your input and press Caclulate</h1></html>");

		content.setLayout(new BorderLayout());

		JLabel label1 = new JLabel("<html><h1>Tip Calculator</h1></html>");
		label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		content.add(label1,BorderLayout.PAGE_START);


		JPanel input = new JPanel();
		input.setLayout(new GridLayout(0,2));
		input.add(new JLabel("meal cost"));input.add(mealCostTF);
		input.add(new JLabel("tax rate"));input.add(taxRateTF);
		input.add(new JLabel("tip rate"));input.add(tipRateTF);
		input.add(calculateB); input.add(clearB);
		input.setBackground(Color.GREEN);
		content.add(input,BorderLayout.CENTER);


		content.add(answerL,BorderLayout.PAGE_END);

		// add functionality
		clearB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				mealCostTF.setText("");
				taxRateTF.setText("");
				tipRateTF.setText("");
			}
		});

		calculateB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				String mealCostText = mealCostTF.getText();
				double mealCost = Double.parseDouble(mealCostText);
				double tip = mealCost*0.15;
				String response = "Your tip is "+tip;
				answerL.setText(response);
			}
		});


		window.setContentPane(content);
		window.pack();
		//window.setSize(250,300);
		window.setLocation(100,100);
		window.setVisible(true);

	}
}
