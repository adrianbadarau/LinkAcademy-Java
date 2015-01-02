package clase_abstracte_si_interfete;

/**
 * Created by adrian on 02.01.2015.
 */
abstract class Product {
    int productType;
    String name;
    double price;
    String[] ingredients;
    public abstract double countPrice();
    
    public void addIngredients(String... ingredients){
        for (int i=0;i<ingredients.length;i++){
            this.ingredients[i]=ingredients[i];
        }        
    }
    public String allIngredients(){
        StringBuilder output = new StringBuilder();
        for(String ingredient : this.ingredients){
            if (ingredient!=null) output.append(ingredient+", ");
        }
        if(!output.toString().equals("")){
            if (output.toString().trim().endsWith(", ")) output.replace(output.length()-3,output.length(),"");
        }else {
            output.append("Fara adaosuri");
        }
        return output.toString();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Produs: ");
        output.append(this.name+", ");
        output.append("pret: "+countPrice()+" ,");
        output.append("ingrediente: "+allIngredients());
        return output.toString();
    }
}
