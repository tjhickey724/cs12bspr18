import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 * A simple demonstration of MouseEvents.  Shapes are drawn
 * on a black background when the user clicks the panel.  If
 * the user Shift-clicks, the panel is cleared.  If the user
 * right-clicks the panel, a blue oval is drawn.  Otherwise,
 * when the user clicks, a red rectangle is drawn.  The contents of
 * the panel are not persistent.  For example, they might disappear
 * if the panel is resized.
 * This class has a main() routine to allow it to be run as an application.
 */
public class MouseDrawDemo extends JPanel implements MouseListener, MouseMotionListener {

		/*
			We will keep track of the current drawing using an arraylist of points ..
			
		*/
    ArrayList<Point> points = new ArrayList<Point>();
		int lastx=0;
		int lasty=0;

    public static void main(String[] args) {
        JFrame window = new JFrame("MouseDrawDemo");
        JPanel content = new MouseDrawDemo();
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(120,70);
        window.setSize(400,300);
        window.setVisible(true);
    }

    // ----------------------------------------------------------------------

    /**
     * This constructor simply sets the background color of the panel to be black
     * and sets the panel to listen for mouse events on itself.
     */
    public MouseDrawDemo() {
        setBackground(Color.BLACK);
        addMouseListener(this);
				addMouseMotionListener(this);
    }


		/**
		 *
		 */
		 public void paintComponent(Graphics g){
			 g.setColor(Color.white);
			 g.fillRect(0,0,getWidth(),getHeight());

			 g.setColor(Color.black);
			 if (points.size()==0)
			   return;

			 Point lastPoint = points.get(0);
			 for(Point p: points){
				 g.drawLine(lastPoint.x,lastPoint.y, p.x, p.y);
				 lastPoint = p;
			 }
		 }

    /**
		 * MouseListener interface methods ...
     */
    public void mousePressed(MouseEvent evt) {

        if ( evt.isShiftDown() ) {
						points.clear();
            repaint();
            return;
        }




				if ( evt.isMetaDown() ) {

				}else if (evt.isControlDown()) {

				}else  if (evt.isAltDown()){

				} else {
					// no buttons are pressed
					lastx = evt.getX();  // x-coordinate where user clicked.
					lasty = evt.getY();  // y-coordinate where user clicked.
				}

    } // end mousePressed();


    // The next four empty routines are required by the MouseListener interface.
    // They don't do anything in this class, so their definitions are empty.

		public void mouseEntered(MouseEvent evt) { }
		public void mouseExited(MouseEvent evt) { }
		public void mouseClicked(MouseEvent evt) { }
		public void mouseReleased(MouseEvent evt) { }

		// these are the MouseMotionEvent methods
		public void mouseMoved(MouseEvent evt){ }
		public void mouseDragged(MouseEvent evt){
			int x = evt.getX();  // x-coordinate where user clicked.
			int y = evt.getY();  // y-coordinate where user clicked.
			points.add(new Point(x,y));
			//System.out.printf("%d %d %d\n",x,y,points.size());
			repaint();
		}


		static class Point{
			int x;
			int y;
			Point(int x,int y){
				this.x=x; this.y=y;
			}
		}

} // end class SimpleStamper
