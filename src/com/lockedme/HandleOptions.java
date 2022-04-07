package com.lockedme;

import java.util.List;
import java.util.Scanner;

public class HandleOptions {
	public static void handleWelcomeScreen() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuOptions.displayMainMenu();
				int option = sc.nextInt();

				switch (option) {
				case 1:
					FileOperations.displayAllFiles("HOME");
					break;
				case 2:
					HandleOptions.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreen();
			} 
		} while (running == true);
	}
	
	public static void handleFileMenuOptions() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuOptions.displayFileMenu();
				FileOperations.createMainFolder("HOME");
				
				int input = sc.nextInt();
				switch (input) {
				case 1:
					// File Add
					System.out.println("Enter the name of the file to be added to the \"HOME\" folder");
					String fileToAdd = sc.next();
					
					FileOperations.createFile(fileToAdd, sc);
					
					break;
					
				case 2:
					// File/Folder delete
					System.out.println("Enter the name of the file to be deleted from \"HOME\" folder");
					String fileToDelete = sc.next();
					
					FileOperations.createMainFolder("HOME");
					List<String> filesToDelete = FileOperations.displayFileLocations(fileToDelete, "HOME");
					
					String deletionPrompt = "\nSelect index of which file to delete?"
							+ "\n(Enter 0 if you want to delete the file)";
            			System.out.println(deletionPrompt);
				
					int idx = sc.nextInt();
					
					if (idx != 0) {
						FileOperations.deleteFileRecursively(filesToDelete.get(idx - 1));
      				} else {
						
						// If idx == 0, delete all files displayed for the name
						for (String path : filesToDelete) {
							FileOperations.deleteFileRecursively(path);
						}
					}
					

					break;
					
				case 3:
					// File/Folder Search
					System.out.println("Enter the name of the file to be searched from \"HOME\" folder");
					String fileName = sc.next();
					
					FileOperations.createMainFolder("HOME");
					FileOperations.displayFileLocations(fileName, "HOME");

					
					break;
					
				case 4:
					// Go to Previous menu
					return;
				case 5:
					
					// Exit
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFileMenuOptions();
			}
		} while (running == true);
	}
}
