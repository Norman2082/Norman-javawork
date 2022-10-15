package structural_design_patterns;

public class SquarePeg_Adapter_Method {
	private double width;

    public SquarePeg_Adapter_Method(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}

