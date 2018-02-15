import java.awt.Color;
import java.awt.Graphics;

public interface Shapeable {
	public boolean containsPoint(int x, int y);
	public void draw(Graphics g);
	public void reshape(int left, int top, int width, int height);
	public void moveBy(int dx, int dy);
	public void setColor(Color color);
}
