package UI;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
//          Map - dates numeration
//          Index - date selected
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments =
                        UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + "" + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));

                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }

            Scanner scanner = new Scanner(Integer.valueOf(System.in));
            
        } while (response != 0);
    }
}
