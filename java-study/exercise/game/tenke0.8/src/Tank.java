/*让坦克8个方向走*/
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Tank {
	private int XSPEED = 5;
	private int YSPEED = 5;
	private int x,y;
	private boolean L=false, U=false, R=false, D=false;
 	public enum direction { left, leftUp, up, rightUp, right, rightDown, down, leftDown, stop };
	direction dir = direction.stop;
	public Tank(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	
	public void move() {
		
		switch(dir) {
			case left:
				x -= XSPEED;
			break;
			case leftUp:
				x -= XSPEED;
				y -= YSPEED;
			break;
			case up:
				y -= YSPEED;
			break;
			case rightUp:
				x += XSPEED;
				y -= YSPEED;
			break;
			case right:
				x += YSPEED;
			break;
			case rightDown:
				x += XSPEED;
				y += YSPEED;
			break;
			case down:
				y += YSPEED;
			break;
			case leftDown:
				x -= XSPEED;
				y += YSPEED;
			break;
		}
		
	}
	
	public void paint(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.RED);
	    g.fillOval(x, y, 30, 30);//画出图像xywh
		g.setColor(c);
	}
	
	public void keyPressed(KeyEvent e) {
	//	L=false; U=false; R=false;  D=false;
		int key = e.getKeyCode();
		switch (key) {
			case KeyEvent.VK_LEFT:
				L = true;
				break;
			case KeyEvent.VK_UP:
				U = true;
				break;
			case KeyEvent.VK_RIGHT:
				R = true;
				break;
			case KeyEvent.VK_DOWN:
				D = true;
				break;	
		}
		this.tankDirection();
	}
	
	private void tankDirection() {
		if(L && !U && !R && !D) dir = direction.left;
		else if(L && U && !R && !D) dir = direction.leftUp;
		else if(!L && U && !R && !D) dir = direction.up;
		else if(!L && U && R && !D) dir = direction.rightUp;
		else if(!L && !U && R && !D) dir = direction.right;
		else if(!L && !U && R && D) dir = direction.rightDown;
		else if(!L && !U && !R && D) dir = direction.down;
		else if(L && !U && !R && D) dir = direction.leftDown;
		else dir = direction.stop;
		this.move();
	}
}
