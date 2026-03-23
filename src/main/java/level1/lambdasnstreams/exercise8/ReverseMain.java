package level1.lambdasnstreams.exercise8;

public class ReverseMain {
    private static final String OBSERVE = "Calisto";

    public static void main(String[] args) {


        Reverse reverse = (text) -> {
            StringBuilder result = new StringBuilder();
            for (int i = text.length() - 1; i >= 0; i--) {
                result.append(text.charAt(i));
            }
            return result.toString();
        };

        System.out.println(reverse.reverse(OBSERVE));
    }
}
