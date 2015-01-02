package mostenirea_si_polimorfismul;

/**
 * Created by adrian on 02.01.2015.
 */
public class Rectangle extends Shape {
    int lat1;
    int lat2;

    public Rectangle(int x, int y, String color, int lat1, int lat2) {
        super(x, y, color);
        this.lat1 = lat1;
        this.lat2 = lat2;
    }
    public int area(){
        int rez = 0;
        rez = this.lat1*this.lat2;
        return rez;
    }
}
