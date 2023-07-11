

public class Main {
    public static void main(String[] args) {
        Rect rect1 = new Rect();
        rect1.twoParametrs(11,2);
        System.out.println("Периметр равен " + rect1.perimeter());
        System.out.println("Площадь равна "+ rect1.square() );
        Rect rect2 = new Rect();
        rect2.twoParametrs(3,2);
        System.out.println("Периметр равен " + rect2.perimeter());
        System.out.println("Площадь равна "+ rect2.square() );

    }
}
