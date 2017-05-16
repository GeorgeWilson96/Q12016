package Q12016;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CarsCard carsCard = new CarsCard("Aston Martin");
        BikesCard bikesCard = new BikesCard("Generic Bike");
        carsCard.writeCard();
        bikesCard.writeCard();
        carsCard.compare(bikesCard,0);

    }
}
