import java.util.List;

public abstract class Decorator extends Cocktail {
    Cocktail cocktail;

    public Decorator(Cocktail cocktail) {
        this.cocktail = cocktail;
    }

    @Override
    public double getPrice() {
        return cocktail.getPrice();
    }

    @Override
    public List<String> getIngredients() {
        return cocktail.getIngredients();
    }
}
