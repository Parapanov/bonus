
public class Render {

	
	public int width;
	public int height;
	public int[] pixels;
	
	public Render(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	}
	public void draw(Render render, int xOffSet, int yOffSet) {
		int xPixel;
		int yPixel;
		int y;
		int x;
		for(x=0; x < render.width; x++) {
			xPixel = x + xOffSet;
			for(y=0; y < render.height; y++) {
				yPixel = y + yOffSet;
				pixels[xPixel + yPixel * width] = render.pixels[xPixel - xOffSet + (yPixel - yOffSet) * render.width];
			}
		}
	}
}
