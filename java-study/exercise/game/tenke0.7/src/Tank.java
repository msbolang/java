import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Tank {
	int x,y;
	
	public Tank(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	
	public void paint(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.RED);
	    g.fillOval(x, y, 30, 30);//画出图像xywh
		g.setColor(c);
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch (key) {
			case KeyEvent.VK_LEFT:
				x -= 5;
				break;
			case KeyEvent.VK_UP:
				y -= 5;
				break;
			case KeyEvent.VK_RIGHT:
				x += 5;
				break;
			case KeyEvent.VK_DOWN:
				y += 5;
				break;	
		}
	}
}
