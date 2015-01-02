package mostenirea_si_polimorfismul;

/**
 * Created by adrian on 02.01.2015.
 */
public class Square extends Shape {
    int lat;

    public Square(int x, int y, String color, int lat) {
        super(x, y, color);
        this.lat = lat;
    }
    public int area(){
        int rez = 0;
        rez = this.lat * this.lat;
        return rez;
    }
}
