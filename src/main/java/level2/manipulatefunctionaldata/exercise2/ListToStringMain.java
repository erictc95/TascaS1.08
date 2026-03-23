package level2.manipulatefunctionaldata.exercise2;

import java.util.ArrayList;
import java.util.List;

public class ListToStringMain {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(87);
        numbers.add(122);
        numbers.add(144);
        numbers.add(555);
        numbers.add(797);
        numbers.add(2026);

        NumberService service = new NumberService();
        System.out.println(service.listToString(numbers));
    }
}

