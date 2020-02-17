package Students;

public class Student {
    private  String name;
    private  int grade;
    private  String discipline;

    Student(String name, int grade, String discipline){
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
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(String Grade){
        this.grade  = grade;
    }
    public void setDiscipline(String Discipline){
        this.discipline = discipline;
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
