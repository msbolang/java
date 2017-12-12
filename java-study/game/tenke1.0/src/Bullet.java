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
	
	private int bX = Tank.x;
	private int bY = Tank.y;

	/*�ٶ�*/
	private static final int BSPEEDX = 10;
	private static final int BSPEEDY = 10;
	/*�ӵ��Ĵ�С�ߴ�*/
	private static final int bulletSizeX = 10;
	private static final int bulletSizeY = 10;

	/*�ӵ�����ɫ*/
    //private static Color bulletColor = Color.red;
	/*λ��*/


	/*����*/
    //private direction bulletsDirection = dir;
	/*�ӵ��Ļ���*/
	public void paint(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.BLUE);
	    g.fillOval(bX, bY, bulletSizeX, bulletSizeY);//����ͼ��xywh
		g.setColor(c);
		move(Tank.dir);
	}
	
	/*�ӵ��˶��ķ���*/
	public void move(Tank.direction dir) {
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
