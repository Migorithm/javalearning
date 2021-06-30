package com.migorithm.PlayData.FileHandling;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class Byte_file {

    public static void byte_write(File f) throws IOException{
        FileOutputStream byte_output = new FileOutputStream(f,true);
        byte_output.write("동해물과 백두산이 마르고 닳도록".getBytes());
        byte_output.close();
    }

    public static void byte_read(File f) throws IOException{
        FileInputStream byte_input = new FileInputStream(f);
        int ch = 0;
        while((ch = byte_input.read()) != -1){
            System.out.printf("%c",ch);
        }
    }



    public static void main(String[] args) {
        File f = new File("com\\migorithm\\PlayData\\FileHandling\\pr2.txt");
        try{
            byte_write(f);
            byte_read(f);
        }catch(IOException e){
            e.printStackTrace();

        }

    }
}
