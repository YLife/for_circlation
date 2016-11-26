package day1122_am;

import java.util.Scanner;

public class Rank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入成绩:");
		int score=sc.nextInt();
		if (score>=0&&score<=100) {
			switch (score / 10) {
			case 10:
				System.out.println("成绩为A等");
				break;
			case 9:
				System.out.println("成绩为A等");
				break;
			case 8:
				System.out.println("成绩为B等");
				break;
			case 7:
				System.out.println("成绩为C等");
				break;
			case 6:
				System.out.println("成绩为D等");
				break;
			default:
				System.out.println("成绩为E等");
				break;
		    } 
		}else {
			System.out.println("输入有误");
		}
		
	}

}
