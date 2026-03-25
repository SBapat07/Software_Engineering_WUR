import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		
//		double x = 3.14;
//		double y = 10;
//		
//		double z = Math.max(x, y);
//		double z = Math.min(x, y);
//		double z = Math.abs(y);
//		double z = Math.abs(x);
//		double z = Math.sqrt(y);
//		double z = Math.round(x);
//		double z = Math.ceil(x);
//		double z = Math.floor(x);
//		
//		System.out.println(z);
		
		// Find Hypotenuse of a triangle
		
		double x, y, z;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the side x: ");
		x = input.nextDouble();
		
		System.out.println("Enter the side y: ");
		y = input.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenuse is: "+z);
		
		input.close();	// Not necessary but a good practice

	}

}
