package august6;

import java.util.ArrayList;
import java.util.List;

public class WithoutStreamApi {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1,"jeans", 3500));
		list.add(new Product(2,"shirt", 1500));
		list.add(new Product(3,"tv", 35000));
		list.add(new Product(4,"mixer", 4500));
		list.add(new Product(5,"phone", 25000));
		list.add(new Product(6,"tshirt", 500));
		list.add(new Product(7,"Refrigerator",15000));
		
		ArrayList<Integer>ss=new ArrayList<>();
		int sum=0;
		for(Product p : list) {
			if(p.price > 3000) {
				ss.add((int) p.price);
				sum += p.price;
			}
		}
		System.out.println(ss);
		System.out.println(sum);
		
	}
}
