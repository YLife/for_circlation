package day1122_am;

import java.util.Scanner;

public class Award {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入当月利润:");
		double profit=sc.nextDouble();
		double award;
		if (profit>0&&profit<=100000) {
			award=profit*0.1;
			System.out.println("奖金为:"+award);
		}else if (profit>100000&&profit<200000) {
			award=(profit-100000)*0.075+100000*0.1;
			System.out.println("奖金为:"+award);
		}else if (profit>=200000&&profit<=400000) {
			award=(profit-200000)*0.05+100000*0.075+100000*0.1;
			System.out.println("奖金为:"+award);
		}else if (profit>400000&&profit<600000) {
			award=(profit-400000)*0.03+200000*0.05+100000*0.075+100000*0.1;
			System.out.println("奖金为:"+award);
		}else if (profit>=600000&&profit<=1000000) {
			award=(profit-600000)*0.015+200000*0.03+200000*0.05+100000*0.075+100000*0.1;
			System.out.println("奖金为:"+award);
		}else {
			award=(profit-1000000)*0.01+400000*0.015+200000*0.03+200000*0.05+100000*0.075+100000*0.1;
			System.out.println("奖金为:"+award);
		}
	}

}
