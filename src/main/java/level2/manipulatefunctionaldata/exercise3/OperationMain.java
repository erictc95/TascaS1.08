package level2.manipulatefunctionaldata.exercise3;

public class OperationMain {
    public static void main(String[] args) {
        Operation sum = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (a, b) -> a * b;
        Operation division = (a, b) -> a / b;

        execute(sum, 5, 20);
        execute(subtraction, 34, 12);
        execute(multiplication, 4, 80);
        execute(division, 10, 2);
    }

    private static void execute(Operation op, float a, float b) {
        System.out.println(op.operation(a, b));
    }
}
