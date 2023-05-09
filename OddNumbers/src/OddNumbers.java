// Вывести все нечетные числа от 100 до 1000 которые без остатка делятся на 5
public class OddNumbers {
    public static void main(String[] args) {
        for (int i = 100; i<1000; i++) {
            if (i % 2 == 1 && i % 5 == 0 ) {
                System.out.println(i);
            }
        }
    }
}
