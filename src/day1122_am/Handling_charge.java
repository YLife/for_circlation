package day1122_am;

import java.util.Scanner;

public class Handling_charge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入转账金额:");
		int capital=sc.nextInt();
		if (capital>0&&capital<100) {
			System.out.println("汇费为:1元");
		}else if (capital<=5000) {
			System.out.println("汇费为为:"+capital*0.01+"元");
		}else {
			System.out.println("汇费为:50元");
		}
	}

}
