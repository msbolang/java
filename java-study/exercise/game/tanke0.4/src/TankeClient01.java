/*画出圆形 让图形动起来*/
import java.awt.*;
import java.awt.event.*;
public class TankeClient01 extends Frame {
	int x = 50;
	int y = 50;
	//绘图  paint画笔
	public void paint(Graphics g) {
			Color c = g.getColor();
			g.setColor(Color.RED);
		    g.fillOval(x, y, 30, 30);//画出图像xywh
			g.setColor(c);
			x += 1;
			y += 2;
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
	   new Thread(new Thread_m()).start(); //开启线程
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TankeClient01 f1 = new TankeClient01();
		f1.newf();
	}
	
	//创建线程Thread_m 实现 Runnable
	private class Thread_m implements Runnable {
		@Override
		public void run() {
			// TODO 自动生成的方法存根
			while(true) {
				repaint(); //重画
				try {
					Thread.sleep(10);//每10毫秒画一次
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}
}
