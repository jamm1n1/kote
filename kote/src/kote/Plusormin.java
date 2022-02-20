package kote;

import java.util.Scanner;

public class Plusormin {
	Scanner sc = new Scanner(System.in);
public void numberp() {
	System.out.println("첫번째수");
	int first = sc.nextInt();
	System.out.println("두번째수");
	int second = sc.nextInt();
	int result = 0;
    
    for(int i = first; i <= second; i++) {
        int count = 0;
        
        for(int j = 1; j <= i; j++) {
            if(i % j == 0) count++;
        }
        
        if(count % 2 == 0) {
        	result += i;     
    } else { result -= i;
    }
   
}
    System.out.println(result);
}
}
