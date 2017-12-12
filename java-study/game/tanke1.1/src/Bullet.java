import java.awt.Color;
import java.awt.Graphics;
/*
 * ����һ���ӵ� 
 *  �ӵ����Լ��Ļ��� 
 *  �гߴ� 
 *  ����ɫ
 *  ��λ�� = ̹�˵�λ��
 *  ���ٶ� 
 *  �з���  = ̹�˰����ķ���
 * */
public class Bullet {
	
	private int bX, bY;
	private Tank.direction dir;
	/*�ٶ�*/
	private static final int BSPEEDX = 10;
	private static final int BSPEEDY = 10;
	/*�ӵ��Ĵ�С�ߴ�*/
	public static final int bulletWidth = 10;
	public static final int bulletHeight = 10;

	/*�ӵ�����ɫ*/
    //private static Color bulletColor = Color.red;
	/*λ��*/
	public Bullet(int bX, int bY) {
		this.bX = bX;
		this.bY = bY;
	}
	public Bullet(int bX, int bY,Tank.direction dir) {
		this(bX,bY);
		this.dir = dir;
	}
	/*����*/
    //private direction bulletsDirection = dir;
	/*�ӵ��Ļ���*/
	public void paint(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.BLUE);
	    g.fillOval(bX, bY, bulletWidth, bulletHeight);//����ͼ��xywh
		g.setColor(c);
		move();
	}
	
	/*�ӵ��˶��ķ���*/
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
