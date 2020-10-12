import java.util.HashMap;
import java.util.Scanner;

public class TestSearchMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String,Integer> ht=new HashMap<String,Integer>();
	       
	       ht.put( "Rahim",87867979);
	       ht.put( "Ram",7089967);
	       ht.put( "Rani",77875778);
	       ht.put( "Rani",766589777);
	      // System.out.println(ht);     
		 Scanner scan = new Scanner(System.in);  
	        System.out.println("Enter a name:");  
	        String x = scan.nextLine();  
	       // System.out.println("Value is:" + ht.get(x));  
	        if(ht.containsKey(x)) {
	        	System.out.println("Phone number is" + ht.get(x));
	        }
	        else {
	        	System.out.println("Contact dosent exist");
	        }
	}

}
