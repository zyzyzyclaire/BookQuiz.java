package bookQuize;

import java.util.Scanner;

public class Book101_2 {
	public static void main(String[] args) {
		
	Scanner input2 = new Scanner(System.in);
		
		System.out.println("정수를 입력하십시오 : ");
		int x = input2.nextInt();
		int y = input2.nextInt();
		int a = x/y;
		int b = x%y;
		
		System.out.println(x+"를"+y+"로 나눈 몫은"+a+"이고 나머지는"+b+"입니다.");
		
		input2.close();
	
	}
}
