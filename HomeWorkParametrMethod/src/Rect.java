public class Rect {
    double width;
    double height;
    void meth1 (double width, double height) {
        this.width = width;
        this.height = height;

    }
    double perimeter() {
        return (width + height)*2;

    }
    double square () {
        return width * height;
    }
}
