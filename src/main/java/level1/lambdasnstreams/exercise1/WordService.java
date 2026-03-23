package level1.lambdasnstreams.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class WordService {
    public List<String> filterWordsWithO(List<String> words) {
        return words.stream()
                .filter(word -> word.toLowerCase().contains("o"))
                .collect(Collectors.toList());
    }
}
