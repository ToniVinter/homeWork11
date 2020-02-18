package Students;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ReadStudents reader = new ReadStudents();
        List<StudentGrade> students = reader.readFile("grades.txt");
        ClassRoom classRoom = new ClassRoom(students);
//        System.out.println(classRoom.getDiscipline());
//        System.out.println(classRoom.getPicaj());
        LetterToStudent letter = new LetterToStudent(students);
        System.out.println(letter.writeLetter(students));
    }
}
