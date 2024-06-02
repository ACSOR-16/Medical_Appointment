public class Doctor {
    static int id = 0;
    private String name;
    private String speciality;

    Doctor() {
        System.out.println("We're building the doctor object");
    }

    Doctor(String doctorName, String speciality) {
        System.out.println("The assigned doctor's name is = " + doctorName);
        id++;
        this.name = doctorName;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void showId() {
        System.out.println("ID doctor: " + id);
    }
}
