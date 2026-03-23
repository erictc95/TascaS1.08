package level1.lambdasnstreams.exercise4;

import java.util.List;

public class MonthService {
    public void printWithMethodReference(List<String> months) {
        //months.stream().forEach(System.out::println);
        months.forEach(System.out::println);
    }
}
