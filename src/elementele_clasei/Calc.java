package elementele_clasei;

import java.util.Objects;

/**
 * Created by adrian on 02.01.2015.
 */
public class Calc {
    public static double area(Object shape){
        double rez =0;
        if (shape instanceof Circle){
            rez = Math.pow(((Circle) shape).r,2)*Math.PI;
        }else if (shape instanceof Rectangle){
            rez = ((Rectangle) shape).a * ((Rectangle) shape).b;
        }
        return rez;
    }
}
