package level2.manipulatefunctionaldata.exercise4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NameStringMain {
    public static void main(String[] args) {
        List<String> films = new ArrayList<>();

        films.add("Now You See Me");
        films.add("The Mask");
        films.add("Toy Story");
        films.add("Psycho");
        films.add("007 James Bond: Die Another Day");
        films.add("Transformers");

        System.out.println(alphabeticalSort(films));
        System.out.println(sortByContainsEFirst(films));
        System.out.println(changeAFor4(films));
    }

    public static List<String> alphabeticalSort(List<String> films) {
        return films.stream().sorted(Comparator.comparing(film -> film.charAt(0))).collect(Collectors.toList());
    }

    public static List<String> sortByContainsEFirst(List<String> films) {
        return films.stream().sorted((a, b) -> {
            boolean aContains = a.toLowerCase().contains("e");
            boolean bContains = b.toLowerCase().contains("e");

            if (aContains && !bContains) return -1;
            if (!aContains && bContains) return 1;
            return 0;
        }).toList();
    }

    public static List<String> changeAFor4(List<String> films) {
        return films.stream().map(film -> film.replace('a', '4')).toList();
    }
}
