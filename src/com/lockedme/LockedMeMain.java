package com.lockedme;

public class LockedMeMain {

	public static void main(String[] args) {
		
		// Create "HOME" folder if not present in current folder structure
		FileOperations.createMainFolder("HOME");
		
		MenuOptions.printWelcomeScreen("LockedMe", "KEERTHANA BANDARI");
		
		HandleOptions.handleWelcomeScreen();
	}

	
}
