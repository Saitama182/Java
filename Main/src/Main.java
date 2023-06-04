public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        Human human4 = new Human();
        Human human5 = new Human();

        human1.name = "Jonn";
        human1.age = 33;
        human1.weight = 90;
        human2.name = "Serj";
        human2.age = 22;
        human2.weight = 78;
        human3.name = "Andrei";
        human3.age = 14;
        human3.weight = 67;
        human4.name = "Max";
        human4.age = 19;
        human4.weight = 55;
        human5.name = "Alan";
        human5.age = 33;
        human5.weight = 88;

        double average = (human1.age + human2.age + human3.age + human4.age + human5.age) / 5;
        System.out.println("Средний возраст:  " + average);



    }
}
