public class TwentyPercent implements PenaltyCalculationStrategy{

    @Override
    public int calculatePenalty(int price) {
        return (price * 20)/100;
    }
}
