package Students;

public class Main {
    public static void main(String[] args) throws Exception {
        ReadStudents reader = new ReadStudents();
        System.out.println(reader.readFile("grades.txt"));
    }
}
