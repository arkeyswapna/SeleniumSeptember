package week3.day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesFromSentence {

	public static void main(String[] args) {
		String str="We learn java basics as part of java sessions in java week3";
		String[] split=str.split(" ");
		Set<String> set= new LinkedHashSet<String>();
		
		for (String each : split) {
			set.add(each);
			
		}
		System.out.println(set);
		
		
System.out.println("HI");
	}

}
