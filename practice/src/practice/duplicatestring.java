package practice;
import java.util.Scanner;


public class duplicatestring {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter a string: ");
		String s[]= {"java","java"};
		String result="";
				
	
		for(int i=0;i<s.length;i=i+1) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]==s[j])
				{
					System.out.println("foundduplicate: "+s[i]);
				}
			}
		}
	}

}
//duplicate in a string
//duplicate an array
