package clase_abstracte_si_interfete;

/**
 * Created by adrian on 02.01.2015.
 */
public class Pizza extends Product {
    public Pizza(String name, double price) {
        this.ingredients = new String[10];
        this.name = name;
        this.price = price;
        this.productType = 1;
    }

    @Override
    public double countPrice() {
        double tax = 0.1;
        return this.price = this.price+this.price*tax;
    }
}
