package level3.objectstream.exercise1;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("daniel", 19, "COPILOT", 9.0));
        studentList.add(new Student("carlota", 19, "JAVA", 9.5));
        studentList.add(new Student("carlos", 20, "PHP", 4.5));
        studentList.add(new Student("david", 16, "JAVA", 8.0));
        studentList.add(new Student("alberto", 17, "PHP", 4.0));
        studentList.add(new Student("angel", 24, "COPILOT", 8.5));
        studentList.add(new Student("ferran", 19, "JAVA", 9.0));
        studentList.add(new Student("dua Lipa", 17, "PHP", 4.0));
        studentList.add(new Student("estefania", 20, "COPILOT", 5.0));
        studentList.add(new Student("alona", 18, "JAVA", 8.0));

        StudentService service = new StudentService();

        System.out.println("Students + Age:");
        service.getNameAndAge(studentList).forEach(System.out::println);
        System.out.println("Students with a:");
        service.getStudentsStartWithA(studentList).forEach(System.out::println);
        System.out.println("Aproved Students:");
        service.getApprovedStudents(studentList).forEach(System.out::println);
        System.out.println("Not PHP Students:");
        service.getNotPhpApprovedStudents(studentList).forEach(System.out::println);
        System.out.println("JAVA +18 Students:");
        service.getJavaAdultStudents(studentList).forEach(System.out::println);
    }
}
