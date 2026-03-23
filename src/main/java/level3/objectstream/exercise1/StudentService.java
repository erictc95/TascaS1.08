package level3.objectstream.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    private static final double PASS_SCORE = 5.0;
    private static final int ADULT_AGE = 18;

    public List<String> getNameAndAge(List<Student> studentList) {
        return studentList.stream()
                .map(data -> data.getName() + " - " + data.getAge())
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsStartWithA(List<Student> studentList) {
        return studentList.stream()
                .filter(data -> data.getName().startsWith("a"))
                .collect(Collectors.toList());
    }

    public List<Student> getApprovedStudents(List<Student> studentList) {
        return studentList.stream()
                .filter(data -> data.getScore() >= PASS_SCORE)
                .collect(Collectors.toList());
    }

    public List<Student> getNotPhpApprovedStudents(List<Student> studentList) {
        return studentList.stream()
                .filter(data -> data.getScore() >= PASS_SCORE &&
                        !data.getCourse().equals("PHP"))
                .collect(Collectors.toList());
    }

    public List<Student> getJavaAdultStudents(List<Student> studentList) {
        return studentList.stream()
                .filter(data -> data.getCourse().equals("JAVA") &&
                        data.getAge() >= ADULT_AGE)
                .collect(Collectors.toList());
    }
}
