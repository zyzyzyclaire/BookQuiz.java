package bookQuize;

import java.util.Scanner;

public class Book97 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�����Դϱ�?(����:1 �����ƴ�:0) >> ");
		boolean x = (input.nextInt() == 1)? true : false ;
		
		System.out.print("�α�(����: ��)");
		int y = input.nextInt();
		
		System.out.print("�� �ҵ��� 1�� �̻��� ������ ��(����: ��)");
		int z =input.nextInt();
		
		boolean result = ( x && (y >= 100) ) || ( z >= 50 );
				
				
		System.out.println("��Ʈ�������� ����: " + result );
		
		input.close();
		
	}
}
