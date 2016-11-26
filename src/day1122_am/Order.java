package day1122_am;

import java.util.Scanner;

public class Order {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三个数字");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int max=num1;
		int num4;
		if(max>num2){
			num4=num1;
			num1=num2;
			num2=num4;
		}
		if (num2>num3) {
			num4=num2;
			num2=num3;
			num3=num4;
		}
		if (num1>num2) {
			num4=num1;
			num1=num2;
			num2=num4;
		}
		System.out.println(""+num1+" "+num2+" "+num3+"");
	}

}
