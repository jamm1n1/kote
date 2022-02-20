package kote;

import java.util.Scanner;

public class Width {

	Scanner sc = new Scanner(System.in);
public void height(int w ,int h ) {
	
	
	/*if(w==h) {
		System.out.println(w*h-w);
	}else {
		System.out.println(w*h-(w*2));
	}
		
}*/
	int result = 0;
	int min = (w < h) ? w : h; 
	int g = 0;
	for (int i = 1; i <= min; i++){ 
		if (w % i == 0 && h % i == 0) 
			g = i;
	}


	result= w*h - (w+ h -g) ;
	System.out.println(result);
	
}
}
