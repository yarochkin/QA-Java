import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> grades1 = new ArrayList<>(List.of(4, 5, 4, 3));
        List<Integer> grades2 = new ArrayList<>(List.of(2, 3, 2, 2));
        List<Integer> grades3 = new ArrayList<>(List.of(5, 5, 5, 4));

        Student student1 = new Student("Иван", "111", 1, grades1);
        Student student2 = new Student("Петр", "111", 1, grades2);
        Student student3 = new Student("Анна", "112", 1, grades3);

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        List<Student> list = new ArrayList<>(students);
        for (int i = list.size() - 1; i >= 0; i--) {
            Student s = list.get(i);
            double avg = s.getAverageGrade();

            if (avg < 3.0) {
                list.remove(i);
            } else {
                s.course++;
            }
        }
        students = new HashSet<>(list);

        printStudents(students, 2);
    }

    public static void printStudents(Set<Student> students, int course) {
        for (Student s : students) {
            if (s.course == course) {
                System.out.println(s.name);
            }
        }
    }
}

