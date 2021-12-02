public class BonusMilesService {
    public int price;

    public int calculate(int price) {
            this.price = price;
            int bonus = 20;
            int miles;
            miles = price / bonus;
        return miles;
    }
}


