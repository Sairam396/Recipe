package sairam.com.recipes;

public class IngredientsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipe.ingredients[index].split("`");
    }
}
