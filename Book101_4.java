package bookQuize;

import java.util.Scanner;

public class Book101_4 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("원기둥 밑면의 반지름을 입력하시오 >> ");
				int x = input.nextInt();
		
		System.out.println("원기둥 밑면의 높이를 입력하시오 >> ");
			int y = input.nextInt();
			
			final double PI = Math.PI;
			double result = x * x * PI * y;
		System.out.println("원기둥의 부피는 "+result+"입니다.");
		
	}
}
