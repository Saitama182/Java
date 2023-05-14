/* Написать программу, которая принимает номер месяца и выводит его название на экран, если такого месяца нет, то
вывести надпись Месяц не существует
*/
public class Month {
    public static void main(String[] args) {
        int numberOfMonth = 12;
        if (numberOfMonth == 1 ){
            System.out.println("Январь");
        } else  if (numberOfMonth == 2 ) {
            System.out.println("Февраль");
        } else  if (numberOfMonth == 3 ) {
            System.out.println("Март");
        } else  if (numberOfMonth == 4 ) {
            System.out.println("Апрель ");
        } else  if (numberOfMonth == 5 ) {
            System.out.println("Май");
        } else  if (numberOfMonth == 6 ) {
            System.out.println("Июнь ");
        } else  if (numberOfMonth == 7 ) {
            System.out.println("Июль ");
        } else  if (numberOfMonth == 8 ) {
            System.out.println("Август");
        } else  if (numberOfMonth == 9 ) {
            System.out.println("Сентябрь");
        } else  if (numberOfMonth == 10 ) {
            System.out.println("Октябрь ");
        } else  if (numberOfMonth == 11 ) {
            System.out.println("Ноябрь ");
        } else  if (numberOfMonth == 12 ) {
            System.out.println("Декабрь");
        } else
            System.out.println("Месяц не существует");
    }

    }

