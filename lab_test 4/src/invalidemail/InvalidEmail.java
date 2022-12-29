package invalidemail;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InvalidEmail {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Email plz...");
		String mail=sc.next();
		String regPattern="^[a-zA-Z0-9_+&*-]+(?:\\."+
		"[a-zA-Z0-9_+&*-]+)*@"+
		"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		
		try {
			if(!Pattern.matches(regPattern, mail)) {
				throw new InvalidEmailException("Invalid Email...");
			}
		}
		catch(InvalidEmailException ex) {
			System.out.println(ex.getMessage());
		}
		

	}
	
}
