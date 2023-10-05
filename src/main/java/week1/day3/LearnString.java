package week1.day3;

public class LearnString {

	public static void main(String[] args) {
		//String literal
		String companyName="TestLeaf";
		//String object
		String company= new String("TestLeaf");
		String company1= new String("testleaf");
		// length() -> to find how many characters in the String
		int length = companyName.length();
		System.out.println(length);
		// toCharArray() -> convert string to a character array -> returns char array
		char[] charArray = companyName.toCharArray();
		System.out.println(charArray);
		//equals() -> to compare string content -> returns boolean
		boolean equals = companyName.equals(company);
		System.out.println(equals);
		//System.out.println(companyName==company);
		//equalsIgnoreCase() -> It will ignore the case sensitive
		boolean equalsIgnoreCase = companyName.equalsIgnoreCase(company1);
		System.out.println(equalsIgnoreCase);
		//contains()->compare the string with the matching content->boolean
		boolean contains = companyName.contains("Leaf");
		System.out.println(contains);
		//indexOf()-> will return the position of the character->returns int
		int indexOf = companyName.indexOf('a');
		System.out.println(indexOf);
		//charAt()-> gives character available at the given position-> returns character
		char charAt = companyName.charAt(2);
		System.out.println(charAt);
		

	}

}
