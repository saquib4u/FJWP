package test;

import java.util.Scanner;
//For the first line, sum the lengths of  and .
//For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
//For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
public class StringProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int sum = s1.length() + s2.length();
        System.out.println(sum);

        if (s1.compareTo(s2) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String s3 = s1.substring(0,1).toUpperCase() + s1.substring(1);
        String s4 = s2.substring(0, 1).toUpperCase() + s2.substring(1);
        System.out.println(s3+ " " + s4);
	}

}
