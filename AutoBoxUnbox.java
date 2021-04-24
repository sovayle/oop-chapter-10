package chapter10;

public class AutoBoxUnbox {

	public static void main(String[] args) {
		char ch ='a';
		//auto boxing
		Character a =ch;
		Character ch1 = 'a';
		
		//unboxing
		char a1 = ch1;
		
		//printing values from objects
		System.out.println("Values of Wrapper objects: Character object a: " + a);
		
		//printing values from data types
		System.out.println("Values of unWrapped values: char value, ch: " + ch);
		
		//printing a1
		System.out.println("printing a1: " + a1);

	}

}
