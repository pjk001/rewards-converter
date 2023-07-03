public class RewardValue {

    private double m_cash;
    private int m_miles;
    public RewardValue(double cash) {
        m_cash = cash;
    }

    public RewardValue(int miles) {
        m_miles = miles;
    }

    public double getCashValue() {
        return m_miles * 0.0035;
    }

    public double getMilesValue() {
        return m_cash / 0.0035;
    }
}
