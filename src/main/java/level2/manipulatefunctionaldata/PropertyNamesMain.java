package level2.manipulatefunctionaldata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PropertyNamesMain {
    public static void main(String[] args) {
        List<String> propertyNames = new ArrayList<>();

        propertyNames.add("auston Matthews");
        propertyNames.add("Nathan Mackinnon");
        propertyNames.add("Peter Bondra");
        propertyNames.add("Ale");
        propertyNames.add("And");
        propertyNames.add("Connor McDavid");

        System.out.println(filterStringStartWithAAndLengthThree(propertyNames));
    }

    public static List<String> filterStringStartWithAAndLengthThree(List<String> propertyNames) {
        return propertyNames.stream().filter(word -> word.startsWith("A") && word.length() == 3).collect(Collectors.toList());
    }
}

