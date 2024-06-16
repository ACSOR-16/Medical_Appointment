package UI;

import java.util.Scanner;

public class PatientMenu {
    public static void showPatientMenu() {
        int responseLog = 0;

        do {
            System.out.println("Patient \nWelcome: " + UIMenu.patientLogged);
            System.out.println("1. Book an appointment \n2. My appointments \n3. Log out");

            Scanner scanner = new Scanner(System.in);
            responseLog = Integer.valueOf(scanner.nextLine());

            switch (responseLog) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while (responseLog != 0);
    }

    private static void showBookAppointmentMenu() {
        int response = 0;

        do {
            System.out.println("Book an Appointment \n Select Date:");
        } while (response != 0);
    }
}
