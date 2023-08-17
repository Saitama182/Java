public class Parametrs {
    public static void main(String[] args) {
        Age ggg = new Age();
        ggg.myAge(12);
    }

    static class Age {
        int age;

        void myAge(int myAge) {
            age = myAge;
        }
    }
}
