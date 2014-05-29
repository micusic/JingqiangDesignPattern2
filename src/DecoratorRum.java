import java.util.List;

public class DecoratorRum extends Decorator {
    public DecoratorRum(Cocktail cocktail) {
        super(cocktail);
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("rum");
        return ingredients;
    }

    @Override
    public double getPrice() {
        return super.getPrice()+1;
    }
}
