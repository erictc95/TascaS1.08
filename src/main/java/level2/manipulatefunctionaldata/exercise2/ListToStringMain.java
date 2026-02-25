package level2.manipulatefunctionaldata.exercise2;

import java.util.ArrayList;
import java.util.List;

public class ListToStringMain {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(87);
        numbers.add(122);
        numbers.add(144);
        numbers.add(555);
        numbers.add(797);
        numbers.add(2026);

        System.out.println(listToString(numbers));

    }

    public static String listToString(List<Integer> numbers) {
        String result = "";
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            String prefix;

            if (number % 2 == 0) {
                prefix = "e";
            } else {
                prefix = "o";
            }

            result += prefix + number;

            if (i < numbers.size() -1) {
                result += ", ";
            }
        }
        return result;
    }
}

