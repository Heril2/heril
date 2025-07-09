/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permitsystem;

/**
 *
 * @author Patel Heril
 */
public class Permit {
    private String permitNumber;
    private PermitCategory category;

    public Permit(String permitNumber, PermitCategory category) {
        this.permitNumber = permitNumber;
        this.category = category;
    }

    public String getPermitNumber() {
        return permitNumber;
    }

    public PermitCategory getCategory() {
        return category;
    }

    public String getInfo() {
        return "Permit Number: " + permitNumber + ", Category: " + category;
    }
}