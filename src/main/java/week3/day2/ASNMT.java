package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ASNMT {

	public static void main(String[] args) {
		int count=1;
		List<Integer> l1= new ArrayList<Integer>();
		Collections.addAll(l1, 1, 2, 3, 4, 7, 6, 8);
		System.out.println("The elements are : "+l1);
		Collections.sort(l1);
		System.out.println("The Elements after Sorting :"+l1);
		for(int i=0;i<l1.size();i++)
		{
			if(l1.get(i) != i+count)
				{
					System.out.println("TheMissing element is:" +(i+count));
					count++;
				}
		}
	}
}
