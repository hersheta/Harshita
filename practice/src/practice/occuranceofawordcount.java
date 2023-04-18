package practice;

public class occuranceofawordcount {
	public static void main(String args[]) {
		String str = "avdgsgds";
		int count;
		count=0;
		String s[]=str.split("");
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)){
					count++;
					System.out.println("occurance: "+str.charAt(i));
										
									}
								}
								
							}
							}
						}




