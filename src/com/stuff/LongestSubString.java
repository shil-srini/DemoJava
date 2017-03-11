package com.stuff;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestSubString {

	public LongestSubString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input1,input2, sub, matchingStr;
	      int length;
	      ArrayList<String> matchingStrArr = new ArrayList<>();
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter a string to print it's all substrings");
	      input1  = in.nextLine();
	      input2 = in.nextLine();
	      length = input1.length();   	 	 
	      for( int  c = 0 ; c < length ; c++ )
	      {
	    	  System.out.println("c= "+c);
	         for(int i = 1 ; i <= length - c ; i++ )
	         {
	        	 System.out.println("i= "+i+" c+i = "+(c+i));
	            sub = input1.substring(c, c+i);
	           if(input2.contains(sub)){
	        	   //System.out.println(sub);
	        	   matchingStrArr.add(sub);
	           }	            
	         }
	      }
	      String longestsubString = matchingStrArr.get(0);
	      for(int j=0;j<matchingStrArr.size()-1;j++){
	    	  if(longestsubString.length() < matchingStrArr.get(j).length()){
	    		  longestsubString = matchingStrArr.get(j);
	    	  }
	    	  
	      }
	      System.out.println(longestsubString);
	      
	      
	      
	   }
		/*Scanner sc =new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String subStr = "";
        for(int i =input1.length();i>0;i--){
        	
            if(input2.contains(input1.substring(0,i))){
                subStr = input1.substring(0,i);
                System.out.println(subStr);
                break;
            }
        }*/
        
	

}
