package file_io;

import java.io.*;

public class FileReadWrite {

    public static void main(String[] args) {

        String filePath = "output.text";
        String content = "This is content which was written into the file.\n The second lie.";

        //Write file
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Write file successfully");
        } catch (IOException e) {
            System.out.println("Error when write file " + e.getMessage());
        }

        //Read file
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("Read content from file");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(">> " + line);
            }
        } catch (IOException e) {
            System.out.println("Error when read file " + e.getMessage());
        }
    }
}
