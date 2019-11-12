package week3.day1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import net.bytebuddy.matcher.CollectionSizeMatcher;

public class LearnList {

	public static void main(String[] args) {
		ArrayList<String> values = new ArrayList<String>();
		values.add("Wipro");
		values.add("Google");
		values.add("TestLeaf");
		values.add("TCS");
		values.add("Microsoft");
		//System.out.println(values.size());
		//System.out.println(values.get(2));
		Collections.sort(values);
		Collections.reverse(values);
		for(String val: values) {
			
            System.out.println(val);
		}
		

	}

}
