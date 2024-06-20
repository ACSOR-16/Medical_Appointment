package UI;

import model.Doctor;
import model.Patient;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu() {
        System.out.println("Welcome to My Appointment");
        System.out.println("Select a desired option");

        int response = 0;

        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. exit");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf((scanner.nextLine()));

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    authenticationUser(1);
                    response = 0;
                    break;
                case 2:
                    System.out.println("Patient");
                    authenticationUser(2);
                    response = 0;
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct option");
            }
        } while (response != 0);
    }

    private static void authenticationUser(int usertype){

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Carlos","carlos@mail.com"));
        doctors.add(new Doctor("Jonas","Jonas@mail.com"));
        doctors.add(new Doctor("Jose","jose@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Jef","jef@mail.com"));
        patients.add(new Patient("Ursa","ursa@mail.com"));
        patients.add(new Patient("Axe","axe@mail.com"));

        boolean emailCorrect = false;

        do {
            System.out.println("insert your email.com [asd@email.com]");
            Scanner scanner = new Scanner(System.in);
            String email = scanner.nextLine();

            if (usertype == 1) {
                for (Doctor doctor: doctors) {
                    if (doctor.getEmail().equals(email)) {
                        emailCorrect = true;

                        doctorLogged = doctor;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            if (usertype == 2) {
                for (Patient patient: patients) {
                    if (patient.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = patient;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        } while (!emailCorrect);
    };

    public static void showPatientMenu() {
        System.out.println("we're building");
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointment");
            System.out.println("0. return");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch (response) {
                case 1:
                    System.out.println("BOOK AN APPOINTMENT");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("MY APPOINTMENTS");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }
}
