package level1.exercise1.lambdasnstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasNStreamsMain {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Door");
        words.add("Papillon");
        words.add("Technics");
        words.add("Rubish");
        words.add("Carpenter");

        List<String> result = filterWordsWithO(words);
        System.out.println(result);
    }

    public static List<String> filterWordsWithO(List<String> words) {
        return words.stream().filter(word -> word.contains("o")).collect(Collectors.toList());
    }
}
