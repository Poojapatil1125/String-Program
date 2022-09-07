package com.yash;
//3.WAP to remove all the vowels from the given string.
public class RemoveAllVowelsStringQuestion3 {
  public static void main(String[] args) {
	String s="pooja patil";
	//char[] a=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!='a' &&s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u' )
		{
			System.out.print(s.charAt(i));
		}
	}
}
}
