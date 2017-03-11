package com.sort;

import java.util.Scanner;

public class MergeArray {

	/*private int[] array;
	private int[] tempMergArr;
	private int length;

	public static void main(String a[]){

		int[] inputArr = {45,2,11,89,77,98,4,28,65,43};
		MergeArray mms = new MergeArray();
		mms.sort(inputArr);
		for(int i:inputArr){
			System.out.print(i+" ");
			
		}
	}

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
		for(int i:array){
			System.out.print(i+" --");
			
		}
		
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

	}

}*/

	private  int[] sortedArr = new int[7];
	private  int[] tempArr= new int[7];
	public MergeArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] inputArr = {2,33,14,44,23,10,45};
		scan.close();
		System.out.println("input Array :");
		for(int a:inputArr){
			System.out.print(a+" ");
		}System.out.println("::::\n");
		
		MergeArray mr = new MergeArray();
		mr.tempArr = inputArr;
		mr.sort(inputArr,0,inputArr.length-1);
		
		for(int a:mr.tempArr){
			System.out.print(a+" ");
		}
	}

	
	private  void sort(int[] inputArr,int first, int last) {
		
		if(first<last){
			int pivotPos = (first +last)/2;
			sort(inputArr,first,pivotPos);
			sort(inputArr,pivotPos+1,last);
			merge(first,pivotPos,last);
		}		
	}
	
	private void merge( int first, int pivotPos, int last) {
		// TODO Auto-generated method stub
		int i=first,j=pivotPos+1,k=first;
		for(int count =0;count<tempArr.length;count++){
			sortedArr[count] = tempArr[count];
		}		 
		
		while(i<=pivotPos && j<=last){
			if(sortedArr[i]<=sortedArr[j]){
				tempArr[k] =sortedArr[i];
				i++;				
			}
			else{
				tempArr[k] =sortedArr[j];
				j++;	
			}
			k++;
		}
		while(i<=pivotPos){
			tempArr[k] = sortedArr[i];
			i++;k++;
		}
		
		
	}

}
