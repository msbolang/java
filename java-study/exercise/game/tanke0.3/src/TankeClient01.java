/*����Բ��*/
import java.awt.*;
import java.awt.event.*;
public class TankeClient01 extends Frame {
	//��ͼ  paint����
	public void paint(Graphics g) {
			Color c = g.getColor();
			g.setColor(Color.RED);
		    g.fillOval(50, 50, 30, 30);//����ͼ��xywh
			g.setColor(c);
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
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TankeClient01 f1 = new TankeClient01();
		f1.newf();
	}

}
