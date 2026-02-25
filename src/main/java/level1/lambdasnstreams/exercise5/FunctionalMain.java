package level1.lambdasnstreams.exercise5;

public class FunctionalMain {
    public static void main(String[] args) {
        PiValue pi = () -> 3.1415;
        System.out.println(pi.getPiValue());
    }
}
