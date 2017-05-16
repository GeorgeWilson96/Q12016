package Q12016;

/**
 * Created by wilsonator on 16/05/17.
 */
public class CarsCard extends Card {
    public CarsCard(String n, float a, float b, float c) {
        super(n, a, b, c);
        this.setType("Cars");
        categories[0] = ("TopSpeed");
        categories[1] = ("Acceleration");
        categories[2] = ("Cost");
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
