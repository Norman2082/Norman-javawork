package structural_design_patterns;


	public class SquarePegAdapter extends RoundPeg_Adapter_Method {
	    private SquarePeg_Adapter_Method peg;

	    public SquarePegAdapter(SquarePeg_Adapter_Method peg) {
	        this.peg = peg;
	    }

	    @Override
	    public double getRadius() {
	        double result;
	        // calculate a minimum circle radius, which can fit this peg
	        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
	        return result;
	    }

	}

