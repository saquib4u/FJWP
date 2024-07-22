package july15;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class ExampleHashSet {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hmp=new HashMap<>();
		hmp.put("Virat" , 120  ) ;
		hmp.put("Dhoni" , 130  ) ;
		hmp.put("Suresh" , 110  ) ;
		
		hmp.put("Rohit" , 150  ) ;
		
		hmp.put(null , 1200  ) ;
		
		
//		for(String  s:mp) {
//			System.out.println(s);
//		}
		
		
	//	Set<Map.Entry<String , Integer> > st  =  ;
		
		
		for( Map.Entry<String , Integer> ee :hmp.entrySet()) {
			System.out.println(ee.getKey() +"------------> " + ee.getValue());
			
		}
		
		
	}

}
