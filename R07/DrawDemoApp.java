import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
DrawDemoApp
 */
public class DrawDemoApp extends JPanel {

  JPanel canvas;
	String drawingType = "clear";

    public static void main(String[] args) {
        JFrame window = new JFrame("DrawDemoApp");
        DrawDemoApp content = new DrawDemoApp();
        window.setContentPane(content);
        window.setSize(400,400);
        window.setLocation(100,100);
        window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        window.setVisible(true);
    }



    /**
     * The constructor creates a timer with a delay time of four seconds
     * (4000 milliseconds), and with a RepaintAction object as its
     * ActionListener.  It also starts the timer running.
     */
    public DrawDemoApp() {
			DrawDemoApp content = this;
			content.setLayout(new BorderLayout());
			canvas = new JPanel();
			content.add(canvas,BorderLayout.CENTER);

			JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new GridLayout(0,1));

			JButton checkerboardButton = new JButton("Checkerboard");
			checkerboardButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.out.println("setting dt to checkerboard");
					content.drawingType = "checkerboard";
					canvas.repaint();
				}
			});
			buttonPanel.add(checkerboardButton);

			JButton clearButton = new JButton("clear");
			clearButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
				  drawingType = "clear";
					canvas.repaint();
				}
			});
			buttonPanel.add(clearButton);

			content.add(buttonPanel,BorderLayout.LINE_END);



    }

    /**
     * The paintComponent() method fills the panel with a random shade of
     * gray and then draws one of three types of random "art".  The type
     * of art to be drawn is chosen at random.
     */
    public void paintComponent(Graphics g) {
			  g = canvas.getGraphics();

        switch (drawingType) {
        case "checkerboard":
						int w=canvas.getWidth()/8, h=canvas.getHeight()/8;
						System.out.println("in checkerboard");
            for (int i = 0; i < 8; i++) {
							for (int j=0; j<8; j++) {
								if ((i+j)%2==0) {
									g.setColor(Color.black);
								} else{
									g.setColor(Color.white);
								}
								g.fillRect(i*w,j*h,w,h);
							}
						};
						break;
      	case "clear":
						g.setColor(Color.blue);
		        g.fillRect( 0, 0, getWidth(), getHeight() );
						break;
        }

    } // end paintComponent()

} // end class RandomArtPanel
