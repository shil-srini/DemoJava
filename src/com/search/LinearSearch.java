package com.search;

import java.util.Scanner;

public class LinearSearch {

	public LinearSearch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] inArr = {2,33,14,44,23,10,45};
		System.out.print("input : ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		LinearSearch linSearch = new LinearSearch();
		int index = linSearch.search(inArr,input);
		if(index >=0){
			System.out.println("Input Present at position: "+(index+1));
		}
		else{
			System.out.println("input not found");
		}
		scan.close();
	}

	private int search(int[] inArr, int input) {
		for(int count =0;count<inArr.length;count++){
			if(input == inArr[count]){
				return count;
			}
		}
		return -1;
	}

}
