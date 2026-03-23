package level1.lambdasnstreams.exercise3;

import java.util.List;

public class MonthService {
    public void printWithLambda(List<String> months) {
        months.stream().forEach(month -> System.out.println(month));
        //Forma reducida de Lambda
        //months.forEach(System.out::println);
    }
}
