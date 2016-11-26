package day1122_am;

public class Prime_number {
	public static void main(String[] args) {
		int j;
		for (int i = 2;; i++) {
			for (j = 2; j <=i; j++) {
				if (i%j==0&&i!=j) {
					break;
				}
				if (i%j==0&&i==j) {
					break;
				}
			}
			if (i%j==0&&i==j&&i>200) {
				System.out.println(i);
				break;
			}
		}
	}

}
