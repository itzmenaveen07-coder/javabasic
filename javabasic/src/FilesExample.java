import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesExample {

    public static void createFile() throws IOException {

        File myfile = new File("java.txt");

        // create file
        if (myfile.createNewFile()) {
            System.out.println("File created: " + myfile.getName());
        } else {
            System.out.println("File already exists");
        }

        // write to SAME file
        try (FileWriter writer = new FileWriter(myfile)) {
            writer.write("hello this is java file");
        }

        // read from SAME file
        try (Scanner read = new Scanner(myfile)) {
            while (read.hasNextLine()) {
                System.out.println(read.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

}
