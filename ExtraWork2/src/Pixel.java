import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;

public class Pixel {
 public static JFrame frame = new JFrame();
 public static int width = Toolkit.getDefaultToolkit().getScreenSize().width; 
 public static int height = Toolkit.getDefaultToolkit().getScreenSize().height;
 public boolean run = false;
 public BufferedImage img;
 public Thread thread;
 public int[] pixels;
 public Screen screen;
 
 public  Pixel() {
	 screen = new Screen(width, height);
	 img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	 pixels = ((DataBufferInt) img.getRaster().getDataBuffer()).getData();
 }
 public void start() {
	 if(run)
		 return;
	 run = true;
	 thread = new Thread();
	 thread.start();
 }
 public void run() {
	 while(run) {
		 trick();
		 render();
	 }
 }
 private void trick() {
	 
 }
 private void render() {
	 screen = new Screen(width,height);
	 BufferStrategy bs = this.getBufferStrategy;
	 if(bs == null) {
		 createBufferStrategy(3);
		 return;
	 }
	 for(int i = 0; i < width * height; i++) {
		 pixels[i] = screen.pixels[i];
		 Graphics g = bs.getDrawGraphics();
		 g.drawImage(img, 0, 0, width, height, null);
		 g.dispose();
		 bs.show();
	 }
 }
	public static void main(String[] args) {
	 Pixel pixel = new Pixel();
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(pixel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
}
