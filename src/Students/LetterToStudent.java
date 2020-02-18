package Students;

import Students.StudentGrade;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LetterToStudent {
    private List<StudentGrade> studentGrade = new ArrayList<>();
    private BufferedWriter writer = new BufferedWriter(new FileWriter("in.txt"));


    public LetterToStudent(List<StudentGrade> studentGrade) throws IOException {
        this.studentGrade = studentGrade;
    }

    public List<String> writeLetter(List<StudentGrade> studentGrade){
        this.studentGrade = studentGrade;
        List<String> letter = new ArrayList<>();
        for (StudentGrade student: studentGrade) {
            if(student.getGrade() > 5 ){

                letter.add("Dear " + student.getName() + " you have" + " passed " + "the exam for discipline " + student.getDiscipline() + " with "  + student.getGrade() + '\n');
            }else{

                letter.add("Dear " + student.getName() + " you have" + " failed " + "the exam for discipline " + student.getDiscipline() + '\n');

            }

        }
        return letter;
    }

}
