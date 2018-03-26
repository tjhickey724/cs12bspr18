import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
* Lyft App keeps track of a Lyft driver's total pay for the day
*/
public class LyftApp extends JPanel {
	double totalPay=0;
	int numRides=0;

	/**
	* create the main LyftApp content pane
	*/
	public LyftApp(){
		super();
		JPanel content = this;
		content.setLayout(new BorderLayout());

		// create the header
		JPanel headerPanel = new JPanel();
		headerPanel.add(new JLabel("<html><h1>LyftApp</h1></html>"));
		content.add(headerPanel,BorderLayout.PAGE_START);

		// create the log
		JTextArea logTA = new JTextArea(
		   "LyftRides Log\n"
			 );
		content.add(logTA,BorderLayout.CENTER);
		logTA.setBackground(Color.yellow);

		// create the info panel
		JTextArea infoTA = new JTextArea(
		 "pickup fee: $3\n"+
		 "distance fee: $3/mile\n"+
		 "time fee: $0.20/minute"
		);
		content.add(infoTA,BorderLayout.LINE_END);

		// create the data input form
		JPanel inputForm = new JPanel();
		JTextField distTF = new JTextField("2");
		JTextField timeTF = new JTextField("10");
		JButton go = new JButton("calculate pay");
		JButton clear = new JButton("reset");
		JLabel totalL = new JLabel("$25");
		inputForm.setLayout(new GridLayout(0,2));
		inputForm.add(new JLabel("ride distance in miles:"));inputForm.add(distTF);
		inputForm.add(new JLabel("ride time in minutes:")); inputForm.add(timeTF);
		inputForm.add(clear);inputForm.add(go);
		inputForm.add(new JLabel("Total Pay for the day:")); inputForm.add(totalL);
		content.add(inputForm,BorderLayout.PAGE_END);


		go.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double dist = Double.parseDouble(distTF.getText());
				double time = Double.parseDouble(timeTF.getText());
				double total = 3 + 3*dist + 0.2*time;
				totalPay += total;
				numRides++;
				String log = logTA.getText();
				log = log + "Ride "+numRides +" dist: "+dist+" time: "+time+" $"+total+"\n";
				logTA.setText(log);
				totalL.setText("$"+totalPay);
				distTF.setText("");
				timeTF.setText("");

			}
		});

		clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				totalPay=0;
				numRides=0;
				distTF.setText("");
				timeTF.setText("");
				logTA.setText("Lyft Rides\n");
				totalL.setText("$0");
			}
		});
	}

// everything from here down is BoilerPlate
// just replace "LyftApp" with your classes name!

	/**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("LyftApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new LyftApp();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }


}
