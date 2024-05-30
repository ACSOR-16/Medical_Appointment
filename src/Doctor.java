public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    Doctor() {
        System.out.println("We're building the doctor object");
    }

    Doctor(String doctorName, String speciality) {
        System.out.println("The assigned doctor's name is = " + doctorName);
        id++;
        this.name = doctorName;
        this.speciality = speciality;
    }

    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID doctor: " + id);
    }
}
