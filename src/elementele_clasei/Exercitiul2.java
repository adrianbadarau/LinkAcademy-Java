package elementele_clasei;

/**
 * Created by adrian on 02.01.2015.
 */
public class Exercitiul2 {
    public static void main(String[] args){
        Circle circ = new Circle(4);
        Rectangle rectangle = new Rectangle(2,3);

        System.out.println(Calc.area(circ));
        System.out.println(Calc.area(rectangle));
    }
}
