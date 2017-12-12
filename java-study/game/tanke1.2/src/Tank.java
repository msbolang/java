/*让坦克8个方向走*/
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.concurrent.ThreadFactory;

public class Tank {
	private static final int XSPEED = 5;
	private static final int YSPEED = 5;
	public static final int TankWidth = 30;
	public static final int TankHeight = 30;
	public int x,y;
	public TankeClient01 tc;
	private boolean L=false, U=false, R=false, D=false;
 	public enum direction { left, leftUp, up, rightUp, right, rightDown, down, leftDown, stop };
	direction dir = direction.stop;
	direction pt = direction.down;
	
	public Tank(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Tank(int x,int y,TankeClient01 tc) {
		this(x,y);
		this.tc = tc;
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
		if(this.dir!=direction.stop) {
			pt = this.dir;
		}
		
	}
	
	public void paint(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.RED);
	    g.fillOval(x, y, TankWidth, TankHeight);//画出图像xywh
		g.setColor(c);
		
		switch(pt) {
			case left:
				g.drawLine(x+Tank.TankWidth/2, y+Tank.TankHeight/2, x, y+Tank.TankHeight/2);
			break;
			case leftUp:
				g.drawLine(x+Tank.TankWidth/2, y+Tank.TankHeight/2, x, y);
			break;
			case up:
				g.drawLine(x+Tank.TankWidth/2, y+Tank.TankHeight/2, x+Tank.TankWidth/2, y);
			break;
			case rightUp:
				g.drawLine(x+Tank.TankWidth/2, y+Tank.TankHeight/2, x+Tank.TankWidth, y);
			break;
			case right:
				g.drawLine(x+Tank.TankWidth/2, y+Tank.TankHeight/2, x+Tank.TankWidth, y+Tank.TankHeight/2);
			break;
			case rightDown:
				g.drawLine(x+Tank.TankWidth/2, y+Tank.TankHeight/2, x+Tank.TankWidth, y+Tank.TankHeight);
			break;
			case down:
				g.drawLine(x+Tank.TankWidth/2, y+Tank.TankHeight/2, x+Tank.TankWidth/2, y+Tank.TankHeight);
			break;
			case leftDown:
				g.drawLine(x+Tank.TankWidth/2, y+Tank.TankHeight/2, x, y+Tank.TankHeight);
			break;
		}
	}
	
	//按下按键
	public void keyPressed(KeyEvent e) {
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
			case KeyEvent.VK_SPACE:
				System.out.println(11);
			    tc.myBullet = fire();
				break;	
		}
		this.tankDirection();
	}
	
	//抬起键盘 释放按键
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		switch (key) {
			case KeyEvent.VK_LEFT:
				L = false;
				break;
			case KeyEvent.VK_UP:
				U = false;
				break;
			case KeyEvent.VK_RIGHT:
				R = false;
				break;
			case KeyEvent.VK_DOWN:
				D = false;
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

	public Bullet fire() {
		int x = this.x + Tank.TankWidth/2 - Bullet.bulletWidth/2;
		int y = this.y + Tank.TankHeight/2 - Bullet.bulletHeight/2;
		Bullet B = new Bullet(x,y,pt);
		return B;
	}

}
