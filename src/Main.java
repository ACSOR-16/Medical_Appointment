import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
//        showMenu();

        Doctor myDoctor = new Doctor("Jean Cris", "Cardiology");
        System.out.println(myDoctor.getName());
        System.out.println(myDoctor.getSpeciality());

        Patient patient = new Patient("Alejandro", "alejandro@gmail.com");
        patient.setHeight(178);
        patient.setWeight(72);
        patient.setPhoneNumber("985805050");
        System.out.println(patient.getHeight());
        System.out.println(patient.getWeight());
        System.out.println(patient.getPhoneNumber());
    }
}