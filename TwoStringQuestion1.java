package com.yash;
import java.util.Scanner;
//1.Create a program in which two string is input by the 
//user and after that user will enter 
//index in first string where we want to insert the second 
//string and insert the second string at 
//that index and create a new string 
public class TwoStringQuestion1{
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the first string");
	String str1=scanner.next();
	System.out.println("enter the second string");
	String str2=scanner.next();
		int index = 5;
		String s1 = new String();
		for (int i = 0; i < str1.length(); i++) {
		s1 = s1 + str1.charAt(i);
		if (i == index) {
		s1 = s1 + str2;
		}
		}
		System.out.println(s1);
		}
}
