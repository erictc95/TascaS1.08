package level2.manipulatefunctionaldata.exercise4;

import java.util.ArrayList;
import java.util.List;

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

        FilmService service = new FilmService();

        System.out.println(service.alphabeticalSort(films));
        System.out.println(service.sortByContainsEFirst(films));
        System.out.println(service.changeAFor4(films));
        System.out.println(service.filterOnlyNumbers(films));
    }
}
