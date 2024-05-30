package com.pluralsight;
import java.util.ArrayList;

enum ChipSize {
    SMALL, MEDIUM, LARGE
}
public class Chips {

    private ChipSize size;

    public double calculateChipPrice() {
        double baseChipPrice = 1.50;

        // Calculate price based on size
        switch (size) {
            case SMALL:
                return baseChipPrice;
            case MEDIUM:
                return baseChipPrice;
            case LARGE:
                return baseChipPrice;
            default:
                return baseChipPrice;
        }
    }

    public ChipSize getSize() {
        return this.size;
    }

    public void setSize(ChipSize size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("\nChip Order Summary:");
        output.append("\nSize: " + getSize());
        output.append("Total Price: $" + calculateChipPrice());
        return output.toString();
    }
}


