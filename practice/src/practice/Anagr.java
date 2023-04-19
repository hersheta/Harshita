package practice;

import java.util.Arrays;

public class Anagr {
	//equals and sort
	//step1 remove whitespace
	//findlength
	//convert to lowercase
	//sort
	//comapre sorted array with equals
	public static boolean isAnagram(String s1,String s2) {
		String str1=s1.replaceAll("\\w", "");
		String str2=s2.replaceAll("\\w", "");
		if(str1.length()!=str2.length()) {
		return false;
		}

	else {
	
		char[]ch1=str1.toLowerCase().toCharArray();
		char[]ch2=str2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);

		}
}

		public static void main(String args[]) {
System.out.println(isAnagram("Silent","Listen"));
System.out.println(isAnagram("one","neo"));
System.out.println(isAnagram("Silen","Listen"));
System.out.println(isAnagram("Silent","Listen"));


			
	}
	}


