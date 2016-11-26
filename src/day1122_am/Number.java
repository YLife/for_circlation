package day1122_am;

public class Number {
	public static void main(String[] args) {
		int i;
		for ( i = 0;; i++) {
			if (Math.sqrt(i+100)%1==0&&Math.sqrt(i+100+168)%1==0) {
				System.out.println(i);
			}
		}
	}
}
