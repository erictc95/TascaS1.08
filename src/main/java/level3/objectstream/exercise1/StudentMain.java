package level3.objectstream.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {

    private static final double PASS_SCORE = 5.0;
    private static final int ADULT_AGE = 18;

    public static void main(String[] args) {
        Student student1 = new Student("daniel", 19, "COPILOT", 9.0);
        Student student2 = new Student("carlota", 19, "JAVA", 9.5);
        Student student3 = new Student("carlos", 20, "PHP", 4.5);
        Student student4 = new Student("david", 16, "JAVA", 8.0);
        Student student5 = new Student("alberto", 17, "PHP", 4.0);
        Student student6 = new Student("angel", 24, "COPILOT", 8.5);
        Student student7 = new Student("ferran", 19, "JAVA", 9.0);
        Student student8 = new Student("dua Lipa", 17, "PHP", 4.0);
        Student student9 = new Student("estefania", 20, "COPILOT", 5.0);
        Student student10 = new Student("alona", 18, "JAVA", 8.0);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);

        System.out.println("Students + Age:");
        showNameAgeStudent(studentList);
        System.out.println("Students with a:");
        showNamesStartWithA(studentList);
        System.out.println("Aproved Students:");
        showApprovedStudents(studentList);
        System.out.println("Not PHP Students:");
        showNotPhpApprovedStudents(studentList);
        System.out.println("JAVA +18 Students:");
        showJavaAdultStudents(studentList);



    }

    public static void showNameAgeStudent(List<Student> studentList) {
        studentList.stream().map(data -> data.getName() + " - " + data.getAge()).forEach(System.out::println);
    }

    public static void showNamesStartWithA(List<Student> studentList) {
        List<Student> studentsWithA = studentList.stream()
                .filter(student -> student.getName().startsWith("a")).collect(Collectors.toList());
        studentsWithA.forEach(System.out::println);
    }

    public static void showApprovedStudents(List<Student> studentList) {
        studentList.stream().filter(student -> student.getScore() >= PASS_SCORE).forEach(System.out::println);
    }

    public static void showNotPhpApprovedStudents(List<Student> studentList) {
        studentList.stream().filter(student -> student.getScore() >= PASS_SCORE && !student.getCourse().equals("PHP")).forEach(System.out::println);
    }

    public static void showJavaAdultStudents(List<Student> studentList) {
        studentList.stream().filter(student -> student.getCourse().equals("JAVA") && student.getAge() >= ADULT_AGE).forEach(System.out::println);
    }
}
