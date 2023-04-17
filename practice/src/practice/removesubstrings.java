package practice;

public class removesubstrings {
	public static void main(String args[]) {
		String s="I am harshita";
		for(int i=0;i<s.length();i++) {
			System.out.println(s.replaceAll("[I,m]", ""));
		}
	}

}


