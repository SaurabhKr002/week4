package queueinterface.hospitaltriagesystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HospitalTriage triage = new HospitalTriage();

        // Adding sample patients (Saurabh, Anand, Kuldeep)
        triage.addPatient("John", 3);
        triage.addPatient("Alice", 5);
        triage.addPatient("Bob", 2);

        System.out.println("Hospital Triage System:");

        // Processing patients in order of severity
        while (!triage.isEmpty()) {
            System.out.println("Treating: " + triage.treatPatient());
        }

        scanner.close();
    }
}

