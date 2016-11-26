package day1122_am;

public class Income {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 0; i < 10; i++) {
			sum+=30000*(1+0.06);
		}
		System.out.println(sum);
	}

}
