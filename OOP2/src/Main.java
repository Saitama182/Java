/* Создать класс Человек, в котором будет 3 поля: имя,возраст и вес
* В классе Майн создать 3 экземпляра класса Человек, присвоить значения их полям и вывести на экран их средний возраст.*/
public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        human1.name = "Женя";
        human1.age = 33;
        human1.weight = 93.8;
        human2.name = "Андрей";
        human2.age = 33;
        human2.weight = 77.8;
        human3.name = "Сергей";
        human3.age = 32;
        human3.weight = 83.8;
        double average = (human1.age + human2.age + human3.age) / 3;
        System.out.println("Имя: " + human1.name + "\nИмя: " + human2.name + "\nИмя: " + human3.name + "\nСредний возраст: " + average );

    }
}
