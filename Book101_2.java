package bookQuize;

import java.util.Scanner;

public class Book101_2 {
	public static void main(String[] args) {
		
	Scanner input2 = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻʽÿ� : ");
		int x = input2.nextInt();
		int y = input2.nextInt();
		int a = x/y;
		int b = x%y;
		
		System.out.println(x+"��"+y+"�� ���� ����"+a+"�̰� ��������"+b+"�Դϴ�.");
		
		input2.close();
	
	}
}
