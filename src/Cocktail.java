import java.util.List;

public abstract class Cocktail {
    public static String separator = "|";

    public abstract double getPrice();
    public abstract List<String> getIngredients();
}
