package Students;

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadStudents {
    public List<StudentGrade> readFile(String fileLocation) throws Exception{
        List<StudentGrade> students = new ArrayList<StudentGrade>();
        Scanner scanner = new Scanner(new File(fileLocation));
        scanner.nextLine();
        while(scanner.hasNextLine()){
            StudentGrade studentGrade = fetchStudentGrade(scanner.nextLine());
            students.add(studentGrade);
        }
        return students;
    }

    private StudentGrade fetchStudentGrade(String line) {
        String[] tokens = line.split("\\|");
        return  new StudentGrade(tokens[0],tokens[1],Integer.parseInt(tokens[2]));
    }
}

