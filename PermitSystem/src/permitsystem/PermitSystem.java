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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Permit> permits = new ArrayList<>();

        System.out.println("How many permits do you want to enter?");
        int count = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter permit description:");
            String desc = input.nextLine();

            System.out.println("Choose category:");
            for (PermitCategory cat : PermitCategory.values()) {
                System.out.println("- " + cat);
            }

            String catInput = input.nextLine().toUpperCase();
            PermitCategory category = PermitCategory.valueOf(catInput);

            permits.add(new Permit(i, desc, category));
        }

        System.out.println("\nPermit List:");
        for (Permit p : permits) {
            System.out.println(p.getInfo());
        }
    }
}
