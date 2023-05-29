package com.program.files;

public class Palindrome {
	public static void main(String args[]) {
		int num = 12345;

		int rev = 0, temp;

		while (num > 0) {
			rev=rev*10+num%10;
			num = num / 10;
		}
		if (num == rev)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}

}
