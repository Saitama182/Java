public class Lesson20Static {
    public static void main(String[] args){
        Dog.number = 1111;
        Dog dog1 = new Dog();
        dog1.setName("Jack");
        dog1.setAge (12);
        dog1.seeResult();

    }
}