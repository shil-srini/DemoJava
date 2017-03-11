package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MergeSort {


	private List<Integer> sortedArr = new ArrayList<>();
	private List<Integer> tempArr = new ArrayList<>();
	public MergeSort() {
		// TODO Auto-generated constructor stub
		
	}
	
	
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
		}System.out.println("::::");		
		MergeSort mr = new MergeSort();
		mr.tempArr.addAll(inputArr);
		mr.sort(0,inputArr.size()-1);
		for(int a:mr.sortedArr){
			System.out.println(a);
		}
	}

	private void sort( int first, int last) {
		// TODO Auto-generated method stub
		if(first<last){
			int pivotPos = (first+last)/2;
			sort(first,pivotPos);
			sort(pivotPos+1,last);
			merge(first,pivotPos,last);
		}
				
	}

	private void merge(int first, int pivotPos, int last) {
		// TODO Auto-generated method stub
		int i=first,j=pivotPos+1;
		sortedArr.clear();
		sortedArr.addAll(tempArr);
		
		while(i<=pivotPos && j<=last){
			if(sortedArr.get(i)<sortedArr.get(j)){
				tempArr.add(sortedArr.get(i));
				i++;				
			}
			else{
				tempArr.add(sortedArr.get(j));
				j++; 
			}
		}
		while(i<pivotPos){
			tempArr.add(sortedArr.get(i));
			i++;
		}		
	}	
}
