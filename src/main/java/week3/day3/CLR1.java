package week3.day3;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class CLR1 {

	public static void main(String[] args) {
		
		//Remove duplicate values from "google"
		
		String companyName="google";
		
//    First way to convert String to char
		
//		char[] ch=new char[companyName.length()];
//		for (int i = 0; i < ch.length; i++) {
//			ch[i]=companyName.charAt(i);
//			System.out.println(ch[i]);
//		}
		
		//Second way to convert string to char
		
		char[] ch = companyName.toCharArray();
		
		
		System.out.println(ch);
		
		Set<Character> set1=new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			set1.add(ch[i]);
			
		}
		System.out.println(set1);
		
		

	}

	
	//Successful
}
