package com.yash;
//4.WAP to print the number of alphabets repeated 
//in the given string.
public class PrintTheNumbersOfAlphabetsQuestion4 {
 public static void main(String[] args)
 {
	String s="yash technologies";
   for(int i=0;i<s.length();i++)
   {
	   for(int j=i+1;j<s.length();j++)
	   {
		   if(s.charAt(i)==s.charAt(j))
		   {
			   System.out.print(s.charAt(i));
		   }
	   }
   }
}
}
