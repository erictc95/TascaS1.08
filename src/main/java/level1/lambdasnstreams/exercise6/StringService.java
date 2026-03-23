package level1.lambdasnstreams.exercise6;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringService {
    public List<String> sortString(List<String> names) {
        return names.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
    }
}
