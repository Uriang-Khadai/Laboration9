
import java.util.Random;
import java.awt.Color;

public class RaceTurtle extends ColorTurtle {
	
	private int nbr;
	private static Random rng = new Random();
	
	/* Skapar en sköldpada som ska springa i fönstret w och som har start
	 * nummer nbr. Sköldpaddan startar med pennan nere och nosen vädn åt höger
	 */
	public RaceTurtle(RaceWindow w, int nbr, Color c) {
		super(w, RaceWindow.getStartXPos(nbr), RaceWindow.getStartYPos(nbr), c);
		this.nbr = nbr;
		super.penDown();
		super.left(270);
	}
	
	/* Låter sköldpaddan gå framåt ett steg. Stegets längd ges av 
	 * ett slumptal (heltal) mellan 1 & 6 
	 * */
	public void raceStep() {
		super.forward(rng.nextInt(6) +1);
	}
	
	public String toString() {
		return "Nummer " + this.nbr;
	}

}
