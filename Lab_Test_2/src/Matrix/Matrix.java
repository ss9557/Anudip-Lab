package Matrix;

import java.util.Arrays;

public class Matrix {
	 public static void main(String[] args) {
	       int[][] arr1 = {{10, 20, 30}, 
	                       {40, 50 ,60},
	                       {60, 70, 80}};

	       int[][] arr2={{1, 2, 3},
	                     {4, 5, 6}, 
	                     {7, 8, 9}}; 
	       int[][] finalans = resultantArray(arr1,arr2);
	       print(finalans);
	    }
	    static int[][] resultantArray(int[][] arr,int[][] arr2){
	        int[][] ans = new int[arr.length][arr.length];
	        for (int row = 0; row < arr.length; row++) {
	            for (int col = 0; col < arr[row].length; col++) {
	                ans[row][col] = arr[row][col]+arr2[row][col];
	            }
	        }
	        return ans;
	    }
	    static void print(int[][] arr){
	         for (int row = 0; row < arr.length; row++) {
	            for (int col = 0; col < arr[row].length; col++) {
	                System.out.print(arr[row][col]+" ");
	            }
	             System.out.println("");
	        }
	    }

}
