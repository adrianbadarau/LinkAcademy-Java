package clase_abstracte_si_interfete;

/**
 * Created by adrian on 02.01.2015.
 */
abstract class Patrulater {
    int x,y,a;
    public abstract void setxya(int x, int y, int a);
    
}
class Patrat extends Patrulater implements IGeom {
    @Override
    public double area() {
        return this.a * this.a;
    }

    @Override
    public double volume() {
        return 4 * this.a;
    }

    @Override
    public void setxya(int x, int y, int a) {
        this.a = a;
        this.y = y;
        this.x = x;
    }
}
public class Exercitiu2 {
    public static void main(String[] args){
        Patrat x = new Patrat();
        x.setxya(100,100,5);
        System.out.println(x.area());
        System.out.println(x.volume());

    }
}
