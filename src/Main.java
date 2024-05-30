import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        showMenu();

        Doctor myDoctor = new Doctor("Jean Cris", "Cardiology");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    }
}