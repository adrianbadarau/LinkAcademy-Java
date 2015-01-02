package mostenirea_si_polimorfismul;

/**
 * Created by adrian on 02.01.2015.
 */
public class Main {
    public static void main(String[] args){
        Circle x = new Circle(15,12,"rosu",4);
        System.out.println(x.area());
        Rectangle y = new Rectangle(15,12,"rosu",4,7);
        System.out.println(y.area());

    }
}
