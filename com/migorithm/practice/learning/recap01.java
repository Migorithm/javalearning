package com.migorithm.practice.learning;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class recap01 {
    public static void main(String[] args) {
        // Ternary operator
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String message = input.contains("이원석") ? "안녕" : "저리가";
        System.out.println(message);

    }}
