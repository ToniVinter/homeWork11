package Students;

import java.util.Objects;

public class StudentGrade {
    private final  String name;
    private final  int grade;
    private final  String discipline;

    StudentGrade(String name, String discipline, int grade){
        this.name = name;
        this.grade = grade;
        this.discipline = discipline;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getDiscipline() {
        return discipline;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGrade student = (StudentGrade) o;
        return grade == student.grade &&
                Objects.equals(name, student.name) &&
                Objects.equals(discipline, student.discipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, discipline);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", discipline='" + discipline + '\'' +
                '}';
    }
}
