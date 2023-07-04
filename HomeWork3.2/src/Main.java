public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.breed = "TaKca";
        dog1.nickname = "Jack";
        dog1.speed = 12;
        System.out.println( dog1.info());
        dog1.run();

    }
}
