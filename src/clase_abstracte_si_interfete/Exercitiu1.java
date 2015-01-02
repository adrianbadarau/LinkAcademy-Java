package clase_abstracte_si_interfete;

/**
 * Created by adrian on 02.01.2015.
 */
public class Exercitiu1 {
    public static void main(String[] args){
        Pizza p = new Pizza("PF",25);
        p.addIngredients("Prosciuto","Funghy","Motarella");
        System.out.println(p);
        Sandwich s = new Sandwich("Submarine", 15);
        s.addIngredients("Salamy","Bread","Chease","Tomatoes");
        System.out.println(s);
    }
}
