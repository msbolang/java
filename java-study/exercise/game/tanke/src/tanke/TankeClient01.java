package tanke;
import java.awt.*;
import java.awt.event.*;
public class TankeClient01 extends Frame {

	public void newf () {
	   this.setSize(800, 600);//���ô��ڴ�С
	   this.setLocation(300, 400);//���þ������ϽǾ���
	   setVisible(true);
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
