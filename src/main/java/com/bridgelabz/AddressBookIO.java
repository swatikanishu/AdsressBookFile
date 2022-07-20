package com.bridgelabz;
import java.io.*;
public class AddressBookIO {
    public static File address_book_file = new File("/home/lenovo/IdeaProjects/AddressBook/src/main/resources/AddressBook.txt");

    public static void createFile() {
        try {
            address_book_file.createNewFile();
            System.out.println("\nEmpty File is created successfully....");
        } catch (IOException e) {
            System.out.println("" + e);
        }
    }

    public static void add_details_to_file(String input) {
        try {
            FileOutputStream fOut = new FileOutputStream(address_book_file);
            byte[] b = input.getBytes();
            fOut.write(b);
            fOut.close();
            System.out.println("\ncontact added successfully...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void read_details_to_file() {
        try {
            String file = address_book_file.getAbsolutePath();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println("\n" + line);
            }
        } catch (IOException io) {
            System.err.println(io);
        }
    }

}
