package bookQuize;

import java.util.Scanner;

public class Book98 {
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

		 System.out.print("년도를 입력하세요>>");
		 int x =input.nextInt();
		 boolean y = (x % 4 == 0);
		 boolean z = (x % 100 != 0);
		 
		 boolean result = y && z;
		 
		 System.out.println("윤년 여부 "+result);
		 
		 input.close();
		 
		 double a = 1+2/3;
		 System.out.println(a);
	}
}
