package com.sgtesting.iodemo;

import java.io.File;

public class CreateSubfolders1 {
    public static void main(String[] args) {
        // Specify the parent directory
        File parentDirectory = new File("/path/to/your/directory");

        // Check if the parent directory exists
        if (parentDirectory.exists() && parentDirectory.isDirectory()) {
            // Create 10 subfolders
            for (int i = 1; i <= 10; i++) {
                // Create a new subfolder name
                String subfolderName = "Subfolder_" + i;

                // Get the new subfolder path
                File subfolder = new File(parentDirectory, subfolderName);

                // Create the subfolder
                if (subfolder.mkdir()) {
                    System.out.println("Created subfolder: " + subfolderName);
                } else {
                    System.out.println("Failed to create subfolder: " + subfolderName);
                }
            }
        } else
        {
            System.out.println("Parent directory does not exist or is not a directory");
        }
    }
}