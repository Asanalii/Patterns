public class TenPercent implements PenaltyCalculationStrategy{
    @Override
    public int calculatePenalty(int price) {
        return (price * 10) / 100;
    }
}
