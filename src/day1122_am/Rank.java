package day1122_am;

import java.util.Scanner;

public class Rank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ɼ�:");
		int score=sc.nextInt();
		if (score>=0&&score<=100) {
			switch (score / 10) {
			case 10:
				System.out.println("�ɼ�ΪA��");
				break;
			case 9:
				System.out.println("�ɼ�ΪA��");
				break;
			case 8:
				System.out.println("�ɼ�ΪB��");
				break;
			case 7:
				System.out.println("�ɼ�ΪC��");
				break;
			case 6:
				System.out.println("�ɼ�ΪD��");
				break;
			default:
				System.out.println("�ɼ�ΪE��");
				break;
		    } 
		}else {
			System.out.println("��������");
		}
		
	}

}
