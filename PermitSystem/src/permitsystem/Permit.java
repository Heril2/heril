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
    private int id;
    private String description;
    private PermitCategory category;

    public Permit(int id, String description, PermitCategory category) {
        this.id = id;
        this.description = description;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public PermitCategory getCategory() {
        return category;
    }

    public String getInfo() {
        return "ID: " + id + ", Description: " + description + ", Category: " + category;
    }
}
