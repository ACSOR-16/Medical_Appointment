package UI;

import java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};

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
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct option");
            }
        } while (response != 0);
    }

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
