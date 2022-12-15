package LabTest_1;

public class GreatestNumber {

	public static void main(String[] args) {
//	    Enter First Number
	    int First_number = 11;
//	    Enter Second Number
	    int Second_number = 16;
//	    Enter Third Number
	    int third_number = 15;

	    int ans = greatest(First_number,Second_number,third_number);
	    System.out.println("Greatest number is : "+ans);

	}
	static int greatest(int first,int second,int third){
        int largest = 0;
        if(first>second) {
            if(first>third) {
                largest = first;
            }else {
                largest = third;
            }
        } else {
            if(second>third) {
                largest = second;
            } else {
                largest = third;
            }
        }
        return largest;
    }
}
