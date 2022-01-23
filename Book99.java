package bookQuize;

import java.util.Scanner;

public class Book99 {
	public static void main(String[] args) {
		int x=10, y=2, z=2;
		z= ++x / y;
		System.out.println("x : "+x+", y ; "+y+", z : "+z);

		x *= y + 1;
		System.out.println("x : "+x+", y ; "+y+", z : "+z);
		
		z = ++x + y++;
		System.out.println("x : "+x+", y ; "+y+", z : "+z);

		int i = 10;
		int n = i++ % 2;
		System.out.println("i : "+i+", n : "+n);
		
	}
}
