package com.stuff;

import java.util.ArrayList;
import java.util.Scanner;

public class subStringMatch {

	public subStringMatch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner scan = new Scanner(System.in);
		
		
		int num = scan.nextInt();
		ArrayList<String> arr = getData(num, scan);
		matchSubString(arr,num);
		scan.close();
	
}
	private static void matchSubString(ArrayList<String> arr,int num) {
		// TODO Auto-generated method stub
		String str1,str2;
		for(int i=0;i<num*2;i++){
			str1 = arr.get(i);
			str2 = arr.get(i+1);
			i++;
			//str1= str1.toUpperCase();      
			if(str1.length()<=1000 && str2.length()<=1000 && str1.matches("[A-Z0-9a-z]*") && str2.matches("[A-Z0-9]*")){
				str1 = str1.toUpperCase();
				char[] strA =str1.toCharArray();
				char [] strB = str2.toCharArray();
				int b=0;
				
				for(int a=0;a<strA.length;a++){	 
					if(b< strB.length){
						if(strB[b]!= strA[a]){
							strA[a]=' ';
						} else{
							b++;
						}
					} else{
						strA[a]=' ';
					}

				}	
				
				if(String.valueOf(strA).replaceAll(" ", "").equals(String.valueOf(strB))){
					System.out.println(String.valueOf(String.valueOf(strA).replaceAll(" ", ""))+"----");
					System.out.println(String.valueOf(strB)+"======");
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
		}
	}

	private static ArrayList<String> getData(int num, Scanner scan) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		if(num<=10){
			for(int i=0;i<(num*2);i++){
				arr.add(scan.next());
			}
		
		}
		return arr;
	}


}


/* if((str1.toUpperCase()).contains(str2.toUpperCase())){
str1= str1.toUpperCase();
int pos = str1.indexOf(str2);
System.out.println(pos+"-"+str2.length());
str1= str1.substring(pos,(pos+str2.length()));
System.out.println("YES");

}
else{
System.out.println("NO");
}
// if(scan.hasNext()){
/* for(int i=0;i<=(num*2);i++)
{
if(scan.hasNext())
arr.add(scan.nextLine()); 
arr.add(scan.nextLine()); 
System.out.println(i+"-"+arr.get(i));
}
//}*/
