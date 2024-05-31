package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Checkout {

    //Creates receipt file and saves to folder
    public static void saveReceipt (Order order) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        LocalDateTime receiptDate = LocalDateTime.now();
        String finalDate = receiptDate.format(dtf);
        String directoryPath = "src/main/resources/Receipts/" + finalDate  + ".txt";

        try {

            FileWriter receiptWriter = new FileWriter(directoryPath);
            receiptWriter.write(order.toString());
            System.out.println("Order details saved to receipts");
            receiptWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while saving the order details.");
            e.printStackTrace();
        }

    }

    //Displays order to user for confirmation
    public static void displayOrder (Order order) {
        System.out.print(order.toString());
    }
}
