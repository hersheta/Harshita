package learning;

class Manipulationpractice {
	
	public static void main(String args[]) {
		String  str=" h,a,r,s,h,i,t,a";
		System.out.println(str.replaceAll(",",""));

		String []name=str.split(",");
		for(int i=0;i<name.length;i++) {
		
			
			System.out.println(name[i]);
		
}
	}
}


//?//?if whitespaces before i =0
//split will write the strings in a seperate line

//to split convert string into array

