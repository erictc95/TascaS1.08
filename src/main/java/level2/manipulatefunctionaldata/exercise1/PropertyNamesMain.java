package level2.manipulatefunctionaldata.exercise1;

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

        NameService service = new NameService();
        System.out.println(service.filterStringStartWithAAndLengthThree(propertyNames));
    }


}

