package level3.objectstream.exercise1;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private final StudentService service = new StudentService();

    @Test
    void shouldReturnApprovedStudents() {
        List<Student> students = List.of(
                new Student("Ana", 20, "JAVA", 6.0),
                new Student("Luis", 20, "JAVA", 4.0)
        );

        List<Student> result = service.getApprovedStudents(students);

        assertEquals(1, result.size());
        assertEquals("Ana", result.get(0).getName());
    }

    @Test
    void shouldReturnStudentsStartingWithA() {
        List<Student> students = List.of(
                new Student("ana", 20, "JAVA", 6.0),
                new Student("Luis", 20, "JAVA", 7.0),
                new Student("alberto", 22, "PHP", 8.0)
        );

        List<Student> result = service.getStudentsStartWithA(students);

        assertEquals(2, result.size());
        assertTrue(result.stream().allMatch(s -> s.getName().startsWith("a")));
    }

    @Test
    void shouldReturnJavaAdultStudents() {
        List<Student> students = List.of(
                new Student("Ana", 20, "JAVA", 6.0),
                new Student("Luis", 17, "JAVA", 7.0),
                new Student("Carlos", 25, "PHP", 8.0)
        );

        List<Student> result = service.getJavaAdultStudents(students);

        assertEquals(1, result.size());
        assertEquals("Ana", result.get(0).getName());
    }
}
