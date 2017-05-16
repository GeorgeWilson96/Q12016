package Q12016;

import java.util.ArrayList;

/**
 * Created by wilsonator on 16/05/17.
 */
public abstract class Card {
    private String Name;
    private String Type;
    ArrayList<String> categories = new ArrayList<String>;
    private float[] cats = float[3]
    public Card(String n, float a, float b, float c){
        Name = n;
        cats[0] = a;
        cats[1] = a;
        cats[2] = a;

    }
    protected void setType(String type){
        Type = type;
    }
    public float getCat1() {
        return cats[0];
    }

    public float getCat2() {
        return cats[1];
    }

    public float getCat3() {
        return cats[2];
    }

    public String getName() {
        return Name;
    }
    public float getCategory(String catName){
        int index = categories.indexOf(catName);
        if(index>=0){
            return cats[index];
        }
    }
}
