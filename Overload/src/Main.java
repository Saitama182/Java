public class Main {
    public static void main(String[] args) {
        Monster m1 = new Monster();
        Monster m2 = new Monster(2);
        Monster m3 = new Monster(12,12);
        Monster m4 = new Monster(12,12,23);

        m1.voice();
        m2.voice(1);
        m3.voice(1, "Gav");
    }
}
