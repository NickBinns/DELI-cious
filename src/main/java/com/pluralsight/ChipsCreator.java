package com.pluralsight;

import java.util.Scanner;

public class ChipsCreator {

    public static void createChips (Order order) {

        Scanner scanner = new Scanner(System.in);

        // Choose chip size
        System.out.println("""
                ----------------------
                Choose size of chips:
                1. Small
                2. Medium
                3. Large
                ----------------------
                """);
        System.out.print("Enter your choice: ");
        int chipSizeChoice = scanner.nextInt();
        ChipSize chipSize = ChipSize.values()[chipSizeChoice - 1];

        // Choose chip type
        System.out.println("""
                -----------------------
                Choose type of chips:
                1. Regular
                2. BBQ
                3. Sour Cream
                -----------------------
                """);
        System.out.print("Enter your choice: ");
        int chipTypeChoice = scanner.nextInt();
        ChipType chipType = ChipType.values()[chipTypeChoice - 1];

        // Create the chips
        Chips chip = new Chips();
        chip.setSize(chipSize);
        chip.setType(chipType);

        chip.toString();
        order.getCompletedChips().add(chip);
    }
}
