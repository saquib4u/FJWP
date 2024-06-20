package June7;

/*you have to create address and  you have to crate a student bean and use address as student has address int varible  then you several object  and print and you have to check  how thing is working */
public class Student {
	
	private int StudentId;
	private String StudentName;
	private Address address;
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		this.StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + StudentId + ", studentName=" + StudentName + ", address=" + address + "]";
	}
	
	
	
	
}
