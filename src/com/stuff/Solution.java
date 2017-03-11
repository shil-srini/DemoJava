package com.stuff;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
       // int []arr1 = new int[n-q];
      //  int [] arr2 = new int[q];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
       /* int x=0,y=q;
        for(int i=a.length-1,j=0;i>=0;i--){
            if(y>0){
                arr2[x] =a[i];
                y--;x++;
            }
            else{
                arr1[j] =a[i];
                j++;
            }
        }*/
        int[] result = new int[n];
        for(int i=0;i<k;i++){
        	result[0] = a[n-1];
        	 System.arraycopy(a, 0, result, 1, n-1);
        	 System.arraycopy(result,0 , a, 0, n);
        }
        
       
        //System.arraycopy(arr2, 0, a, q-1, n);
        
        for(int s = 0; s < q; s++){
            int m = in.nextInt();
            if(m<q){
                System.out.println(a[m]);
            }
        }
    }
}
