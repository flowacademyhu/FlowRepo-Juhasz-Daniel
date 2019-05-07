import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException{

        Lecture lecture = new Lecture();

        List<Student> list = new ArrayList<>(lecture.studentList());

        lecture.save(list);

        ObjectInputStream dir = new ObjectInputStream(new FileInputStream("/home/dani/SequalizeGYak.txt"));

        List<Student> student1 = (ArrayList) dir.readObject();

        for (Student s:student1) {
            System.out.println(student1);
        }


    }
}
