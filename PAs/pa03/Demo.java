package pa03;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *  This is the file for Demo. It creates a drawing model with 30 or fewer
 * circles and draws them on the screen according to their animations.
 */
public class Demo extends JPanel implements ActionListener {



		private DrawingModel model; // this is a model of a scene we will draw!

		public Demo(){
			super();
			this.model = new DrawingModel(30);
		}

    /**
     * Draws one frame of an animation. This subroutine is called re
     * second and is responsible for redrawing the entire drawing area.  The
     * parameter g is used for drawing. The frameNumber starts at zero and
     * increases by 1 each time this subroutine is called.  The parameters width
     * and height give the size of the drawing area, in pixels.
     * The sizes and positions of the rectangles that are drawn depend
     * on the frame number, giving the illusion of motion.
     */
    public void drawFrame(Graphics g, int frameNumber, int width, int height) {

        /* NOTE:  To get a different animation, just erase the contents of this
         * subroutine and substitute your own.  If you don't fill the picture
         * with some other color, the background color will be white.  The sample
         * code here just shows the frame number.
         */

				// here he draw the Frame Number on every frame
				g.drawString( "Frame number " + frameNumber, 40, 50 );

				//here we update the model
				model.update();

				// and now we draw the updated model
				model.draw(g);


    }

    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------


    public static void main(String[] args) {



        /* NOTE:  The string in the following statement goes in the title bar
         * of the window.
         */
        JFrame window = new JFrame("PA03 Demo");

        /*
         * NOTE: If you change the name of this class, you must change
         * the name of the class in the next line to match!
         */
        Demo drawingArea = new Demo();

        drawingArea.setBackground(Color.WHITE);
        window.setContentPane(drawingArea);

        /* NOTE:  In the next line, the numbers 600 and 450 give the
         * initial width and height of the drawing array.  You can change
         * these numbers to get a different size.
         */
        drawingArea.setPreferredSize(new Dimension(600,600));

        window.pack();
        window.setLocation(100,50);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        /*
         * Note:  In the following line, you can change true to
         * false.  This will prevent the user from resizing the window,
         * so you can be sure that the size of the drawing area will
         * not change.  It can be easier to draw the frames if you know
         * the size.
         */
        window.setResizable(true);

        /* NOTE:  In the next line, the number 20 gives the time between
         * calls to drawFrame().  The time is given in milliseconds, where
         * one second equals 1000 milliseconds.  You can increase this number
         * to get a slower animation.  You can decrease it somewhat to get a
         * faster animation, but the speed is limited by the time it takes
         * for the computer to draw each frame.
         */
        Timer frameTimer = new Timer(1,drawingArea);

        window.setVisible(true);
        frameTimer.start();

    } // end main

    private int frameNum;

    public void actionPerformed(ActionEvent evt) {
        frameNum++;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFrame(g, frameNum, getWidth(), getHeight());
    }

}
