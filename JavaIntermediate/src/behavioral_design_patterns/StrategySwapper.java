package behavioral_design_patterns;

public class StrategySwapper {

    private ConnectionStrategy strategy;

	public void setStrategy(ConnectionStrategy strategy) {
        this.strategy = strategy;
    }

    public void connect(String phoneName) {
        strategy.connectTo(phoneName);
    }
}
