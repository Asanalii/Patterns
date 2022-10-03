public class NoPenalty implements PenaltyCalculationStrategy{

    @Override
    public int calculatePenalty(int price) {
        return price;
    }
}
