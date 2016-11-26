package day1122_am;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score=sc.nextInt();
		if (score>=90&&score<=100) {
			System.out.println("等级为:A");
		}else if (score>=80&&score<90) {
			System.out.println("等级为:B");
		}else if (score>=70&&score<80) {
			System.out.println("等级为:C");
		}else if (score>=60&&score<70) {
			System.out.println("等级为:D");
		}else if (score>=0&&score<60) {
			System.out.println("等级为:E");
		}else {
			System.out.println("输入成绩无效");
		}
	}

}
