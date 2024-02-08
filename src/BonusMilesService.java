public class BonusMilesService {
    public int calculate(int price) {
        int miles=price / 20;
        System.out.println("Бонус"+ miles);
        return (price);
    }
}
