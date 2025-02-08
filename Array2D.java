package com.sunbeam;

public class Array2D {

	public static void main(String[] args) {
		//int[][] arr1 = new int [3][4];
		//int[] arr1[] = new int [3][4];
		//int arr1[][] = new int [3][4];
		  
	    //double[][] arr = new double[][] {{1.1,2.1,3.1},{4.1,4.2,4.3}};
		
		double[][] arr = {{1.1,2.1,3.1},{4.1,4.2,4.3}};
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			
		}
		System.out.println();
		//Array of arrays => Ragged array 
		int[][] rarr = new int[4][]; 
		rarr[0] = new int[1]; 
		rarr[1] = new int[2];
		rarr[2] = new int[3];
		rarr[3] = new int[4];
		int var = 1; 
		
		for (int i = 0; i < rarr.length; i++) {
			for (int j = 0; j < rarr[i].length; j++) {
				rarr[i][j] = var;
				var++; 
			}
			
		}
		for (int i = 0; i < rarr.length; i++) {
			for (int j = 0; j < rarr[i].length; j++) {
				 System.out.print(rarr[i][j] + "\t"); 
			}
			System.out.println();
			
		}
 	}

}
