package com.migorithm.PlayData.FileHandling;

import java.io.*;
import java.util.*;
public class Object_file {
    public static void main(String[] args) {

        File Object_file = new File("com\\migorithm\\PlayData\\FileHandling\\pr3.txt");
        try{
            pickle(Object_file);
            unpickle(Object_file);
        }catch(IOException  | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
    public static void pickle(File f) throws IOException{
        Random p1 = new Random("Migo",31);
        Random p2 = new Random("승민",30);
        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(f)); //파일에 넣고 싶으므로.
        obj.writeObject(p1);
        obj.writeObject(p2);
        obj.close();



    }
    public static void unpickle(File f) throws IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream(f));
        Random p1 = (Random) obj.readObject();
        Random p2 = (Random) obj.readObject();
        ArrayList info1 = p1.info();
        ArrayList info2 = p2.info();
        info1.forEach(System.out::println);
        info2.forEach(System.out::println);
        obj.close();


    }

}
