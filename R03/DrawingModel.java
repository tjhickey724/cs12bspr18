import java.awt.Color;
import java.awt.Graphics;

/**
This represents the model of an animation in which circular shapes move on a board.
*/
public class DrawingModel {
	private CircleShape[] circles;
	private int numCircles=0;
	private double dt = 0.02;


	/**
	create a model of a board that can simulate up to n moving circles
	*/
	public DrawingModel(int n){
		circles = new CircleShape[n];
	}

	/**
	  initialize the model so that it contain some shapes
	*/
	public void init(){
		for(int i=0; i< 10; i++){
			CircleShape c = new CircleShape();
			this.add(c);
		}
	}

	/**
	  add a CircleShape to the model, and update the number of circles in the DrawingModel
		@param c the CircleShape to add to the model
	*/
	public void add(CircleShape c){
		circles[numCircles]=c;
		numCircles++;
	}

	/**
		draw the model on the screen
		@param g the Graphics object used to draw the objects in the model
	*/
	public void draw(Graphics g){
		g.setColor(Color.green);
		g.drawRect(0,0,500,500);

		for(int i=0; i<numCircles; i++){
			CircleShape c = circles[i];
			c.draw(g);
		}
	}

	/**
		update the state for each of the circles in the model
	*/
	public void update(){
		for(int i=0; i<numCircles; i++){
			circles[i].update(dt);
		}
	}
}
