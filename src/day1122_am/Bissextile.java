package day1122_am;

import java.util.Scanner;

public class Bissextile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year=sc.nextInt();
		if (year%4==0&&year%100!=0||year%400==0) {
			System.out.println("����������");
		}else {
			System.out.println("���겻������");
		}
	}

}
