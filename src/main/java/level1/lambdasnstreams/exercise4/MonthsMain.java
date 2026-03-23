package level1.lambdasnstreams.exercise4;

import java.util.Arrays;
import java.util.List;

public class MonthsMain {

    public static void main(String[] args) {
        List<String> months = Arrays.asList(
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        );

        MonthService service = new MonthService();
        service.printWithMethodReference(months);

    }


}


