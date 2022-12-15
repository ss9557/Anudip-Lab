package Alternate;

public class Alternate_Question {

	public static void main(String[] args) {
//		First Array
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		
//		This function provide Second Array with alternate elements of first array
//		Second Array contain in ans array
        int[] ans = secondArray(arr);
        System.out.println(sum(ans));
	}
	
//  For Calculating Sum  
	static int sum(int[] arr){
        int sum = 0;
        for(int i: arr){
            sum+=i;
        }
        return sum;
    }
	
	
//  For Finding Second Array which carry Alternate elements
	
    static int[] secondArray(int[] arr){
//    	Creating second array of half length of actual array
        int[] arr2 = new int[arr.length/2];
        for (int first = 0,second = 0; first < arr.length; first+=2,second++) {
            arr2[second] = arr[first];
        }
//      Returning the Second Array contaning the Alternate elements
        return arr2;
    }

}
