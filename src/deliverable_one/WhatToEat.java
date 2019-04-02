package deliverable_one;

import java.util.Scanner;

/*
 * Project Name: What to Eat
 * 
 * Project Description: 
 * 		This program is to determine what to 
 * 		eat by user input their party size and type.
 * 
 * Author:  Linmei Mills
 * 
 * Date: April 01, 2019
 * 
 */

public class WhatToEat {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int evenType = 1;
		int partySize;
		String result;

		/*
		 * get the event type by letting user selects the options that displays on the
		 * main page. if the option that user entered is not in listed option, program
		 * loop back to main page until user input the correct value.
		 */
		do {
			System.out.println("Please select your event type as listed below: ");
			System.out.println("   1. Casual");
			System.out.println("   2. semi-formal");
			System.out.println("   3. formal");
			evenType = scnr.nextInt();
		} while (evenType < 1 || evenType > 3);

		// user inputs party size here
		System.out.println("Please enter how many attendences will be join the party: ");
		partySize = scnr.nextInt();

		// according to user's input, below is the suggestion we offers
		switch (evenType) {
		case 1:
			if (partySize == 1) {
				result = "Since you’re hosting a Casual event for " + partySize
						+ " participants, you should serve sandwiches in the microwave.";
				System.out.println(result);
			} else if (partySize >= 2 && partySize <= 12) {
				result = "Since you’re hosting a casual event for " + partySize
						+ " participants, you should serve sandwiches in your kitchen.";
				System.out.println(result);
			} else {
				result = "Since you’re hosting a casual event for " + partySize
						+ " participants, you should serve sandwiches by a caterer.";
				System.out.println(result);
			}
			break;

		case 2:
			if (partySize == 1) {
				result = "Since you’re hosting a semi-formal event for " + partySize
						+ " participants, you should serve fried chicken in the microwave.";
				System.out.println(result);
			} else if (partySize >= 2 && partySize <= 12) {
				result = "Since you’re hosting a semi-formal event for " + partySize
						+ " participants, you should serve fried chicken in your kitchen.";
				System.out.println(result);
			} else {
				result = "Since you’re hosting a semi-formal event for " + partySize
						+ " participants, you should serve fried chicken by a caterer.";
				System.out.println(result);
			}
			break;

		case 3:
			if (partySize == 1) {
				result = "Since you’re hosting a formal event for " + partySize
						+ " participants, you should serve chicken parmesan in the microwave.";
				System.out.println(result);
			} else if (partySize >= 2 && partySize <= 12) {
				result = "Since you’re hosting a formal event for " + partySize
						+ " participants, you should serve chicken parmesan in your kitchen.";
				System.out.println(result);
			} else {
				result = "Since you’re hosting a formal event for " + partySize
						+ " participants, you should serve chicken parmesan by a caterer.";
				System.out.println(result);
			}
			break;

		default:
			System.out.println("your enter is invalid");

		}
		scnr.close();
	}

}

