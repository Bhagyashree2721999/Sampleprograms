package com.program.files;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {
	public static void main(String args[]) {
		int intArray[] = new int[8];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Enter values in to Array");
			intArray[i] = sc.nextInt();

		}
		System.out.println(" Array representation");
		System.out.println(Arrays.toString(intArray));
		
		int value=1;
		for(int i=0;i<intArray.length;i++) {
		if(intArray[i]== value) {
			System.out.println("found value at index of "+i);
		}
        
	}
	}
}

	


