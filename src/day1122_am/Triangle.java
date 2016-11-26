package day1122_am;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三角形的三条边：");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a+b>c&&a+c>b&&b+c>a) {
			if (a==b||b==c||a==c) {
				if (a==b&&b==c) {
					System.out.println("这是等边三角形");
				}else {
					if (a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a) {
						System.out.println("这是直角三角形");
					}else {
						System.out.println("这是等腰三角形");
					}	
				}	
			}else {
				if (a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a) {
					System.out.println("这是直角三角形");
				}else {
					System.out.println("这是普通三角形");
				}	
			}
		}else {
			System.out.println("不能构成三角形");
		}
	}

}
