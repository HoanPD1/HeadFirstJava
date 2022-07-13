import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StudentDAO {
    private static final String url = "D:\\student.txt";

    public void ReadFile() throws FileNotFoundException {

        FileInputStream fileInputStream = null;
        Scanner scanner = null;
        try {
            fileInputStream = new FileInputStream(url);
            scanner = new Scanner(fileInputStream);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } finally {
            System.out.println("Read file error");
            try {
                scanner.close();
                fileInputStream.close();
            } catch (IOException ex) {
                System.out.println("Read file error");
            }
        }
    }

    public void WriteFile(){

    }

}
