public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    Doctor() {
        System.out.println("We're building the doctor object");
        id++;
    }

    Doctor(String doctorName) {
        System.out.println("The assigned doctor's name is = " + doctorName);
    }

    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID doctor: " + id);
    }
}
