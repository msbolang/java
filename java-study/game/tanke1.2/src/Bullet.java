import java.awt.Color;
import java.awt.Graphics;
/*
 * 定义一个子弹 
 *  子弹有自己的画笔 
 *  有尺寸 
 *  有颜色
 *  有位置 = 坦克的位置
 *  有速度 
 *  有方向  = 坦克按键的方向
 * */
public class Bullet {
	
	private int bX, bY;
	private Tank.direction dir;
	/*速度*/
	private static final int BSPEEDX = 10;
	private static final int BSPEEDY = 10;
	/*子弹的大小尺寸*/
	public static final int bulletWidth = 10;
	public static final int bulletHeight = 10;

	/*子弹的颜色*/
    //private static Color bulletColor = Color.red;
	/*位置*/
	public Bullet(int bX, int bY) {
		this.bX = bX;
		this.bY = bY;
	}
	public Bullet(int bX, int bY,Tank.direction dir) {
		this(bX,bY);
		this.dir = dir;
	}
	/*方向*/
    //private direction bulletsDirection = dir;
	/*子弹的画笔*/
	public void paint(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.BLUE);
	    g.fillOval(bX, bY, bulletWidth, bulletHeight);//画出图像xywh
		g.setColor(c);
		move();
	}
	
	/*子弹运动的方法*/
	public void move() {
		switch(dir) {
			case left:
				bX -= BSPEEDX;
			break;
			case leftUp:
				bX -= BSPEEDX;
				bY -= BSPEEDY;
			break;
			case up:
				bY -= BSPEEDY;
			break;
			case rightUp:
				bX += BSPEEDX;
				bY -= BSPEEDY;
			break;
			case right:
				bX += BSPEEDX;
			break;
			case rightDown:
				bX += BSPEEDX;
				bY += BSPEEDY;
			break;
			case down:
				bY += BSPEEDY;
			break;
			case leftDown:
				bX -= BSPEEDX;
				bY += BSPEEDY;
			break;
		}
	}
}
