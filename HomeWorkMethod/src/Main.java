public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Jack";
        dog1.breed = "Takca";
        dog1.speed = 12;
        dog1.run();
        System.out.println(dog1.info());
    }
}
