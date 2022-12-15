package LabTest_1;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
//		first number
		int first_number = 9;
//		Second number
		int second_number = 12;
		
		
		/* For operations to perfrom.
	    for Addition choose : 1
		for Addition choose : 2
		for Addition choose : 3
		for Addition choose : 4*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Operation number");
		int op = sc.nextInt();
		int operation = op;
		
		operations(first_number,second_number,operation);

	}
	static void operations(int a,int b,int op){
      switch(op){
       case 1:
           System.out.println("Sum = "+(a+b));
           break;
       case 2:
           System.out.println("Difference = "+(a-b));
           break;
       case 3:
           System.out.println("Product = "+(a*b));
           break;
       case 4:
           System.out.println("Division = "+(a/b));
           break;
       default:
           System.out.println("Wrong Choice!!");
           break;
      }
    }

}
