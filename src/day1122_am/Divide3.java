package day1122_am;

public class Divide3 {
	public static void main(String[] args) {
		int i;
	    int max=100;
	    int sum=0;
	    for (i=1; i<=max; i++) {
			if (i%3==0) {
				sum+=i;
			}
		}
	    System.out.println(sum);
	}	
}
