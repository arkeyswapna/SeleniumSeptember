package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingElementAsnmt1 {

	
	public static void main(String[] args) {
		/*
		 // Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration*/
		int[] nums= {1,2,3,4,7,8,9,6};
		List<Integer> l=new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			
			l.add(nums[i]);
			
		}
		
		
		
		Collections.sort(l);
		for (int i = 0; i <l.size()-1; i++) {
			
			if(l.get(i)+1!=l.get(i+1))
				System.out.println(l.get(i)+1);
			
			
			
		}
		
		
	}
		
		//Successfully executed

	}


