package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        int a=7;
        int b=2;
        int firstMnozitel= 9*(a*a) - 5*b + 2 + a - 7;
        int secondMnozitel = a+b-4*a*b;
        double finalSecondMnozitel = secondMnozitel/2;
        double result = firstMnozitel*finalSecondMnozitel;

        System.out.println(result);
    }

}
