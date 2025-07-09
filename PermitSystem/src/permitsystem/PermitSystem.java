/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package permitsystem;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Patel Heril
 */
public class PermitSystem {

    public static boolean isValidPermitNumber(String permitNumber) {
        return permitNumber.matches("P-[0-9]{4}");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String permitNumber;

        while (true) {
            System.out.println("Enter permit number (format P-1234):");
            permitNumber = input.nextLine();

            if (isValidPermitNumber(permitNumber)) {
                break;
            } else {
                System.out.println("Invalid format. Please try again.");
            }
        }

        System.out.println("Select a permit category:");
        for (PermitCategory cat : PermitCategory.values()) {
            System.out.println("- " + cat);
        }

        PermitCategory selectedCategory = null;
        while (selectedCategory == null) {
            System.out.println("Enter category name exactly as listed:");
            String userInput = input.nextLine().toUpperCase();
            try {
                selectedCategory = PermitCategory.valueOf(userInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid category. Try again.");
            }
        }

        Permit permit = new Permit(permitNumber, selectedCategory);
        System.out.println("Permit successfully created:");
        System.out.println(permit.getInfo());
    }
}
