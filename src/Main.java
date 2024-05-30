import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        showMenu();

        Doctor myDoctor = new Doctor("Jean Cris", "Cardiology");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandro", "alejandro@gmail.com");
        System.out.println(patient.name);
        System.out.println(patient.address);

        patient.weight = 70.85;
        patient.height = 178;
    }
}