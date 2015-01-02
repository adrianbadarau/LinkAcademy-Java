package mostenirea_si_polimorfismul;

/**
 * Created by adrian on 02.01.2015.
 */
public class Circle extends Shape {
    static double PI = 3.14;
    int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }
    public double area(){
        double rez = 0;
        rez = Math.pow(this.radius,2)*PI;
        return rez;
    }
}
