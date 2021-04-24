package chapter10;

public class Stringdemo {

	public static void main(String[] args) 
	{
		String greeting = "Hello world!";
		System.out.println(greeting);
		
		String message = new String("Hello world!");
		System.out.println(message);
		
		char helloArray[] = {'h', 'e', 'l', 'l', 'o'};
		String helloString = new String(helloArray);
		System.out.println(helloString);
		
		char chars[] = "Java".toCharArray();
		System.out.println(chars);
		System.out.println("Welcome".replace('e', 'A'));
		System.out.println("Welcome".replaceFirst("e", "AB"));
		
		String tokens[] ="Java#HTML#Perl".split("#");
		for(int i=0; i < tokens.length; i++)
		{
			System.out.println(tokens[i] + " ");
		}
		
		System.out.println("");
		System.out.println("Java is fun".matches("Java.*"));
		System.out.println("Java is cool".matches("java.*"));
		System.out.println("is powerful".matches("Java.*"));
		
		double value =5.44;
		System.out.println(String.valueOf(value));
		
		StringBuilder str = new StringBuilder();
		
		//StringBuffer - same as StringBuilder
		
		str.append("GFG");
		System.out.println("String =" + str.toString());
	}	
}
