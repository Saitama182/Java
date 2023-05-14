/* Написать программу, которая принимает строковую переменную с названием месяца. И если сесяц введен правильно,
то вывести на экран время года, к которому этот месяц относится, в противном случае вывести сообщение, что месяц не существует. */
public class Month {
    public static void main(String[] args) {
        String month = "Июль";
        switch (month) {
            case "Декабрь":
            case "Январь":
            case "Февраль":
                System.out.println("Зима");
                break;
            case "Март":
            case "Апрель":
            case "Май":
                System.out.println("Весна");
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                System.out.println("Лето");
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Несуществующее время года");
                break;

        }
    }
}
