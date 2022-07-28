package com.bridgelabz;

import java.io.File;
import java.io.IOException;

public class CreatefileDemo {
    public static void main(String[] args) {
        File myfile = new File("data.txt");

        try{
            if(myfile.createNewFile()){
                System.out.println("File created successfully");
            }else{
                System.out.println("File creation error");
            }
        }catch (IOException e){
            System.out.println("File error");
        }

    }
}
