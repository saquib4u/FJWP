package June7;

public class displayStudent {

	
	public static void main(String[] args) {
		
		
		Address add1  =  new Address();
		
		add1.setCity("indore");
		add1.setPincode("32233");
		add1.setState("Mp");
		
		Student s1  = new Student() ;
		
		s1.setStudentId(1)  ;
		s1.setStudentName("James")  ;
		s1.setAddress(add1)  ;
		
		
		System.out.println(s1.getAddress());
		System.out.println(s1.getStudentId());
		System.out.println(s1.getAddress().getCity());
		System.out.println(s1);
		
		
	}
}