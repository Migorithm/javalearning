package com.migorithm;  // package is to organize your classes together

public class Main { //all classes in java should start with uppercase

    public static void main(String[] args) {
        //whole numbers
        byte theByte =127;     //1byte      -128~127
        short theShort = 32_767;  //2bytes  -32768 ~ 32767  // underscore is to help you visualize the actual number.
        int theInt = 787_838_334; //4bytes  - 2147483648 ~ 2147483647
        long theLong = 787_878_787_878L; //8bytes - you have to put l or L at the end

        //
        float pi = 3.14F; // also need to put f or F, sufficient for storing 6~7 decimal digits
        double doublePi =  3.1415F; // for 15 digits
        boolean isAdult = false ;
        boolean isAdult2 = true;
        char nameInitial = 'A' ; // make sure its in single quote, not double quotes
        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println(theLong);
        System.out.println(pi);
        System.out.println(doublePi);
        System.out.println(isAdult);
        System.out.println(isAdult2);
        System.out.println(nameInitial);
    }
}

/* every single java program should have
1. public class

and

2. public static void main(String[] args) - main entry point to execute your program




*/