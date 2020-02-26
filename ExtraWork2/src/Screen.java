import java.util.Random;

public class Screen extends Render {
private Render test;

public Screen(int width, int height) {
	super(width,height);
	int i;
	Random rand = new Random();
	test = new Render(64,64);
	for(i = 0; i < 64 * 64;i++ ) {
		test.pixels[i] = rand.nextInt();
		render();
}
}
	public void render() {
		draw(test, 20, 20);
	}

}
