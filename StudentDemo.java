import java.io.*;

class Student implements Serializable {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        try {
            // Serialization
            Student s1 = new Student("pavan", 81);

            FileOutputStream fos = new FileOutputStream("student.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully");

            // Deserialization
            FileInputStream fis = new FileInputStream("student.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Student Name: " + s.name);
            System.out.println("Student ID: " + s.id);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
