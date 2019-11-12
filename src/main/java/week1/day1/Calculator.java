package week1.day1;

public class Calculator {
 static int a=3;
 static int b=2;
	public int add(int a, int b) {
int c = a+b;
return c;	
}
	
public int sub(int a, int b) {
	int c = a-b;
	return c;	
}

public int mul(int a, int b) {
	int c = a*b;
	return c;	
}
public int div(int a, int b) {
	int c = a/b;
	return c;	
	}

public static void main(String[] args) {
	Calculator obj = new Calculator();
	
	System.out.println(obj.add(a, b));
	System.out.println(obj.sub(a, b));
	System.out.println(obj.mul(a, b));
	System.out.println(obj.div(a, b));}
		// TODO Auto-generated method stub

}
