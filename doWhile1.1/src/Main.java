public class Main {
    public static void main(String[] args) {
        int i = 1;
        int comp = 1;
        do {
            comp *=i;
            i++;

        } while (i <= 10);
        System.out.println(comp);
    }
}
