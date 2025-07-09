/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentprogram;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Patel Heril
 */
public class StudentProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter number of students:");
        int count = input.nextInt();
        input.nextLine(); // consume leftover newline

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter name of student " + i + ":");
            String name = input.nextLine();

            System.out.println("Enter GPA:");
            double gpa = input.nextDouble();
            input.nextLine(); // consume newline

            Student student = new Student(i, name, gpa);
            students.add(student);
        }

        System.out.println("\nStudent List:");
        for (Student s : students) {
            System.out.println(s.getInfo());
        }
    }
}
