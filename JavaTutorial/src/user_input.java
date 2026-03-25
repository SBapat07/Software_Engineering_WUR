import java.util.Scanner;

public class user_input {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("what is your name?");
		
		String name = input.nextLine();
		
		System.out.println("how old are you?");
		
		int age = input.nextInt();
		input.nextLine();	// This line is added to clear the escape sequence stored in input
		
		System.out.println("what is your favourite food?");
		
		String food  = input.nextLine();	// after nextInt nextLine don't ask for the input we need to change some things here
		
		System.out.println("My name is "+name);
		
		System.out.println("You are"+age+"years old");
		
		System.out.println("My favourite food is:"+food);

	}

}
