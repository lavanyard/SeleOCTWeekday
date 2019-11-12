package week1.day5;

import org.apache.poi.hssf.record.chart.ChartStartObjectRecord;

import com.beust.jcommander.converters.CharArrayConverter;

import freemarker.core.StringArraySequence;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "lavanya";
		String rev= "";

		char[] a = name.toCharArray();
		
	
		for(int i=a.length-1;i>=0;i--){
			
			rev=rev+a[i];
		}
				
		
		if(name.equals(rev))
		{
			System.out.println("The given string is palindrome" );
		}
		else {
			System.out.println("The given string is not palindrome");
		}

	}

}
