package day1122_am;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入一个不超过5位的数:");
		int num=sc.nextInt();
		int num5,num4,num3,num2,num1;
		if (num>=10000&&num<100000) {
			num5=num/10000;
			num4=num/1000%10;
			num3=num/100%10;
			num2=num/10%10;
			num1=num%10;
			System.out.println(""+num+":"+num5+" "+num4+" "+num3+" "+num2+" "+num1+"");
		}else if (num>=1000&&num<10000) {
			num4=num/1000;
			num3=num/100%10;
			num2=num/10%10;
			num1=num%10;
			System.out.println(""+num+":"+num4+" "+num3+" "+num2+" "+num1+"");
		}else if (num>=100&&num<1000) {
			num3=num/100;
			num2=num/10%10;
			num1=num%10;
			System.out.println(""+num+":"+num3+" "+num2+" "+num1+"");
		}else if (num>=10&&num<100) {
			num2=num/10;
			num1=num%10;
			System.out.println(""+num+":"+num2+" "+num1+"");
		}else if (num>=0&&num<10) {
			num1=num;
			System.out.println(""+num+":"+num1+"");
		}else {
			System.out.println("输入有误");
		}
	}

}
