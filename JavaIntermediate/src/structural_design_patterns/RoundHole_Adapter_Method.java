package structural_design_patterns;

public class RoundHole_Adapter_Method {
	private double radius;

    public RoundHole_Adapter_Method(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public boolean fits(RoundPeg_Adapter_Method peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}

