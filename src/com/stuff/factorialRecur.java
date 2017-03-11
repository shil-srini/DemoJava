package com.stuff;

import java.util.Scanner;

public class factorialRecur {

	public factorialRecur() {
		// TODO Auto-generated constructor stub
	}

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	        int num = scan.nextInt();
	        if(num>=2 && num<=12){
	            int result = factorial(num);
	            System.out.println(result);
	        }
	        
	        scan.close();
	    }
	    public static int factorial (int num){
	        int result=1;
	        if(num==1){
	            result= 1;
	        }
	        else{
	            result = result*factorial(num-1);
	        }
	        return result;
	    }
	    

}
