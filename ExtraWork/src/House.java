import java.util.Scanner;

public class House extends Building {
	public int rooms;
	public int height[];
	public House(int area, String color) {
		super(area, color);
		this.height = height;
		height=new int[s];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<height.length; i++) {
			System.out.println("—града с номер"+ i +"e висока");
			do 
				height[i] =sc.nextInt();
				while(height[i]<3 || height[i]>100);
		
	}
	

}
