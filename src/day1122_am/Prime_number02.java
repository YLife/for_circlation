package day1122_am;

public class Prime_number02 {
	public static void main(String[] args) {
		boolean b=true;
		for (int i = 2;b; i++) {
			for (int j = 2; j <=i; j++) {
				if (i%j==0&&i!=j) {
					break;
				}
				if (i%j==0&&i>200) {
					System.out.println(i);
					b=false;
				}
			}
			
		}
	}

}
