package level1.lambdasnstreams.exercise6;

import java.util.ArrayList;
import java.util.List;


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