package tanke;
import java.awt.*;
import java.awt.event.*;
public class TankeClient01 extends Frame {

	public void newf () {
	   this.setSize(800, 600);//设置窗口大小
	   this.setLocation(300, 400);//设置距离左上角距离
	   setVisible(true);
	   //添加监听 event事件
	   this.addWindowListener(new WindowAdapter() {
		   //windowClosing 关闭窗口
		      public void windowClosing(WindowEvent e) {
		        setVisible(false);
		        System.exit(-1);
		      }
		});
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TankeClient01 f1 = new TankeClient01();
		f1.newf();
	}

}
