
import java.util.ArrayList;
import java.awt.Color;

public class TurtleRace {
	public static void main(String[] args) {
		RaceWindow w = new RaceWindow();
		ArrayList<RaceTurtle> runners = new ArrayList<RaceTurtle>();
		ArrayList<RaceTurtle> finished = new ArrayList<RaceTurtle>();
		for (int i = 0; i < 8; i++) {
			runners.add(new RaceTurtle(w, i + 1, Color.BLACK));
		}
		
		while(!runners.isEmpty()) {
			for (int i = 0; i < runners.size(); i++) {
				runners.get(i).raceStep();
				RaceWindow.delay(10);
				if (!(runners.get(i).getX() < RaceWindow.X_END_POS)) {
					finished.add(runners.get(i));
					runners.remove(i);
				}
			}
		}
		for (int i = 0; i < finished.size(); i++) {
			System.out.println("På plats " + (i + 1) +": " + finished.get(i).toString());
		}
		
	}

}
