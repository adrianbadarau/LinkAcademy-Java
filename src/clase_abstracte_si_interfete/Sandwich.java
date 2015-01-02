package clase_abstracte_si_interfete;

/**
 * Created by adrian on 02.01.2015.
 */
public class Sandwich extends Product {
    public Sandwich(String name, int price) {
        this.name = name;
        this.price = price;
        this.ingredients = new String[10];
        this.productType = 2;
    }

    @Override
    public double countPrice() {
        double tax = 0.25;
        return this.price = this.price+this.price*tax;
    }
}
