public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.age = 12;
        human1.weight = 67;
        human1.name = "Jonny";
        Human human2 = new Human();
        human2.age = 14;
        human2.weight =44;
        human2.name = "Martinez";
        Human human3 = new Human();
        human3.age = 13;
        human3.weight = 45;
        human3.name = "Shaw";
        Human human4 = new Human();
        human4.age = 22;
        human4.weight = 88;
        human4.name = "Luke";
        Human human5 = new Human();
        human5.age = 33;
        human5.weight = 112;
        human5.name = "Pogba";
        double middleAge = ((human1.age + human2.age + human3.age + human4.age + human5.age)/5);
        System.out.println(middleAge);


    }
}
