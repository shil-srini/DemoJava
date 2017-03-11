package com.search;

import java.util.Scanner;

public class BinarySearch {

	private int result =-1;
	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int[] inArr = {2,33,44,54,76,87,93};
		System.out.print("input : ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		BinarySearch binSearch = new BinarySearch();
		int index = binSearch.search(inArr,input,0,inArr.length-1);
		if(index>=0){
			System.out.println("Input found at :"+index);
		}
		else{
			System.out.println("Input Not found");
		}
		scan.close();
	}

	private int search(int[] inArr, int input, int first, int last) {
		
		int pivot = (last+first)/2;		
		if (first <=last) {
			if (input == inArr[pivot]) {				
				result = pivot;	
			}else if (inArr[pivot] < input) {
				search(inArr, input, pivot + 1, last);
			} else if (inArr[pivot] > input) {
				search(inArr, input, first, pivot-1);
			} 
		}
		return result;
	}

}
