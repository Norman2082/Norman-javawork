package structural_design_patterns;

public class Demo_Adapter_Method {
	public static void main(String[] args) {

        // round fits round, of course
        RoundHole_Adapter_Method hole = new RoundHole_Adapter_Method(5);
        RoundPeg_Adapter_Method rpeg = new RoundPeg_Adapter_Method(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg_Adapter_Method smallSqPeg = new SquarePeg_Adapter_Method(2);
        SquarePeg_Adapter_Method largeSqPeg = new SquarePeg_Adapter_Method(20);
        // hole.fits(smallSqPeg); // won't compile

        // adapter solves the problem
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }

        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }

    }

}

