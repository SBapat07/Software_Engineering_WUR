import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name = "";
		
		while(name.isEmpty()) {
			
			System.out.println("Enter you name: ");
			name = input.nextLine();
		}
		
		System.out.println("Hello "+name);
//		
//		do {
//			
//			System.out.println("Enter you name: ");
//			name = input.nextLine();
//		}while(name.isEmpty());
//		
//		System.out.println("Hello "+name);

	}

}
