package com.bridgelabz;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {
        String data="101,Swapnil,Panvel,India";

        try{
            FileWriter output = new FileWriter("data.txt");
            output.write(data);
            System.out.println("Data is written successfully");
            output.close();
        }catch (IOException e){
            System.out.println("File Write error");
        }
    }
}
