package com.test.exception;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.io.*;

public class DataReader {
    public static void main(String[] args) {
        File file =new File("test.java");
//        boolean exists = file.exists();
//        System.out.println(exists);\

        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            while(bufferedReader.readLine()!=null)
            {
                System.out.println(bufferedReader.readLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
