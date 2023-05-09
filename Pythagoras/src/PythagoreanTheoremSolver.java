// Написать программу, которая принимает значение катетов a и b, и выводит на экран значение гипотенузы с.
public class PythagoreanTheoremSolver {
    public static void main(String[] args) {
        double a = 2f;
        double b = 3f;
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза: " + c);
    }
}
