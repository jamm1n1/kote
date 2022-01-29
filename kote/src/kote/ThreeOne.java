package kote;

import java.util.Scanner;

public class ThreeOne {
	Scanner sc = new Scanner(System.in);
	

	public void code() {
	int num = sc.nextInt();
	int count = 1;
	while(true) {

		if(num == 1) {
			break;
		}else if(num % 2 == 0) {
		
			num = num / 2;
			count++;
		}else if(num % 2 != 0) {
		
			num = num*3 +1;
			count++;
		}
		
	}
	System.out.println(count);
	}
}