package bookQuize;

import java.util.Scanner;

public class Book101_4 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("����� �ظ��� �������� �Է��Ͻÿ� >> ");
				int x = input.nextInt();
		
		System.out.println("����� �ظ��� ���̸� �Է��Ͻÿ� >> ");
			int y = input.nextInt();
			
			final double PI = Math.PI;
			double result = x * x * PI * y;
		System.out.println("������� ���Ǵ� "+result+"�Դϴ�.");
		
	}
}
