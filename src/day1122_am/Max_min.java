package day1122_am;

import java.util.Scanner;

/*
 * 	�������������Լ������С������
 */
public class Max_min {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������������");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z;
		if (x<y) {
			int temp;
			temp=x;
			x=y;
			y=x;
		}
		int a=x;
		int b=y;
		while (b!=0) {
			z=a%b;
			a=b;
			b=z;
		}
		System.out.println("���Լ��Ϊ:"+a);
		System.out.println("��С������Ϊ:"+x*y/a);
	}
}
