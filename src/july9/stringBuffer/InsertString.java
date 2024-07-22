package july9.stringBuffer;
//write a Java program to insert a string at a specific position in another string using StringBuffer.
//Input: str = "HelloWorld", insertStr = "Beautiful", pos = 5 Output: HelloBeautifulWorld

public class InsertString {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("HelloWorld");
		String insertStr="Beautiful";
		int pos=5;
		System.out.println(str.insert(pos, insertStr));
	}

}
