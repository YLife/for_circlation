package day1122_am;

import java.util.Scanner;

public class Suitable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num=sc.nextInt();
		if (num==1||num==5||num==10) {
			System.out.println("num="+num);
		}else {
			System.out.println("num=none");
		}
	}

}
