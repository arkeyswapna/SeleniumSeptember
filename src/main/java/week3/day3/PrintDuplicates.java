package week3.day3;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] nums= {2,4,6,3,5,3,2,1,2,3};
	Set<Integer> set=new HashSet<Integer>();
	
	//To display unique set
//	for (int i = 0; i < nums.length; i++) {
//		set.add(nums[i]);
//	}
//	System.out.println(set);
	
	//To display duplicate values
	
	Set<Integer> duplicates=new HashSet<Integer>();
	for (int i = 0; i < nums.length; i++) {
		boolean add= set.add(nums[i]);
		if(!add)
			duplicates.add(nums[i]);
	}
			System.out.println(duplicates);
		
	}
	


}
