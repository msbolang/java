/*����Բ�� ��ͼ�ζ�����*/
import java.awt.*;
import java.awt.event.*;
public class TankeClient01 extends Frame {
	int x = 50;
	int y = 50;
	//��ͼ  paint����
	public void paint(Graphics g) {
			Color c = g.getColor();
			g.setColor(Color.RED);
		    g.fillOval(x, y, 30, 30);//����ͼ��xywh
			g.setColor(c);
			x += 1;
			y += 2;
	}
	
	public void newf () {
	   this.setSize(800, 800);//���ô��ڴ�С
	   this.setLocation(50, 50);//���þ������ϽǾ���
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
	   new Thread(new Thread_m()).start(); //�����߳�
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TankeClient01 f1 = new TankeClient01();
		f1.newf();
	}
	
	//�����߳�Thread_m ʵ�� Runnable
	private class Thread_m implements Runnable {
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
}
