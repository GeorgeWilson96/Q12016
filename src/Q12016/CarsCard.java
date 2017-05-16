package Q12016;

/**
 * Created by wilsonator on 16/05/17.
 */
public class CarsCard extends Card {
    public CarsCard(String n) {
        super(n);
        System.out.print("D");
        this.setType("Cars");
        categories.add("TopSpeed");
        categories.add("Acceleration");
        categories.add("Cost");
    }
    public float getTopSpeed() {
        return super.getCat1();
    }
    public float getAcceleration() {
        return super.getCat2();
    }
    public float getCost() {
        return super.getCat3();
    }

}
