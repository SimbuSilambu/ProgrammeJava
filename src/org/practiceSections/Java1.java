package org.practiceSections;

public class Java1 {
	public static void main(String[] args) {
		
		
		String S = "Arasan";
		String S1 ="";
		for(int i = S.length()-1;i>=0;i--) {
			
			S1=S1+S.charAt(i);
		}if(S.equals(S1)) {
			System.out.println("palindrome");
		}else System.out.println("not");
	}

}
