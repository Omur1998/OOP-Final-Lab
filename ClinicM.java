package com.mycompany.clinicm;

import java.util.*;
import java.util.Scanner;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Physician {
    private String physicianName;
    private String expertise;
    private String availableTime;

    public Physician(String physicianName, String expertise, String availableTime) {
        this.physicianName = physicianName;
        this.expertise = expertise;
        this.availableTime = availableTime;
    }

    public String getPhysicianName() {
        return physicianName;
    }

    public String getExpertise() {
        return expertise;
    }

    public String getAvailableTime() {
        return availableTime;
    }
    public void setAvailableTime(String availableTime) {
        this.availableTime = availableTime;
    }
    public abstract void showAvailability();
}
public class ClinicM {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        SessionManagement managementSystem = new SessionManagement();

        while (true) {
            System.out.println("\n Health Clinic Appointment System ");
            System.out.println("1. General Doctor");
           System.out.println("2. Specialist Doctor");
            System.out.println("3. Client");
         System.out.println("4. View Available Physicians");
           System.out.println("5. Book a Session");
           System.out.println("6. View All Sessions");
          System.out.println("7. Exit");
            System.out.print("Select an option: ");
            int option = inputScanner.nextInt();
            inputScanner.nextLine();  

            if (option == 1) {
                
                System.out.print("Enter General Doctor's Name: ");
                String doctorName = inputScanner.nextLine();
              System.out.print("Enter Availability: ");
                String doctorAvailability = inputScanner.nextLine();
                Physician generalDoctor = new GeneralDoctor(doctorName, doctorAvailability);
               managementSystem.registerPhysician(generalDoctor);
             System.out.println("General Doctor registered successfully!");
            } else if (option == 2) {
               
                System.out.print("Enter Specialist Doctor's Name: ");
                String specialistDoctorName = inputScanner.nextLine();
            System.out.print("Enter Expertise: ");
                String expertise = inputScanner.nextLine();
                System.out.print("Enter Availability: ");
                String specialistDoctorAvailability = inputScanner.nextLine();
                Physician specialistDoctor = new SpecialistDoctor(specialistDoctorName, expertise, specialistDoctorAvailability);
                managementSystem.registerPhysician(specialistDoctor);
                System.out.println("Specialist Doctor registered successfully!");
            } else if (option == 3) {
             
                System.out.print("Enter Client's Name: ");
                String clientName = inputScanner.nextLine();
                System.out.print("Enter Client's Contact Number: ");
                String clientContact = inputScanner.nextLine();
                Client client = new Client(clientName, clientContact);
                managementSystem.registerClient(client);
                System.out.println("Client registered successfully!");
            } else if (option == 4) {
             
                managementSystem.displayPhysicians();
            } else if (option == 5) {
          
                System.out.print("Enter Client's Name: ");
                String clientSessionName = inputScanner.nextLine();
                Client foundClient = null;
                for (Client c : managementSystem.getClientList()) {
                    if (c.getClientName().equals(clientSessionName)) {
                        foundClient = c;
                        break;
                    }
                }

                if (foundClient == null) {
                    System.out.println("Client not found! Please register the client first.");
                } else {
                    System.out.print("Enter Physician's Name: ");
                    String physicianSessionName = inputScanner.nextLine();
                    Physician foundPhysician = null;
                    for (Physician p : managementSystem.getPhysicianList()) {
                        if (p.getPhysicianName().equals(physicianSessionName)) {
                            foundPhysician = p;
                            break;
                        }
                    }
                  if (foundPhysician == null) {
                        System.out.println("Physician not found!");
                    } else {
                        System.out.print("Enter Session Date (e.g., 2024-09-15): ");
                        String sessionDate = inputScanner.nextLine();
                        managementSystem.bookSession(foundClient, foundPhysician, sessionDate);
                    }
                }
            } else if (option == 6) {
          
                managementSystem.displaySessions();
            } else if (option == 7) {
          
                System.out.println("Exiting...");
                inputScanner.close();
                return;
            } else {
                System.out.println("Invalid option! Please try again.");
           }
       }   }}

