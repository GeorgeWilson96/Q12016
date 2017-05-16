package Q12016;

import java.util.ArrayList;

/**
 * Created by wilsonator on 16/05/17.
 */
public abstract class Card {
    private String Name;
    private String Type;
    ArrayList<String> categories = new ArrayList<String>();
    private ArrayList<Float> cats = new ArrayList<Float>();
    public Card(String n, float a, float b, float c){
        Name = n;
        cats.add(a);
        cats.add(b);
        cats.add(c);
    }
    public Card(String n){
        this(n,(float) Math.random(),(float) Math.random(),(float) Math.random());
    }
    protected void setType(String type){
        Type = type;
    }
    public float getCat1() {
        return cats.get(0);
    }
    public float getCat2() {
        return cats.get(1);
    }
    public float getCat3() {
        return cats.get(2);
    }
    public String getName() {
        return Name;
    }
    public float getCategory(String catName){
        int index = categories.indexOf(catName);
        if(index>=0){
            return cats.get(index);
        }
        return 0;
    }
    public void compare(Card card2,int categoryNo){
        Card card1 = this;
        if(card1.cats.get(categoryNo)>card2.cats.get(categoryNo)){
            System.out.println(card1.Name + " Wins");
        }else{
            System.out.println(card2.Name + " Wins");
        }
    }
    public void writeCard(){
        System.out.println("Name: " + Name);
        for(int i =0;i<cats.size();i++){
            System.out.println(categories.get(i) + ": " + cats.get(i));
        }
    }
}
