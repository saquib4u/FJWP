package june21;

public class Demo21 extends DemoAbstract{

	@Override
	void customerDetails() {
		// TODO Auto-generated method stub
		System.out.println("customer Details in child class");
		
	}

	@Override
	void takeLoan() {
		// TODO Auto-generated method stub
		System.out.println("take loan in child class");
		
	}
	public static void m() {
		System.out.println("concrete method");
	}
	public static void main(String[] args) {
		Demo21 d=new Demo21();
		d.m();
		d.takeLoan();
		d.customerDetails();
	}
	

}
