// Посчитать среднее арифметическое всех чисел от 0 до 100
public class ArithmeticMean {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;

        while (count <= 100) {
            sum += count;
            count++;
        }
        float res = sum / (float) count;
        System.out.println(res);
    }
}
