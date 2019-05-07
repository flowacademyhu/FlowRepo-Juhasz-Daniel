import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Lecture implements Serializable{

    List<Student> students = new ArrayList<>();

    Student student1 = new Student("Feri", "2020.30.30.", 0.13);
    Student student2 = new Student("Kata", "1700", 5.00);


    public List<Student> studentList() {
        students.add(student1);
        students.add(student2);
        return students;
    }

    public void save(List list) throws IOException {
        ObjectOutputStream dir = new ObjectOutputStream(new FileOutputStream("/home/dani/SequalizeGYak.txt"));
        dir.writeObject(list);
    }



}
