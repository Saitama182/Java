public class Second {
    public static void main(String[] args) {
        int sec = 90186;
        int day = sec / 86400;
        int hour  =  (sec % 86400) / 3600;
        int minute = ((sec % 86400) % 3600) / 60;
        int leftSec = sec - day * 86400 - hour * 3600 - minute * 60;
        System.out.println("Дней: "+ day );
        System.out.println("Часов: "+ hour );
        System.out.println("Минут: "+ minute);
        System.out.println("Секунд: "+ leftSec);
    }
}
