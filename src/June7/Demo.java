package June7;

public class Demo {

	
	public static void main(String[] args) {
		
		
		Address add1  =  new Address();
		
		add1.setCity("indore");
		add1.setPincode("32233");
		add1.setState("Mp");
		
		Employee e1  = new Employee() ;// Constructor return karta hai instance of object 
		
		e1.setEmpId(12)  ;
		e1.setEmpName("vishal")  ;
		e1.setAddress(add1)  ;
		
		
		
		
		
		System.out.println(e1.getAddress());
		System.out.println(e1.getEmpId());
		System.out.println(e1.getAddress().getCity());
		System.out.println(e1);
		
//		Employee e2  = new Employee(2323 , "Raju" , "indore") ;
//		
//		System.out.println(e2);
//		
//		
		
	}
}