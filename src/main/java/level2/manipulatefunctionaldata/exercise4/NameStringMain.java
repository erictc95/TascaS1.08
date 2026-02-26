package level2.manipulatefunctionaldata.exercise4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NameStringMain {
    public static void main(String[] args) {
        List<String> films = new ArrayList<>();

        films.add("Now You See Me");
        films.add("294512921825");
        films.add("The Mask");
        films.add("Toy Story");
        films.add("Psycho");
        films.add("007 James Bond: Die Another Day");
        films.add("Transformers");
        films.add("2042");

        System.out.println(alphabeticalSort(films));
        System.out.println(sortByContainsEFirst(films));
        System.out.println(changeAFor4(films));
        System.out.println(filterOnlyNumbers(films));
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

    public static List<String> filterOnlyNumbers(List<String> films) {
        return films.stream().filter(film -> {
            if (film.isEmpty()) return false;

            for (int i = 0; i < film.length(); i++) {
                if(!Character.isDigit(film.charAt(i))) {
                    return false;
                }
            }
            return true;
        }).toList();
    }
}
