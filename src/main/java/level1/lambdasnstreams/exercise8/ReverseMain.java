package level1.lambdasnstreams.exercise8;

public class ReverseMain {

    public static void main(String[] args) {

        String observe = "Supercalisto";
        Reverse reverse = (ofTheLaw) -> {
            String result = "";
            for (int i = ofTheLaw.length() - 1; i >= 0; i--) {
                result += ofTheLaw.charAt(i);
            }
            return result;
        };

        System.out.println(reverse.insideOut(observe));
    }
}
