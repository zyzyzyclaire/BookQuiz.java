package bookQuize;

import java.util.Scanner;

public class Book101_1 {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.print("�̸�:");
		String name = input.next();
		
		System.out.print("����: ");
		int age = input.nextInt();
		
		System.out.println("�̸��� "+name+"�̰�, ���̴� "+age+"�� �Դϴ�.");
		
		input.close();
		
	}
}
