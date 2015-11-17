
import java.util.Random;
import java.awt.Color;

public class DizzyTurtle extends RaceTurtle {
	
	private int yrsel;
	private Random rng = new Random();
	
	public DizzyTurtle(RaceWindow w, int nbr) {
		super(w, nbr, Color.GREEN);
		this.yrsel = rng.nextInt(5) + 1;
	}
	
	public void raceStep() {
		switch (yrsel) {
		case 1: super.left(rng.nextInt(3) - 1);
			break;
		case 2: super.left(rng.nextInt(7) - 3);
			break;
		case 3: super.left(rng.nextInt(11) - 5);
			break;
		case 4: super.left(rng.nextInt(17) - 8);
			break;
		case 5: super.left(rng.nextInt(23) - 11);
		}
		super.raceStep();
		super.turnNorth();
		super.left(270);
	}
	
	public String toString() {
		return super.toString() + " - DizzyTurtle (Yrsel: " + yrsel +")";
	}

}
