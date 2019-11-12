package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		int[] num= {25,35,25,35,45,55,65};
		Set<Integer> values = new LinkedHashSet<Integer>();
		for(Integer newValues :num) {
			System.out.println(values);
		}

	}

}
