
public class multidimentional_arrays {

	public static void main(String[] args) {
		
		String [][] cars = new String[3][3];
		
		cars[0][0] = "Camero";
		cars[0][1] = "Corvette";
		cars[0][2] = "Ferrari";
		
		cars[1][0] = "Mustang";
		cars[1][1] = "Jeep";
		cars[1][2] = "Lambo";
		
		cars[2][0] = "Silverado";
		cars[2][1] = "BMW";
		cars[2][2] = "Dodge";
		
		for(int i=0; i<cars.length; i++) {
			
			System.out.println();
			
			for(int j=0; j<cars[i].length; j++) {
				
				System.out.println(cars[i][j]+ " ");
			}
		}

	}

}
