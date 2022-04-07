package com.lockedme;

public class MenuOptions {

	public static void printWelcomeScreen(String appName, String developerName) {
		String companyInfo = String.format("*****************************************************\n\n"
				+ "----              WELCOME to %s.com.                ----\n\n" + "---- This application was developed by %s. ----\n\n"
				+ "*****************************************************\n", appName, developerName);
		String appFunction = "You can use this application to :-\n"
				+ "• Retrieve all the file names in the \"HOME\" folder.\n"
				+ "• Add, Delete or Search files in \"HOME\" folder.\n"
				+ "\n*** Please ensure to enter the correct filename while performing file operations. ***\n\n";
		System.out.println(companyInfo);

		System.out.println(appFunction);
	}

	public static void displayMainMenu() {
		String mainmenu = "\n*** MAIN MENU ***\n\n" + "****** Select any option number from below and press Enter ******\n\n"
				+ "1) Retrieve all files inside \"HOME\" folder\n" + "2) Display FILE MENU for File operations\n"
				+ "3) Exit Application\n";
		System.out.println(mainmenu);

	}

	public static void displayFileMenu() {
		String fileMenu = "\n*** FILE MENU ***\n\n" + "****** Select any option number from below and press Enter ******\n\n"
				+ "1) Add a file to \"HOME\" folder\n" + "2) Delete a file from \"HOME\" folder\n"
				+ "3) Search for a file from \"HOME\" folder\n" + "4) Back to MAIN MENU\n" + "5) Exit Application\n";

		System.out.println(fileMenu);
	}

}
