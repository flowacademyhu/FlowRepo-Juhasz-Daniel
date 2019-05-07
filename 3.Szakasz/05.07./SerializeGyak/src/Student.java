import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private String birthDate;
    private double average;

    public Student(String name, String birthDate, double average) {
        this.name = name;
        this.birthDate = birthDate;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", average=" + average +
                '}';
    }
}
