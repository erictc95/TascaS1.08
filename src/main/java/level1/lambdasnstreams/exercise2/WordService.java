package level1.lambdasnstreams.exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class WordService {
    public List<String> filterWordsWithOAndMinLength(List<String> words) {
        return words.stream()
                .filter(word -> word.toLowerCase().contains("o") && word.length() > 5)
                .collect(Collectors.toList());
    }
}
