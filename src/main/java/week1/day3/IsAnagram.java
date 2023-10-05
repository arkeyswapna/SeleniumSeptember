package week1.day3;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {
		String str1="hello";
		char[] ch1 = str1.toCharArray();
		Arrays.sort(ch1);
		String str2="oelhl";
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch2);
		boolean bAnagram=true;
		for (int i = 0; i < ch2.length; i++) {
			if(ch1[i]!=ch2[i]) {
				System.out.println("Not Anagram");
				bAnagram=false;
				break;
			}
			
		}
		if(bAnagram) {
			System.out.println("Anagram");
		}
		
		
	}

}
