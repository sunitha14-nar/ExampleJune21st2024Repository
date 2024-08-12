package com.sgtesting.iodemo;

import java.io.File;

public class DeleteTxtFiles {
    public static void main(String[] args) {
        // Specify the directory where you want to delete .txt files
        File directory = new File("/path/to/your/directory");

        // Check if the directory exists
        if (directory.exists() && directory.isDirectory()) {
            // List all files in the directory
            File[] files = directory.listFiles();

            // Iterate over the files
            for (File file : files) {
                // Check if the file is a .txt file
                if (file.getName().endsWith(".txt")) {
                    // Delete the file
                    if (file.delete()) {
                        System.out.println("Deleted " + file.getName());
                    } else
                    {
                        System.out.println("Failed to delete " + file.getName());
                    }
                }
            }
        } else {
            System.out.println("Directory does not exist or is not a directory");
        }
    }
}