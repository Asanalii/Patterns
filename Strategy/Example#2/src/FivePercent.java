public class FivePercent implements PenaltyCalculationStrategy{

    @Override
    public int calculatePenalty(int price) {
        return (price * 5 ) / 100;
    }
}
