import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        StudentDAO studentDAO = new StudentDAO();
        boolean exit = false;
        showMenu();
        while (true){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            switch (Integer.parseInt(s)){
                case 1 :
                    AddStudent(studentDAO);
                    break;
                case 2 :
                    EditStudent();
                    break;
                case 0 :
                    System.exit(0);
                    break;
            }
            showMenu();
        }

    }

    private static void showMenu() {
        System.out.println("/****************************************/");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. Exit.");
        System.out.println("/****************************************/");
    }

    private static void AddStudent(StudentDAO studentDAO) throws FileNotFoundException {
        studentDAO.ReadFile();
        System.out.println("AddStudent");


    }
    private static void EditStudent() {
        System.out.println("EditStudent");
    }
}
