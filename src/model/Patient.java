package model;

public class Patient extends User{
    private String birthday;
    private double weight;
    private double height;
    private String blood;

//    CONSTRUCTOR METHOD
    Patient(String name, String email){
        super(name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return weight + "kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + "cm.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge:" + getBirthday() + "\nWeight: " + getWeight() +
                "\nHeight: " + getHeight() + "\nBlood: " + getBlood();
    }
}
