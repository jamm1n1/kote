package kote;

import java.util.Scanner;

public class ThreeOne {
	Scanner sc = new Scanner(System.in);
	

	public void code() {
		System.out.println("�� �Է�");
	int num = sc.nextInt();
	int num2 = sc.nextInt();			
	int max = 1;
	int count = 1;
		for(int i=num; i<=num2; i++){
			int num3 = i;
			count = 1;
	while(true) {	
		
		if(num3 == 1) {
			break;
		}else if(num3 % 2 == 0) {		
			num3 = num3 / 2;			
			count++;
		}else if(num3 % 2 != 0) {		
			num3 = num3*3 +1;			
			count++;
		}
		if(count>max) 
			max=count;
	}

	}
		System.out.println("�� ���ư� Ƚ��"+max);
}
	
}