package week2.day1;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Bajaj extends Bike{
	public void cost() {
		System.out.println("100");
	}

	
    public void speed() {
    	System.out.println("80");
    }
    	public static void main(String[] args) {
		
    		Bajaj b=new Bajaj();
    		b.cost();
    		b.speed();
	}
	}
