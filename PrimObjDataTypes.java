package chapter10;

import java.util.Arrays;

public class PrimObjDataTypes {

	public static void main(String[] args) {
		System.out.println("PRIMITIVE DATATYPES\n");
		int x =10;
		int y =x;
		System.out.println("Initially: x = " + x + ", y = " + y);
		
		//change in y not affect x
		y= 30;
		System.out.println("now: x = " + x + ", y = " + y);
		
		System.out.println("REFERENCE DATATYPES\n");
		int c[] = {10, 20, 30, 40, 50};
		int d[] = c;
		
		System.out.println("Initially: array c = " + Arrays.toString(c));
		System.out.println("Initially: array d = " + Arrays.toString(d));
		//changing an array member
		d[1]=50;
		System.out.println("now: array c = " + Arrays.toString(c));
		System.out.println("now: array d = " + Arrays.toString(d));
		
		
	}

}
