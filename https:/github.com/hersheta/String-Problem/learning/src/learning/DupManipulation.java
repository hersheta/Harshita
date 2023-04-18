package learning;

 class DupManipulation {
	
	public static void main(String args[]) {
		String str= "harshita@Srivastava@";
		char[] alp=str.toCharArray();
		String dup=" ";
		
		
		for(int i=0;i<alp.length;i++) {
			for(int j=i+1;j<alp.length;j++) {
		
if(alp[i]==alp[j]){
	
	System.out.println(alp[j]);


	}
	}
		}
	}
 }
