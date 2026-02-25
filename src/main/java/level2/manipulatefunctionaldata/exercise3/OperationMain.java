package level2.manipulatefunctionaldata.exercise3;

public class OperationMain {
    public static void main(String[] args) {
        Operation sum = (number1, number2) -> number1 + number2;
        System.out.println(sum.operation(5, 20));
        Operation subtraction = (number1, number2) -> number1 - number2;
        System.out.println(subtraction.operation(34, 12));
        Operation multiplication = (number1, number2) -> number1 * number2;
        System.out.println(multiplication.operation(4,80));
        Operation division = (number1, number2) -> number1 / number2;
        System.out.println(division.operation(10,2));
    }
}
