// Написать программу , которая советует вам, что купить в зависимости от количества денег в вашем кармане. Например: если у вас больше 500 рублей,
// то программа выводит Пицца , если меньше 100 рублей , то Доширак.

public class Purchase {
    public static void main(String[] args) {
        int money = 140;
        if ( money > 500 ) {
            System.out.println("Пицца");
        } else if (money < 100) {
            System.out.println("Доширак");
        } else {
            System.out.println("Шаурма");
        }
    }
}
