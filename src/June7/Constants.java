package June7;
//Create a class called Constants with a final variable PI and a final method calculateArea().
public class Constants {
	final double PI=3.1415;
	public final double calculateArea(double r) {
		double area=PI*r*r;
		return area;
	}
	public static void main(String[] args) {
		Constants c= new Constants();
		System.out.println(c.calculateArea(3));
	}
}
