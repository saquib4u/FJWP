package july5;
//you need to create a  array [5]of student student should have id name and address  student has a address . In address class  city , state ,  pincode  not print entire array  after this  change last student address data  and change last student entire
public class Student {
	private int id;
	private String name;
	private Address address;
	
	 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	Student(){};
	  
	public void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.getCity()+" "+address.getState()+" "+address.getPincode());  
	}  
 
}
