package learning;

private class prog12 {
	public static void main(String args[]) {
		
	
	String str = "dad";
	//Write Java logic to print the word which are palindrome from the given string.
	//Output: dad, mom
	int len=str.length();
	String rev=" ";
	String [] sp=str.split("");
	for(int i=sp.length-1;i>=0;i--) {
		rev=rev+str.charAt(i);
		
	}
	if(rev==str) {
		System.out.println("Palindrome");
		
	}
	else
	{
		System.out.println("Not a Palindrome");
	}

	}
}
