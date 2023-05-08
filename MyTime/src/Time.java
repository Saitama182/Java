public class Time {
    public static void main(String[] args) {
        int seconds = 300000;
        int minutes = seconds / 60;
        int hours = seconds / 3600;
        int days = seconds / 86400;
        System.out.println("Секунд: "+ seconds);
        System.out.println("Минут: "+ minutes);
        System.out.println("Часов: "+ hours);
        System.out.println("Суток: " + days);



    }
}
