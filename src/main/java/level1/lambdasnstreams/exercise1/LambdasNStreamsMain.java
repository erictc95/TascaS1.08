package level1.lambdasnstreams.exercise1;

import java.util.Arrays;
import java.util.List;

public class LambdasNStreamsMain {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Door",
                "RUBISH",
                "Technics",
                "PAPILLON",
                "Carpenter"
        );
        WordService service = new WordService();

        List<String> result = service.filterWordsWithO(words);
        System.out.println("Words with 'o': " + result);
    }


}
