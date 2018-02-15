import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public abstract class Shape {

				// A class representing shapes that can be displayed on a ShapeCanvas.
				// The subclasses of this class represent particular types of shapes.
				// When a shape is first constructed, it has height and width zero
				// and a default color of white.

		int left, top;      // Position of top left corner of rectangle that bounds this shape.
		int width, height;  // Size of the bounding rectangle.
		Color color = Color.white;  // Color of this shape.

		public void reshape(int left, int top, int width, int height) {
						// Set the position and size of this shape.
				this.left = left;
				this.top = top;
				this.width = width;
				this.height = height;
		}

		public void moveBy(int dx, int dy) {
						// Move the shape by dx pixels horizontally and dy pixels vertically
						// (by changing the position of the top-left corner of the shape).
				left += dx;
				top += dy;
		}

		public void setColor(Color color) {
						// Set the color of this shape
				this.color = color;
		}

		public boolean containsPoint(int x, int y) {
						// Check whether the shape contains the point (x,y).
						// By default, this just checks whether (x,y) is inside the
						// rectangle that bounds the shape.  This method should be
						// overridden by a subclass if the default behavior is not
						// appropriate for the subclass.
				if (x >= left && x < left+width && y >= top && y < top+height)
						return true;
				else
						return false;
		}

		public abstract void draw(Graphics g);
				// Draw the shape in the graphics context g.
				// This must be overriden in any concrete subclass.

}  // end of class Shape
