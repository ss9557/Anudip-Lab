package stringchange;

import java.util.Scanner;

public class ChangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.next();
		System.out.println(changeMathod(s1));
	}
	public static String changeMathod(String s) {
		if(s.length()<=4) {
			return s;
		}
		StringBuilder sb=new StringBuilder(s);
		int j=s.length()-4;
		for(int i=0;i<j;i++) {
			sb.setCharAt(i, 'X');
		}
		return sb.toString();
	}

}
