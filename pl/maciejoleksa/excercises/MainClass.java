package pl.maciejoleksa.excercises;

//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;


public class MainClass {

	

	public static void main(String[] args) {
				
			CreditCard[ ] wallet = new CreditCard[3];
			wallet[0] = new CreditCard("John Bowman", "California Savings",
			"5391 0375 9387 5309", 5000);
			wallet[1] = new CreditCard("John Bowman", "California Federal",
			"3485 0399 3395 1954", 3500);
			wallet[2] = new CreditCard("John Bowman", "California Finance",
			"5391 0375 9387 5309", 2500, 300);
			for (int val = 1; val <= 16; val++) {
			wallet[0].charge(3*val);
			wallet[1].charge(2*val);
			wallet[2].charge(val);
			}
			
			for (CreditCard card : wallet) {
			CreditCard.printSummary(card);
			// calling static method
			while (card.getBalance( ) > 200.0) {
			card.makePayment(200);
			System.out.println("New balance = " + card.getBalance( ));
			}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		GetJSONFromURL get = new GetJSONFromURL();
//		String test = get.urlContent.toString();	
//		
//		JSONObject parse = new JSONObject(test);
//        JSONArray days = parse.getJSONArray("list");
//        JSONObject dayIndex = days.getJSONObject(2);
//        JSONObject temp = dayIndex.getJSONObject("temp");
//        
//        System.out.println("whole query: \n" + parse + "\n");
//        System.out.println("Days:" + days.toString());
//        System.out.println("on day: " + dayIndex.toString());
//        System.out.println("temperature query: " + temp.toString());
//        System.out.println("max temperature: " + temp.getDouble("max"));
	}
}
