package com.bridgelabz;

import java.io.File;

public class FilrDeleteDemo {
    public static void main(String[] args) {
        File myfile = new File("data.txt");
        if (myfile.delete()) {
            System.out.println("File deleted :" + myfile.getName() + " Successful");
        } else {
            System.out.println("Failed to delete a file");
        }
    }
}
