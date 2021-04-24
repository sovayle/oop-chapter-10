package chapter10;

public class WrapperObjs {

	public static void main(String[] args) {
		int num1 = 5;
		System.out.println("num1 is " +num1);
		
		Integer myInt =5;
		Double myDouble =5.99;
		Character myChar = 'A';
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(myChar);
		
		System.out.println("Using wrapper class methods: ");
		
		System.out.println(myInt.intValue());
		System.out.println(myDouble.doubleValue());
		System.out.println(myChar.charValue());
		
		Integer myInteger =100;
		String myString = myInteger.toString();
		System.out.println(myString.length());

	}

}
