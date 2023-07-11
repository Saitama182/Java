public class Rect {
    double length;
    double width;

    void twoParametrs( double length, double width) {
        this.width = width;
        this.length = length;
    }
    double perimeter() {
        return 2* (width + length );
    }

    double square() {
        return  width * length;
    }

}
