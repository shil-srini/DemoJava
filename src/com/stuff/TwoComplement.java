package com.stuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class TwoComplement {

	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int counter=1,result=1;
		ArrayList<Integer> baseTwoNum = new ArrayList<>();
		while(n!=0) {
			baseTwoNum.add(n % 2);
			n = n / 2;
		}
		Collections.reverse(baseTwoNum);
		System.out.println(baseTwoNum);
		
		for(int i=1;i<(baseTwoNum.size());i++){
			if(baseTwoNum.get(i) ==1){
				
				if( baseTwoNum.get(i-1)==1){
					counter++;
					result=counter;
				}
				else{
					if(counter>result){
					result=counter;
					counter=0;
					}
				}
				
			}
		}
		System.out.println(result);
		in.close();
	}
}
