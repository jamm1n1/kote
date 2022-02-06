package kote;


import java.util.Scanner;

public class Numberplay {


	public static int count = 0;

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a;

	a = sc.nextInt();
    int b = a;
	naturalSum(a,b,0,"");

	System.out.println(count);
	}

	public static void naturalSum(int a, int b, int sum, String x) {

	if(b <= 0 || sum > a) return;
	else if(sum == a) { // 끝에서 "+" 빼야함
	System.out.println(x.substring(0,x.length()-1));
	count++;

	} else {
	if(b + sum > a) { //
	while (b+sum > a) {
	b--;
	}
	}
	
	naturalSum(a, b,sum+b, x+ b + "+" );
	naturalSum(a, b-1,sum, x);
	}


	}



}
