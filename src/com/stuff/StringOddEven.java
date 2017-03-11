package com.stuff;

import java.util.*;

public class StringOddEven {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String[] strArr = new String[10];
        int num = scan.nextInt();
        for(int i=0;i<num;i++)
            {
             strArr[i] = scan.next();
        }
         char[] strChar = new char[10000];
        for (int j=0;j<strArr.length;j++){
            String str = strArr[j];
            if(str!= null && (str.length()) >2){
            strChar = str.toCharArray();
            char[] str1 = new char[5000];
            int a=0,b=0;
            char[] str2 =new char[5000];
             for(int i=0;i<strChar.length;i++){
                if(i%2==0){
                    str1[a] = strChar[i];a++;
                }
                 else{
                     str2[b] = strChar[i]; b++;
                 }
             }
           // System.out.println(String.valueOf(str1)+" ========\n  "+String.valueOf(str2));
            }
        }
        scan.close();
    }
}