package Q12016;

/**
 * Created by wilsonator on 16/05/17.
 */
public class BikesCard extends Card {
    public BikesCard(String n) {
        super(n);
        this.setType("Bikes");
        categories.add("WheelSize");
        categories.add("Gears");
        categories.add("BellSound");
    }

    @Override
    public float getCat1() {
        return super.getCat1();
    }

    @Override
    public float getCat2() {
        return super.getCat2();
    }

    @Override
    public float getCat3() {
        return super.getCat3();
    }

}
