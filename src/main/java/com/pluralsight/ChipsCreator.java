package com.pluralsight;

import java.util.Scanner;

public class ChipsCreator {

    public static void createChips (Order order) {

        Scanner scanner = new Scanner(System.in);

        // Choose chip size
        System.out.println("Choose the chip size: (1. Small, 2. Medium, 3. Large)");
        int chipSizeChoice = scanner.nextInt();
        ChipSize chipSize = ChipSize.values()[chipSizeChoice - 1];

        // Create the chips
        Chips chip = new Chips();
        chip.setSize(chipSize);

        chip.toString();
        order.getCompletedChips().add(chip);
    }
}
