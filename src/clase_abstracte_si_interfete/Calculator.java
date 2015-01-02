package clase_abstracte_si_interfete;

/**
 * Created by adrian on 02.01.2015.
 */
public class Calculator implements Operanzi,Operatii {
    double a,b;
    @Override
    public void setOperands(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double add() {
        return this.a + this.b;
    }

    @Override
    public double substract() {
        return this.a -this.b;
    }
}
