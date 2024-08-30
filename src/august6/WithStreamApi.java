package august6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamApi {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1,"jeans", 3500));
		list.add(new Product(2,"shirt", 1500));
		list.add(new Product(3,"tv", 35000));
		list.add(new Product(4,"mixer", 4500));
		list.add(new Product(5,"phone", 25000));
		list.add(new Product(6,"tshirt", 500));
		list.add(new Product(7,"Refrigerator",15000));
		
		
		List<Integer> listOfPrice = list.stream()
				.filter(p -> p.price > 3000)
				.map(p -> (int) p.price)
				.collect(Collectors.toList())
				;
//		int sum1 = list.stream()
//                .filter(p -> p.price > 3000)
//                .mapToInt(p -> (int) p.price)
//                .sum();
		int sum1 = listOfPrice.stream()
                .mapToInt(Integer::intValue)
                .sum();
		System.out.println(listOfPrice);
		System.out.println(sum1);
		
//		List<integer>listOfPrice1=new ArrayList<>();
//		int totalSum=list.stream()
//						 .filter(p -> p.price > 3000)
//						 .peek(1 -> listOfPrice1.add(1.price))
//						 .mapToInt(o -> o.price)
//						 sum();
		
		
	}
}
