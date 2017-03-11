/**
 * 
 */
package com.sort;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author shilpa
 *
 */
public class Quick {

	/**
	 * 
	 */
	public Quick() {
		// TODO Auto-generated constructor stub		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> inputArr = new ArrayList<Integer>();
		System.out.println("enter the number of elements");
		int num = scan.nextInt();
		System.out.println("enter the numbers");
		for(int i=0;i<num;i++){
			inputArr.add(scan.nextInt());
		}
		scan.close();
		System.out.println("input Array :");
		for(int a:inputArr){
			System.out.println(a);
		}
		int pivotPos = inputArr.size()/2;
		int last = inputArr.size()-1;
		int first = 0;
		
		quicksort(inputArr,first,pivotPos,last);
		
	}



	private static void quicksort(ArrayList<Integer> inputArr, int first, int pivotPos, int last) {
		// TODO Auto-generated method stub
		int pivot = inputArr.get(pivotPos);
		while(first <last){
			sort(first,pivot-1,inputArr);
			sort(pivot+1,last,inputArr);
		}
		
		
	}



	private static void sort(int first, int last, ArrayList<Integer> inputArr) {
		// TODO Auto-generated method stub
		System.out.println("first : "+ first + " Last "+last);
	}

}
