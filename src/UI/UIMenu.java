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

            Scanner scanner = new Scanner();
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

}
