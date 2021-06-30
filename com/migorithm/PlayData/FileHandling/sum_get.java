package com.migorithm.PlayData.FileHandling;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class sum_get {
    /*
    1.
    BufferedWriter -> 쓰고
    BufferedReader -> 읽어서  readline()으로 한줄씩 읽어서 split(":") -> 스코어 합을 구한다.
    2.
    스캐너로 읽어서 delimiter이용, 콜론기준으로 자른다.
     *
     *
     */
    public static void main(String[] args) {
        File f = new File("get_score.txt");
        try {
            write(f);
            //read(f);
            read_scanner(f);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void write(File file) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        String str="홍길동:90:80:70\n"
                + " 정길동:100:20:90\n"
                + " 이길동:70:60:50\n"
                + " 박길동:100:25:36\n"
                + " 지길동:90:70:60";
        writer.write(str);
        writer.close();
    }

    public static void read(File file) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(file));


        while (true) {
            String[] line = reader.readLine().split("\\:");
            String name = line[0];

            int sc1 = Integer.parseInt(line[1]);
            int sc2 = Integer.parseInt(line[2]);
            int sc3 = Integer.parseInt(line[3]);

            System.out.printf("이름 : %s \n총점 : %d\n",name, sc1+sc2+sc3);
            System.out.println();
            if (reader.read() == -1) {reader.close();break;}
        }


    }
    public static void read_scanner(File file) throws IOException{
        Scanner s1 = new Scanner(file);


        while (s1.hasNext()) {
            String[] line = s1.next().split(":");
            String name = line[0];
            int sum = 0;
            String [] copy = Arrays.copyOfRange(line, 1, 4);
            for(int i=0 ; i < copy.length;i++) {
                sum+= Integer.parseInt(copy[i]);
            }
            System.out.printf("이름 : %s \n총점 : %d\n",name, sum);
            System.out.println();
        }

    }}
