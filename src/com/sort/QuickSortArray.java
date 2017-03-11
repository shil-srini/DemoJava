package com.sort;

public class QuickSortArray {

	public QuickSortArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {		
		int[] inputArr = {100,202,1,13,24,19,12,10};
for(int e :inputArr){
			
			System.out.print(e +" ");
		}
		QuickSortArray Qsr = new QuickSortArray();
		Qsr.sort(inputArr,0,inputArr.length-1);
		System.out.println("output :");
		for(int e :inputArr){
			
			System.out.print(e +" ");
		}
		
	}
	public void sort(int[] inputArr,int first, int last){
		int pivot = first;
		int i=first,j=last;
		while(i <j){
			while(inputArr[i]<inputArr[pivot]){
				i++;
			}
			while(inputArr[j]>inputArr[pivot]){
				j--;
			}
			if(i<=j){
				swap(inputArr,i,j);
				i++;j--;
			}
			if(first<j){
				sort(inputArr,first,j);
			}
			if(i<last)
				sort(inputArr,i,last);
		}
		System.out.println("first : "+ i + " Last "+j);				
	}
				

			
					
			
			
		
	private void swap(int[] inputArr, int i, int j) {
		int temp=0;
		temp = inputArr[i];
		inputArr[i]=inputArr[j];
		inputArr[j] = temp;
		
	}

}
