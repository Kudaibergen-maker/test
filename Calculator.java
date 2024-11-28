package com.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class    Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите : ");
        String input = sc.nextLine().trim();
        try {
            String result = calc(input);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Результат: " + e.getMessage());
        }
    }
public static String calc(String input) throws Exception {

    {
}
        String regex = ".*\\b([1-9]|10)\\s+[-+*/]\\s+([1-9]|10)\\b.*";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);
        if (!matcher.matches()) {
            throw new Exception("throws Exception");
        }
        String[] parts = input.split("\\s+");
        int num1 = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int num2 = Integer.parseInt(parts[2]);
        return switch (operator) {
            case "+" -> String.valueOf(num1 + num2);
            case "-" -> String.valueOf(num1 - num2);
            case "*" -> String.valueOf(num1 * num2);
            case "/" -> String.valueOf(num1 / num2);
            default -> throw new Exception("throws Exception");
        };
    }
}

