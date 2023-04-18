package learning;

public class prg8 {
	public static void main(String args[]) {
		String s="mom,dad,sumee";
		char arr[]=s.toCharArray();
		String rev="";
		int len=s.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			{
				if(s==rev) {
					System.out.println("is a palindrome");
				}
				else {
					System.out.println("is not a palindrome");
				}
				}
			}
	}

}