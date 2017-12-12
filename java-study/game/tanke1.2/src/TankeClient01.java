/*
 * ̧������ͷŰ���true
���̿���̹���ƶ�
˫���� ���ͼƬ��˸����*/
/*����Բ�� ��ͼ�ζ�����*/
import java.awt.*;
import java.awt.event.*;
public class TankeClient01 extends Frame {
	public static final int GAME_WIDTH = 1200;
	public static final int GAME_HEIGHT = 900;
	public static final int TankWidth = 30;
	public static final int TankHeight = 30;
	Tank myTank = new Tank(TankWidth,TankHeight,this);
	Bullet myBullet;
	Image offScreenImage = null;
	//��ͼ  paint����
	public void paint(Graphics g) {
		if(myBullet!=null) {
			myBullet.paint(g);
		}
		myTank.paint(g);
		
	}

	public void update(Graphics g) { 
		//����repaint ��д����֮ǰ�ȵ�������update���� ������update��������� ����һ������ ����Ļ���� ��ͼ����д�����������Ȼ��һ������д����Ļ���������Խ����˸����
		if(offScreenImage == null) {
			offScreenImage = this.createImage(GAME_WIDTH, GAME_HEIGHT);
		}
	
		Graphics gOffScreen = offScreenImage.getGraphics();	
		Color c = gOffScreen.getColor();
		gOffScreen.setColor(Color.YELLOW);
		gOffScreen.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);  
		gOffScreen.setColor(c);
		paint(gOffScreen);
		g.drawImage(offScreenImage,0,0,null);
	}

	public void lauchFrame () {
	   this.setSize(GAME_WIDTH, GAME_HEIGHT);//���ô��ڴ�С
	   this.setLocation(TankWidth, TankHeight);//���þ������ϽǾ���
	   setVisible(true);
	   this.setBackground(Color.BLUE);
	   //��Ӽ��� event�¼�
	   this.addWindowListener(new WindowAdapter() {
		   //windowClosing �رմ���
		      public void windowClosing(WindowEvent e) {
		        setVisible(false);
		        System.exit(-1);
		      }
		});
	   new Thread(new PaintThread()).start(); //�����߳�
	   this.addKeyListener(new KeyMonitor());
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TankeClient01 f1 = new TankeClient01();
		f1.lauchFrame();
	}
	
	//�����߳�Thread_m ʵ�� Runnable
	private class PaintThread implements Runnable {
		@Override
		public void run() {
			// TODO �Զ����ɵķ������
			while(true) {
				repaint(); //�ػ�
				try {
					Thread.sleep(10);//ÿ10���뻭һ��
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
	}

	public class KeyMonitor extends KeyAdapter {

		public void keyReleased(KeyEvent e) {
			myTank.keyReleased(e);
		}

		public void keyPressed(KeyEvent e) {
			
			myTank.keyPressed(e);
			
		}
		
	}
}
