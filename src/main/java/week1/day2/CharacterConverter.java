package week1.day2;


public class CharacterConverter {

	public static void main(String[] args) {
	
String sample = "changeme";
	
		char[] charArray = sample.toCharArray();
	
		for (int i = 0; i < charArray.length; i++) {
			
			//System.out.println(charArray[i]);
			
			if (i%2 == 1) {
				
				System.out.print(Character.toUpperCase(charArray[i]));
			}
			else {

				System.out.print(charArray[i]);
			}
		}
	}
}
	



