package day1122_am;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�����������ε������ߣ�");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a+b>c&&a+c>b&&b+c>a) {
			if (a==b||b==c||a==c) {
				if (a==b&&b==c) {
					System.out.println("���ǵȱ�������");
				}else {
					if (a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a) {
						System.out.println("����ֱ��������");
					}else {
						System.out.println("���ǵ���������");
					}	
				}	
			}else {
				if (a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a) {
					System.out.println("����ֱ��������");
				}else {
					System.out.println("������ͨ������");
				}	
			}
		}else {
			System.out.println("���ܹ���������");
		}
	}

}
