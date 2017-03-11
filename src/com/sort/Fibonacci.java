package com.sort;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of fibonacci numbers required");
		int num=0;
		if(sc.hasNext()){
			num=sc.nextInt();
			System.out.println(num);
		}
		ArrayList<Integer> Arr = new ArrayList<>();
		Arr.add(0);
		Arr.add(1);
		for(int i=0;i<num;i++){
			Fibonacci.fibonacci(Arr,i,i+1);
		}
		for(Integer a :Arr){
			System.out.println(a +" ");
		}
	}
	public static void fibonacci(ArrayList<Integer> Arr,int i, int j){
			int sum = 0;			
				sum+=Arr.get(i)+Arr.get(j);
			
			Arr.add(sum);
		
	}

}
