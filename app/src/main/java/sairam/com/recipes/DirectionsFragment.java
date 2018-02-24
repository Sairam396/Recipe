package sairam.com.recipes;

public class DirectionsFragment extends CheckBoxesFragment {
    
    @Override
    public String[] getContents(int index) {
        return Recipe.directions[index].split("`");
    }
}
