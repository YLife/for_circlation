package day1122_am;

import java.util.Scanner;

public class Handling_charge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ת�˽��:");
		int capital=sc.nextInt();
		if (capital>0&&capital<100) {
			System.out.println("���Ϊ:1Ԫ");
		}else if (capital<=5000) {
			System.out.println("���ΪΪ:"+capital*0.01+"Ԫ");
		}else {
			System.out.println("���Ϊ:50Ԫ");
		}
	}

}
