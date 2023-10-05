package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class aa {

	public static void main(String[] args) {
		// Here is the input
				int temp =1;
				
				//Delcaring the List
				List<Integer> list = new ArrayList<Integer>();
				
				//Adding the numbers to List
				Collections.addAll(list,1,2,3,4,7,6,8);
				
 
				// Sorting the list
				Collections.sort(list);
				System.out.println("The List after sorting: "+list);
				
				//Find missing number in arraylist
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i) +" " + temp);
					
					if (list.get(i) != i + temp) //1 = 1; 2 = 2; 3 = 3; 4 = 4; 6 !=5; 7=7
					{
						System.out.println("The Missing element in the array is :" + (i + temp)); //5
						temp++; //2
					}
				}
			
	}
	
}