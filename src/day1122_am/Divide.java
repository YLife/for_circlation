package day1122_am;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������");
		int num=sc.nextInt();
		if(num%5==0&&num%6==0){
			System.out.println("������ܱ�5��6����");
		}else if (num%5==0&&num%6!=0) {
			System.out.println("�����ֻ�ܱ�5����");
		}else if (num%5!=0&&num%6==0) {
			System.out.println("�����ֻ�ܱ�6����");
		}else{
			System.out.println("����ǲ��ܱ�5��6����");
		}
	}

}
