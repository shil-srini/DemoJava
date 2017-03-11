package com.sort;

import java.util.Arrays;

public class MergeOwn {

	public MergeOwn() {
		// TODO Auto-generated constructor stub
	}
	private int[] tempArr = new int[7];

	public static void main(String[] args) {
		int[] inArr = {2,33,14,44,23,10,45};
		System.out.print("input : ");
		for(int e :inArr){
			System.out.print(e+" ");
		}
		MergeOwn mergeSort = new MergeOwn();
		mergeSort.sort(inArr,0,inArr.length-1);
		System.out.print("output : ");
		for(int e :inArr){
			System.out.print(e+" ");
		}
	}

	private void sort(int[] inArr,int first,int last) {
		int pivot = 0;
		
		if(first<last){
			pivot = (first+last)/2;
			sort(inArr,first,pivot);
			sort(inArr,pivot+1,last);
			merge(inArr,first,last);
			
		}
	}

	private void merge(int[] inArr, int first, int last) {
		System.out.println("first : "+first+" last: "+last);
		int pivot = (last+first)/2;
		int k=first,i=first,j=pivot+1;
		tempArr = Arrays.copyOf(inArr, inArr.length);
		while(i<=pivot && j<=last){
				if(tempArr[i]<=tempArr[j]){
				inArr[k]=tempArr[i];
					i++;
				}
				else{
					inArr[k]=tempArr[j];
					j++;
				}
				k++;
			}
			while(i<pivot){
				inArr[k]= tempArr[i];
				i++;k++;
			}
		}
		
	

}
