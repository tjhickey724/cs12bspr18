import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
GradingDemo is a GUI for grading student work.
*/
public class GradingDemo extends JPanel {

	public GradingDemo(){
		super();
		JPanel content = this;

		content.setLayout(new BorderLayout());
		JPanel top = new JPanel();
		top.add(new JLabel("<html><h1>Grading Demo</h1></html>"));
		content.add(top,BorderLayout.PAGE_START);

		JPanel left = new JPanel();
		left.setLayout(new GridLayout(0,1));
		left.add(new JButton("A"));
		left.add(new JButton("B"));
		left.add(new JButton("C"));
		left.add(new JButton("D"));
		left.add(new JButton("E"));
		content.add(left,BorderLayout.LINE_START);

		JPanel right = new JPanel();
		JPanel controls = new JPanel();
		String[] students = {"abe","beth","carl","dongho","erin","fatima","guy","han"};
		right.setLayout(new GridLayout(0,2));
		right.add(new JLabel("studentid")); right.add(new JComboBox(students));
		right.add(new JLabel("correctness/10"));right.add(new JTextField("10"));
		right.add(new JLabel("indentation/5"));right.add(new JTextField("1"));
		right.add(new JLabel("comments/5"));right.add(new JTextField("2"));
		right.add(new JButton("Next"));
		controls.add(right);
		content.add(controls,BorderLayout.LINE_END);

		JTextArea bottom = new JTextArea("Rubric goes in this textarea.\n"+
		   "Number of points for each mistake....\n");
		content.add(bottom,BorderLayout.PAGE_END);

		JPanel center = new JPanel();
		JTextArea a = new JTextArea("Student Code\ntextarea");
		JTextArea b = new JTextArea("TA Comments\ntextarea");
		a.setBackground(new Color(255,255,0));
		b.setBackground(new Color(200,200,255));

		center.setLayout(new GridLayout(1,2));

		center.add(a);
		center.add(b);
		content.add(center,BorderLayout.CENTER);



	}


		/**
	     * Create the GUI and show it.  For thread safety,
	     * this method should be invoked from the
	     * event-dispatching thread.
	     */
	    private static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("GradingDemo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        //Create and set up the content pane.
	        JComponent newContentPane = new GradingDemo();
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
