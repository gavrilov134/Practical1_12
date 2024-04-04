/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practical1_12;
import java.io.*;
import java.util.Scanner;

public class Practical1_12 {
    public static void main(String[] args) {
        System.out.println("Practical task 1.12, Student Evgeny Gavrilov, RIBO-01-22, Variant 3");
        Doctor doctor = new Doctor();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter doctor's name:");
        doctor.name = scanner.nextLine();

        System.out.println("Enter doctor's age:");
        doctor.age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter doctor's specialty:");
        doctor.specialty = scanner.nextLine();

        System.out.println("Enter doctor's hospital:");
        doctor.hospital = scanner.nextLine();

        System.out.println("Enter doctor's salary:");
        doctor.salary = scanner.nextDouble();

        try {
            FileOutputStream fileOut = new FileOutputStream("D:\\doctor.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(doctor);
            objectOut.close();
            System.out.println("Doctor object has been serialized and saved to D:\\doctor.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}