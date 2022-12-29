package duplicate;

import java.util.Scanner;

public class DuplicateCh {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.next();
		s1=s1.toLowerCase();
		char[] ch=s1.toCharArray();
		dupMethod(ch);
	}
	public static void dupMethod(char[] ch) {
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
				}
			}
		}
	}
}
