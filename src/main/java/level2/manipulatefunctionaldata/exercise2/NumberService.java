package level2.manipulatefunctionaldata.exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class NumberService {
    public String listToString(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> {
                    String prefix;
                    if (number % 2 == 0) {
                        prefix = "e";
                    } else {
                        prefix = "o";
                    }
                    return prefix + number;
                })
                .collect(Collectors.joining(", "));
    }
}
