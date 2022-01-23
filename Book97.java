package bookQuize;

import java.util.Scanner;

public class Book97 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("수도입니까?(수도:1 수도아님:0) >> ");
		boolean x = (input.nextInt() == 1)? true : false ;
		
		System.out.print("인구(단위: 만)");
		int y = input.nextInt();
		
		System.out.print("연 소득이 1억 이상인 부자의 수(단위: 만)");
		int z =input.nextInt();
		
		boolean result = ( x && (y >= 100) ) || ( z >= 50 );
				
				
		System.out.println("메트로폴리스 여부: " + result );
		
		input.close();
		
	}
}
