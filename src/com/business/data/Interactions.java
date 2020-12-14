package com.business.data;

import java.io.IOException;
import java.util.InputMismatchException;

public class Interactions extends LockersFeatures {

	// the top menu method
	public void mainContext() throws IOException {

		while (true) {

			try {
				System.out.println("1. Print the list of files\n" + "2. More options 	\n" + "3. Exit the programe\n");

				System.out.println("\nEnter your choice:\t");

				int options = sc.nextInt();

				for (int j = 1; j <= 3; j++) {

					if (options > 0 && options < 4) {
						switch (options) {
						case 1:
							showFiles();
							mainContext();
							break;
						case 2:
							detailMenu();
							break;
						case 3:
							System.exit(0);
							break;
						default:
							System.out.println("Invalid entry! Try again");
							mainContext();
						}
					} else {
						System.out.println("the input " + options + " is not in the option. Try again.");
						break;
					}
				}

			} catch (InputMismatchException e) {

				System.out.println(" Invalid input! Try again.");
				sc.nextLine();
			}

		}
	}

	public void detailMenu() throws IOException {

		while (true) {

			try {
				System.out.println("1. I wish to add a file\n" + "2. I wish to delete a file\n"
						+ "3. I wish to seach a file\n" + "4. Navigate back to the main context\n");

				System.out.println("\nEnter your choice:\t");

				int options = sc.nextInt();
				for (int j = 1; j <= 4; j++) {
					if (options > 0 && options < 5) {
						switch (options) {
						case 1:
							addFile();
							detailMenu();
							break;
						case 2:
							deleteFile();
							detailMenu();
							break;
						case 3:
							searchFile();
							detailMenu();
							break;
						case 4:
							mainContext();
							break;
						default:
							System.out.println("Invalid entry! Try again.");
							detailMenu();
						}

					} else {
						System.out.println("the input " + options + " is not in the option. Try again.");
						break;
					}
				}
			} catch (InputMismatchException e) {
				System.out.println(" Invalid input! Try again.");
				sc.nextLine();
			}

		}
	}
}
