package file_io;

import java.io.*;

public class ObjectSerialization {

    public static void main(String[] args) {
        String filePath = "student.ser";
        Student student = new Student("Hieu", 24);

        //Write object to file
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(student);
            System.out.println("Write object successfully");
        } catch (IOException e) {
            System.out.println("Error when write object " + e.getMessage());
        }

        //Read object to file
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            Student readStudent = (Student) inputStream.readObject();
            readStudent.showInfo();
            System.out.println("Read object successfully");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error when read object " + e.getMessage());
        }
    }
}
