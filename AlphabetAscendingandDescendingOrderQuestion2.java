package com.yash;
//2.WAP to print the all alphabets of string in 
//ascending and descending order.
public class AlphabetAscendingandDescendingOrderQuestion2 {
   public static void main(String[] args) {
	String s1="yash technologies";
      char a[] = s1.toCharArray();
       System.out.println("Ascending orders are :");
        for (int i = 0; i < a.length; i++) {
        	for (int j = i + 1; j < a.length; j++) {
           if (a[i] > a[j]) {
               char temp = a[i];
               a[i] = a[j];
               a[j] = temp;
           }
   
       }
System.out.print(a[i] + " ");
  }
  System.out.println(" ");
  System.out.println("Descending orders are :");
  for (int i = 0; i < a.length; i++) {
       for (int j = i + 1; j < a.length; j++) {
          if (a[i] < a[j]) {
               char temp = a[i];
               a[i] = a[j];
               a[j] = temp;
           }
       }
       System.out.print(a[i] + " ");
   }
}
}