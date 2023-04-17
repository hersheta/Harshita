package practice;

import java.util.Scanner;

public class Stringpalidnrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string:");
			String result=sc.next();
		String s =" ";
		String rev=" ";
		int len=s.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
				if(s.equals(rev)){
				System.out.println(s+" is a palindrome");
				
			}
				else
				{
					System.out.println(s+" not a palindrome");

				}
				
				}

		
	
}