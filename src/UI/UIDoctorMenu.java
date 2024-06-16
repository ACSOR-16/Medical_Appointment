package UI;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu() {
        int response = 0;

        do {
            System.out.println("\n\n Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add available appointment");
            System.out.println("2. My scheduled appointment");
            System.out.println("3. Log out");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch (response) {
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while (response != 0);
    }

    private static void showAddAvailableAppointmentsMenu() {
        int response = 0;

        do {
            System.out.println("\nAdd Available Appointment");
            System.out.println("Select a Month");

            for (int i = 0; i < 3; i++) {
                int index = i + 1;
                System.out.println(index + "." + UIMenu.MONTHS[i]);
            }

            System.out.println("0. Return");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            if (response > 0 && response < 4) {
                int monthSelected = response;
                System.out.println(monthSelected + " " + UIMenu.MONTHS[monthSelected - 1]);
                System.out.println("insert the date available: [dd/mm/yyyy]");

                String dateSelected = scanner.nextLine();
                System.out.println("Your date is: " + dateSelected + "\n1. Correct \n2. Change date");

                int responseDate = Integer.valueOf(scanner.nextLine());
                if (responseDate == 2) continue;;

                int responseTime = 0;
                do {
                    System.out.println("Insert the time available fot date: " + dateSelected + " [16:00]");
                    String time = scanner.nextLine();

                    System.out.println("Your time is: " + time + "\n1. Correct \n2. Change time");
                    responseTime = Integer.valueOf(scanner.nextLine());
                } while (responseTime == 2);

            } else if (response == 0) {
                showDoctorMenu();
            }
        } while (response != 0);
    }

    private static void checkDoctorAvailableAppointment(Doctor doctor) {
        if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor)) {
            doctorsAvailableAppointments.add(doctor);
        }
    }
}