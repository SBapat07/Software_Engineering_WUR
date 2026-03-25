import java.util.ArrayList;

public class multidimentional_arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> grocerylist = new ArrayList<String>();
		
		ArrayList<String> backerylist = new ArrayList<String>();
		
		backerylist.add("pasta");
		backerylist.add("garlic bread");
		backerylist.add("donuts");
		
		ArrayList<String> producelist = new ArrayList<String>();
		
		backerylist.add("tomato");
		backerylist.add("peppers");
		backerylist.add("onion");
		
		ArrayList<String> drinkslist = new ArrayList<String>();
		
		backerylist.add("beer");
		backerylist.add("wine");
		backerylist.add("juice");
		
		grocerylist.addAll(backerylist);
		grocerylist.addAll(producelist);
		grocerylist.addAll(drinkslist);
		
		System.out.println(grocerylist);
		
		
		
	}

}
