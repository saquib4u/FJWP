package june24;

public class ImmutableClass {


//Create a class called ImmutableClass with a final variable name and a constructor that initializes the name variable. Ensure that the name variable cannot be changed once it's set.
	private final String name;
	public ImmutableClass(String name) {
      this.name = name;
  }
	public String getName() {
		return name;
	}
//	public String setName(String name) {
//		this.name=name;
//	}

  
	public static void main(String[] args) {
		ImmutableClass obj1 = new ImmutableClass("abc");
		System.out.println(obj1.getName()); 
		//obj1.setName("def"); //error
		System.out.println(obj1.getName()); 
	}
}

