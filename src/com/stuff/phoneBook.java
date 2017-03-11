package com.stuff;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class phoneBook {

	public phoneBook() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> phoneData = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneData.put(name, phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneData.containsKey(s)){
            	System.out.println(s+" = "+phoneData.get(s));
            }
            else{
            	System.out.println("Not found");
            }
        }
        in.close();
    }
}
