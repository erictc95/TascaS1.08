package level2.manipulatefunctionaldata.exercise4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmService {
    public List<String> alphabeticalSort(List<String> films) {
        return films.stream()
                .sorted(Comparator.comparing(film -> film.charAt(0)))
                .collect(Collectors.toList());
    }

    public List<String> sortByContainsEFirst(List<String> films) {
        return films.stream().sorted((a, b) -> {
            boolean aContains = a.toLowerCase().contains("e");
            boolean bContains = b.toLowerCase().contains("e");

            if (aContains && !bContains) return -1;
            if (!aContains && bContains) return 1;
            return 0;
        }).toList();
    }

    public List<String> changeAFor4(List<String> films) {
        return films.stream()
                .map(film -> film.replace('a', '4'))
                .toList();
    }

    public List<String> filterOnlyNumbers(List<String> films) {
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
