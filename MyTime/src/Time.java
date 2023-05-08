public class Time {
    public static void main(String[] args) {
        int seconds = 94162;
        int secondInMinutes = 60;
        int secondInHours = secondInMinutes * 60;
        int secondInDay = secondInHours * 24;
        int days = seconds / secondInDay;
        int hours = (seconds % secondInDay) / secondInHours;
        int minutes = ((seconds % secondInDay) % secondInHours) / secondInMinutes;
        int leftSeconds = seconds - days * secondInDay - hours * secondInHours - minutes *secondInMinutes;
        System.out.println("Суток: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
        System.out.println("Секунд: "+ leftSeconds);



    }
}
