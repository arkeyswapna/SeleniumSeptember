package week1.day3;

import java.util.Arrays;

public class MaxMinOfArray {

	public static void main(String[] args) {
		int[] num= {22,987,998,-90,0,78,89};
		Arrays.sort(num);
		
		System.out.println("Minimun value is "+num[0]);

		System.out.println("Maximun value is "+num[num.length-1]);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
