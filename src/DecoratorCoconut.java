import java.util.List;

public class DecoratorCoconut extends Decorator {
    public DecoratorCoconut(Cocktail cocktail) {
        super(cocktail);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+1;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("coconut milk");
        return ingredients;
    }
}
