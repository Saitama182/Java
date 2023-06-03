public class MyMoney {
    public static void main(String[] args) {
        int money = 500;
        if (money >= 500 ) {
            System.out.println("Пицца");
        } else if (money >= 300 && money <  500) {
            System.out.println("Шаурма");
        } else if (money >= 100 && money <  300) {
            System.out.println("Гамбургер");
        }  else if (money < 100 ) {
            System.out.println("Доширак");
        }
    }
}
