import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This nested class defines the drawing area.
 */
public class DrawingArea extends JPanel
								 implements ActionListener, MouseListener, MouseMotionListener {

		// This class represents a "canvas" that can display colored shapes and
		// let the user drag them around.  It uses an off-screen images to
		// make the dragging look as smooth as possible.

		Shape[] shapes = new Shape[500]; // holds a list of up to 500 shapes
		int shapeCount = 0;  // the actual number of shapes
		Color currentColor = Color.RED;  // current color; when a shape is created, this is its color
		JComboBox<String> colorChoice;

		public DrawingArea(JComboBox<String> colorChoice) {
			this.colorChoice = colorChoice;
					 // Constructor: set background color to white set up listeners to respond to mouse actions
				setBackground(Color.WHITE);
				addMouseListener(this);
				addMouseMotionListener(this);
		}

		public void paintComponent(Graphics g) {
					 // In the paint method, all the shapes in ArrayList are
					 // copied onto the canvas.
				g.setColor(Color.WHITE);
				g.fillRect(0,0,getSize().width,getSize().height);
				for (int i = 0; i < shapeCount; i++) {
						Shape s = shapes[i];
						s.draw(g);
				}
				g.setColor(Color.BLACK);  // draw a black border around the edge of the drawing area
				g.drawRect(0,0,getWidth()-1,getHeight()-1);
		}

		public void actionPerformed(ActionEvent evt) {
			System.out.println("evt.getSource()="+evt.getSource());
			System.out.println("this.colorChoice="+this.colorChoice);

					 // Called to respond to action events.  The three shape-adding
					 // buttons have been set up to send action events to this canvas.
					 // Respond by adding the appropriate shape to the canvas.
				if (evt.getSource() == colorChoice) {
					  System.out.println(colorChoice.getSelectedIndex() );
						switch ( colorChoice.getSelectedIndex() ) {
						case 0: currentColor = Color.RED;     break;
						case 1: currentColor = Color.GREEN;   break;
						case 2: currentColor = Color.BLUE;    break;
						case 3: currentColor = Color.CYAN;    break;
						case 4: currentColor = Color.MAGENTA; break;
						case 5: currentColor = Color.YELLOW;  break;
						case 6: currentColor = Color.BLACK;   break;
						case 7: currentColor = Color.WHITE;   break;
						}
				}
				else {
						String command = evt.getActionCommand();
						if (command.equals("Rect"))
								addShape(new RectShape());
						else if (command.equals("Oval"))
								addShape(new OvalShape());
						else if (command.equals("RoundRect"))
								addShape(new RoundRectShape());
				}
		}

		void addShape(Shape shape) {
						// Add the shape to the canvas, and set its size/position and color.
						// The shape is added at the top-left corner, with size 80-by-50.
						// Then redraw the canvas to show the newly added shape.
				shape.setColor(currentColor);
				shape.reshape(3,3,80,50);
				shapes[shapeCount] = shape;
				shapeCount++;
				repaint();
		}


		// -------------------- This rest of this class implements dragging ----------------------

		Shape shapeBeingDragged = null;  // This is null unless a shape is being dragged.
																		 // A non-null value is used as a signal that dragging
																		 // is in progress, as well as indicating which shape
																		 // is being dragged.

		int prevDragX;  // During dragging, these record the x and y coordinates of the
		int prevDragY;  //    previous position of the mouse.

		public void mousePressed(MouseEvent evt) {
						// User has pressed the mouse.  Find the shape that the user has clicked on, if
						// any.  If there is a shape at the position when the mouse was clicked, then
						// start dragging it.  If the user was holding down the shift key, then bring
						// the dragged shape to the front, in front of all the other shapes.
				int x = evt.getX();  // x-coordinate of point where mouse was clicked
				int y = evt.getY();  // y-coordinate of point
				for ( int i = shapeCount - 1; i >= 0; i-- ) {  // check shapes from front to back
						Shape s = shapes[i];
						if (s.containsPoint(x,y)) {
								shapeBeingDragged = s;
								prevDragX = x;
								prevDragY = y;
								if (evt.isShiftDown()) { // s should be moved on top of all the other shapes
										for (int j = i; j < shapeCount-1; j++) {
														// move the shapes following s down in the list
												shapes[j] = shapes[j+1];
										}
										shapes[shapeCount-1] = s;  // put s at the end of the list
										repaint();  // repaint canvas to show s in front of other shapes
								}
								return;
						}
				}
		}

		public void mouseDragged(MouseEvent evt) {
						// User has moved the mouse.  Move the dragged shape by the same amount.
				int x = evt.getX();
				int y = evt.getY();
				if (shapeBeingDragged != null) {
						shapeBeingDragged.moveBy(x - prevDragX, y - prevDragY);
						prevDragX = x;
						prevDragY = y;
						repaint();      // redraw canvas to show shape in new position
				}
		}

		public void mouseReleased(MouseEvent evt) {
						// User has released the mouse.  Move the dragged shape, then set
						// shapeBeingDragged to null to indicate that dragging is over.
				int x = evt.getX();
				int y = evt.getY();
				if (shapeBeingDragged != null) {
						shapeBeingDragged.moveBy(x - prevDragX, y - prevDragY);
						shapeBeingDragged = null;
						repaint();
				}
		}

		public void mouseEntered(MouseEvent evt) { }   // Other methods required for MouseListener and
		public void mouseExited(MouseEvent evt) { }    //              MouseMotionListener interfaces.
		public void mouseMoved(MouseEvent evt) { }
		public void mouseClicked(MouseEvent evt) { }

}  // end class DrawingArea
