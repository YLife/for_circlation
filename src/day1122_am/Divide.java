package day1122_am;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num=sc.nextInt();
		if(num%5==0&&num%6==0){
			System.out.println("这个数能被5和6整除");
		}else if (num%5==0&&num%6!=0) {
			System.out.println("这个数只能被5整除");
		}else if (num%5!=0&&num%6==0) {
			System.out.println("这个数只能被6整除");
		}else{
			System.out.println("这个是不能被5或6整除");
		}
	}

}
