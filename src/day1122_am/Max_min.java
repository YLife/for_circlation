package day1122_am;

import java.util.Scanner;

/*
 * 	求两个数的最大公约数和最小公倍数
 */
public class Max_min {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入两个数");
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
		System.out.println("最大公约数为:"+a);
		System.out.println("最小公倍数为:"+x*y/a);
	}
}
