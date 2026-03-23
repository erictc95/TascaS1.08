package level1.lambdasnstreams.exercise7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NameStringMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Mozzie");
        names.add("Neal Caffrey");
        names.add("Petter Burke");
        names.add("Alex");
        names.add("Elise");
        names.add("Mathieu Keller");

        StringService service = new StringService();
        List<String> result = service.sortString(names);

        System.out.println(result);
    }


}