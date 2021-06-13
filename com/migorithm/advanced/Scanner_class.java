package com.migorithm.advanced;

import java.time.LocalDate;
import java.util.Scanner;

public class Scanner_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what's you name?");
        String first_input = scanner.nextLine();

        System.out.println("How old are you?");
        int second_input = scanner.nextInt();
        // 15 -> 5년뒤에 오세요
        // 20 이상 -> 환영합니다.
        // 7살 -> 13년뒤에 오세요.
        int year = LocalDate.now().minusYears(second_input).getYear();
        if (second_input >=20){
            System.out.println("환영합니다! " + first_input + "님!");
        }
        else {

            System.out.println("You can come in here " + (20-second_input) +" years later.");
            System.out.println("You were born in " + year);
        }}
}
