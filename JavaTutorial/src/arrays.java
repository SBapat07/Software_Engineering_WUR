
public class arrays {

	public static void main(String[] args) {
		
//		String[] cars = {"Camaro", "Tesla", "Ferrari"};
//		
//		cars[0] = "Mustang";
//		
//		System.out.println(cars[0]);
//		
		String[] cars = new String[3];
		
		cars[0] = "Mustang";
		cars[1] = "Tesla";
		cars[2] = "Ferrari";
		
//		System.out.println(cars[1]);

		for(int i=0; i<cars.length; i++) {
			
			System.out.println(cars[i]);
		}
	}

}
