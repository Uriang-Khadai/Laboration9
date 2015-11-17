
import java.util.Random;
import java.awt.Color;

public class AbsentMindedTurtle extends RaceTurtle {
	
	private Random rng = new Random();
	private int absent;
	
	public AbsentMindedTurtle(RaceWindow w, int nbr) {
		super(w, nbr, Color.RED);
		absent = rng.nextInt(100) + 1;
	}
	
	public void raceStep() {
		int rndnbr = rng.nextInt(100) + 1;
		if (rndnbr > absent) {
			super.raceStep();
		}
	}
	
	public String toString() {
		return super.toString() + " - AbsentMindedTurtle (" + absent + "% Frånvarande)";
	}
	

}
