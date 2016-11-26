package day1122_am;

public class Fibnacci {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 10; i++) {
			b=a+b;
			a=b-a;
			System.out.println(b);
		}
		
	}
}
