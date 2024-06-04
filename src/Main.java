import java.util.Date;

import static UI.UIMenu.*;

public class Main {

    public enum Day{
        MONDAY("Lunes"),
        TUESDAY("Martes"),
        WEDNESDAY("Miercoles"),
        THURSDAY("Jueves"),
        FRIDAY("Viernes"),
        SATURDAY("Sabado"),
        SUNDAY("Domingo");

        private String spanish;
        private Day(String day) {
            spanish = day;
        }

        public String getSpanish() {
            return spanish;
        }
    }

    public static void main(String[] args) {
//        showMenu();

        Doctor myDoctor = new Doctor("Jean Cris", "Cardiology");
        myDoctor.addAvailableAppointment(new Date(), "8:00 am");
        myDoctor.addAvailableAppointment(new Date(), "10:00 am");
        myDoctor.addAvailableAppointment(new Date(), "12:00 am");

        System.out.println(myDoctor.getAvailableAppointments());
        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        System.out.println(Day.FRIDAY.spanish);
        System.out.println(Day.SATURDAY.getSpanish());
        System.out.println(Day.SUNDAY);
        /*System.out.println(myDoctor.getName());
        System.out.println(myDoctor.getSpeciality());
        */
        Patient patient = new Patient("Alejandro", "alejandro@gmail.com");
        patient.setHeight(178);
        patient.setWeight(72);
        patient.setPhoneNumber("985805050");
        System.out.println(patient);
    }
}