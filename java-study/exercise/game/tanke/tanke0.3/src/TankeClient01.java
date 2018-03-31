/*画出圆形*/
import java.awt.*;
import java.awt.event.*;
public class TankeClient01 extends Frame {
	//绘图  paint画笔
	public void paint(Graphics g) {
			Color c = g.getColor();
			g.setColor(Color.RED);
		    g.fillOval(50, 50, 30, 30);//画出图像xywh
			g.setColor(c);
	}
	
	public void newf () {
	   this.setSize(800, 800);//设置窗口大小
	   this.setLocation(50, 50);//设置距离左上角距离
	   setVisible(true);
	   this.setBackground(Color.BLUE);
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
