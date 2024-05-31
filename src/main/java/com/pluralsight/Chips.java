package com.pluralsight;

enum ChipSize {
    SMALL, MEDIUM, LARGE
}

enum ChipType {
    REGULAR, BBQ, SOURCREAM
}
public class Chips {

    private ChipSize size;
    private ChipType type;

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

    public ChipType getType() {
        return this.type;
    }

    public void setType(ChipType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("\nChip Order Summary:");
        output.append("\nSize: " + getSize());
        output.append("\nType: " + getType());
        output.append("Total Price: $" + calculateChipPrice());
        return output.toString();
    }
}


