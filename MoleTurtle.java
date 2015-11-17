
import java.util.Random;
import java.awt.Color;

public class MoleTurtle extends RaceTurtle {
	
	private Random rng = new Random();
	
	public MoleTurtle(RaceWindow w, int nbr) {
		super(w, nbr, Color.BLUE);
	}
	
	public void raceStep() {
		int i = rng.nextInt(2) + 1;
		switch (i) {
		case 1: super.penDown();
				break;
		case 2: super.penUp();
		
		}
		super.raceStep();
	}
	
	public String toString() {
		return super.toString() + " - MoleTurtle";
	}

}
