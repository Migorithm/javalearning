package com.migorithm.PlayData.FileHandling;
//문자단위 출력
import java.io.*;
import java.util.Scanner;

public class File_create {
    public static void file(File f) throws IOException{
        if(!f.exists()){f.createNewFile();}
        else{
            System.out.println("파일이 이미 있어요");
            Scanner c1 = new Scanner(System.in);
            System.out.println("파일에 입출력 하시겠습니까?");
            int s1 = c1.nextInt();
            if(s1 ==1){
                FileWriter writer = new FileWriter(f,true);
                writer.write("동해물과 백두산이 마르고 닳도록");
                writer.close();
            }

        }


    }
    public static void file_read(File f) throws IOException{
        FileReader reader = new FileReader(f);
        int ch = 0;
        while ((ch = reader.read()) != -1){
            System.out.printf("%c",(char) ch); //문자단위로 가져오기때문에 문제없이 가져올 수 있다.
        }

    }

    public static void main(String[] args) {
        File f = new File("com\\migorithm\\PlayData\\FileHandling\\pr.txt");
        try{
            file(f);
            file_read(f);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
