package com.atmecs.automation.AutomateGoogle;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String s = sc.nextLine();

		StringBuilder str = new StringBuilder();

		int length = s.length();

		System.out.println(length);

		char[] arrayOfchar = s.toCharArray();

		for (int i = arrayOfchar.length - 1; i >= 0; i--) {

			try {
				char charecterInTheString = arrayOfchar[i];
				str.append(charecterInTheString);
			} catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println(ae.getMessage());
			}finally{
				sc.close();
			}

		}

		System.out.println("reverse ===> " + str);

	}

}
