import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.assertThat;

public class CocktailTest {

    @Test
    public void shouldVerifyStandardCocktail() throws Exception {
        // Given
        Cocktail cocktail = new StandardCocktail();

        // then
        assertThat(cocktail.getPrice(), equalTo(1.0));
        assertThat(cocktail.getIngredients(), hasItem("ice cubes"));
        assertThat(cocktail.getIngredients().size(), equalTo(1));
    }

    @Test
    public void shouldVerifyPinaColada() throws Exception {
        // Given
        Cocktail cocktail = new StandardCocktail();

        // then
        assertThat(cocktail.getPrice(), equalTo(4.0));
        assertThat(cocktail.getIngredients(), hasItem("ice cubes"));
        assertThat(cocktail.getIngredients(), hasItem("rum"));
        assertThat(cocktail.getIngredients(), hasItem("coconut milk"));
        assertThat(cocktail.getIngredients(), hasItem("pineapple juice"));
        assertThat(cocktail.getIngredients().size(), equalTo(4));
    }

    @Test
    public void shouldVerifyTimsWeirdMix() throws Exception {
        // Given
        Cocktail cocktail = new StandardCocktail();

        // then
        assertThat(cocktail.getPrice(), equalTo(2.0));
        assertThat(cocktail.getIngredients(), hasItem("ice cubes"));
        assertThat(cocktail.getIngredients(), hasItem("coconut milk"));
        assertThat(cocktail.getIngredients(), hasItem("strawberry icecream"));
        assertThat(cocktail.getIngredients().size(), equalTo(3));
    }

}