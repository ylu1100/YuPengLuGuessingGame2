package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		Scanner input = new Scanner(System.in);
		String str = "";
		while (str != "correct"){
			int x = 1;
			System.out.println("Is your number " + (min + max)/2);
			str = input.nextLine();
			if (str == "lower") {
				min = min*(50/x);
			}
			if (str == "higher") {
				max = (min + max) / 2;

			}
			x++;

		}
			System.out.println(" i knew it " + (min + max)/2);
		}
	}

