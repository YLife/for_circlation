package day1122_am;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ɼ���");
		int score=sc.nextInt();
		if (score>=90&&score<=100) {
			System.out.println("�ȼ�Ϊ:A");
		}else if (score>=80&&score<90) {
			System.out.println("�ȼ�Ϊ:B");
		}else if (score>=70&&score<80) {
			System.out.println("�ȼ�Ϊ:C");
		}else if (score>=60&&score<70) {
			System.out.println("�ȼ�Ϊ:D");
		}else if (score>=0&&score<60) {
			System.out.println("�ȼ�Ϊ:E");
		}else {
			System.out.println("����ɼ���Ч");
		}
	}

}
