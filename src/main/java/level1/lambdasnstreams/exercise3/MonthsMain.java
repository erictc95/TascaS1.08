package level1.lambdasnstreams.exercise3;

import java.util.ArrayList;
import java.util.List;

public class MonthsMain {

    public static void main(String[] args) {
        List<String> months = new ArrayList<>();

        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        printWithLambda(months);

    }

    public static void printWithLambda(List<String> months) {
        months.stream().forEach(month -> System.out.println(month));
    }
}


