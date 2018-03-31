/*键盘控制坦克移动
双缓冲 解决图片闪烁问题*/
/*画出圆形 让图形动起来*/
import java.awt.*;
import java.awt.event.*;
public class TankeClient01 extends Frame {
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGHT = 600;

	Tank myTank = new Tank(50,50);
	Image offScreenImage = null;
	//绘图  paint画笔
	public void paint(Graphics g) {
		myTank.paint(g);
	}

	public void update(Graphics g) { 
		//调用repaint 重写画笔之前先调用他的update方法 我们在update方法里面截 建立一个画布 在屏幕后面 让图像先写入这个画布，然后一次性再写入屏幕，这样可以解决闪烁问题
		if(offScreenImage == null) {
			offScreenImage = this.createImage(GAME_WIDTH, GAME_HEIGHT);
		}
	
		Graphics gOffScreen = offScreenImage.getGraphics();	
		Color c = gOffScreen.getColor();
		gOffScreen.setColor(Color.GREEN);
		gOffScreen.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);  
		gOffScreen.setColor(c);
		paint(gOffScreen);
		g.drawImage(offScreenImage,0,0,null);
	}

	public void lauchFrame () {
	   this.setSize(GAME_WIDTH, GAME_HEIGHT);//设置窗口大小
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
	   new Thread(new PaintThread()).start(); //开启线程
	   this.addKeyListener(new KeyMonitor());
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TankeClient01 f1 = new TankeClient01();
		f1.lauchFrame();
	}
	
	//创建线程Thread_m 实现 Runnable
	private class PaintThread implements Runnable {
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

	public class KeyMonitor extends KeyAdapter {

		public void keyPressed(KeyEvent e) {
			
			myTank.keyPressed(e);
			
		}
		
	}
}
