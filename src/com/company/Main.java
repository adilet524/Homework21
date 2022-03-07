package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                DaysOfWeek[] daysOfWeek = DaysOfWeek.values();
                String nameOfdays = scanner.nextLine();

                for (int i = 0; i < daysOfWeek.length; i++) {
                    System.out.println(DaysOfWeek.valueOf(nameOfdays.toUpperCase(Locale.ROOT)).getDays());
                    break;
                }
            } catch (Exception e) {
                System.out.println("Write right value!");
            }
        }
    }
}