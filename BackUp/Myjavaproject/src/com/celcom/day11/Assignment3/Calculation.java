package com.celcom.day11.Assignment3;

import java.util.Scanner;

public class Calculation {
    static void itemNumber(int num, double time, String name, String mode) {
        if (num == 1) {
            itemName(time, name, mode);
        } else if (num == 2) {
            itemName(time * 1.5, name, mode);
        } else if (num == 3) {
            itemName(time * 2, name, mode);
        } else {
            System.out.println("Invalid item count.");
        }
    }

    static void itemName(double time, String name, String mode) {
        if (name.equalsIgnoreCase("pasta")) {
            itemMode(time * 1.1, mode);
        } else if (name.equalsIgnoreCase("Frozen meal")) {
            itemMode(time * 1.2, mode);
        } else if (name.equalsIgnoreCase("Vegetables")) {
            itemMode(time, mode);
        } else {
            System.out.println("Invalid item name.");
        }
    }

    static void itemMode(double time, String mode) {
        double finalTime = time;

        if (mode.equalsIgnoreCase("high")) {
            finalTime = time;
        } else if (mode.equalsIgnoreCase("medium")) {
            finalTime = time * 0.9;
        } else if (mode.equalsIgnoreCase("low")) {
            finalTime = time * 1.15;
        } else {
            System.out.println("Invalid mode.");
            return;
        }

        System.out.printf("Cooking time: %.2f sec", finalTime);
    }


}
