package level1.lambdasnstreams.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasNStreamsMain {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Door");
        words.add("RUBISH");
        words.add("Technics");
        words.add("PAPILLON");
        words.add("Carpenter");

        List<String> result = filterWordsWithO(words);
        System.out.println("Words with 'o': " + result);
    }

    public static List<String> filterWordsWithO(List<String> words) {
        return words.stream().filter(word -> word.toLowerCase().contains("o")).collect(Collectors.toList());
    }
}
