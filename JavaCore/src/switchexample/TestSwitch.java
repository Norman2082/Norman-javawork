package switchexample;

public class TestSwitch {
	public static void main(String[] args) {
		
		String card="Holly";
		
		switch(card) {
		case "Club":
			System.out.println("you got a club");
			break;
		case "diamond":
			System.out.println("you got a diamond");
			break;
		case "spade":
			System.out.println("you got a spade");
			break;
		case "heart":
			System.out.println("you got a heart");
			break;
		default:
			System.out.println("not a valid card");
		
	}
}}
