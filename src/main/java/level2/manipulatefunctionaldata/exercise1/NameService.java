package level2.manipulatefunctionaldata.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class NameService {
    public List<String> filterStringStartWithAAndLengthThree(List<String> propertyNames) {
        return propertyNames.stream().filter(word -> word.startsWith("A") && word.length() == 3).collect(Collectors.toList());
    }
}
