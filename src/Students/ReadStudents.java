package Students;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadStudents {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("grade.txt");
        List<Student> student = new ArrayList<>();
        Student studentTemp = new Student("Ana",10,"Mate");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter(" ");
        while(scanner.hasNextLine()){

            studentTemp.setName(scanner.next() + " " +scanner.next());
            studentTemp.setDiscipline(scanner.next());
            studentTemp.setGrade(scanner.next());
            System.out.println(studentTemp + "\n");

        }
    }
}
