package practice;

public class removezeroes {
	public static void main(String args[]) {
		String s="harsh00it@2a";
		for(int i=0;i<s.length();i++) {
			System.out.println(s.replaceAll("[@,0,2]", ""));
		}
	}

}
