package com.business.data;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		Interactions act = new Interactions();
		
		System.out.println("\n**************************************\n");
		System.out.println("\tWelcome to Company Lockers \n");
		System.out.println("\tDeveloper: Mahamed Ahmed \n");

		System.out.println("**************************************");
		
		act.createDir();
		act.mainContext();
		

	}

}
