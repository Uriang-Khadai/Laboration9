import java.util.ArrayList;
import java.util.Random;

public class MultiTurtleRace {
	public static void main(String[] args) {
		Random rng = new Random();
		RaceWindow w = new RaceWindow();
		ArrayList<RaceTurtle> runners = new ArrayList<RaceTurtle>();
		ArrayList<RaceTurtle> finished = new ArrayList<RaceTurtle>();
		for (int i = 0; i < 8; i++) {
			int turtleType = rng.nextInt(3) + 1;
			switch (turtleType) {
			case 1: runners.add(new MoleTurtle(w, i + 1));
				break;
			case 2: runners.add(new AbsentMindedTurtle(w, i + 1));
				break;
			case 3: runners.add(new DizzyTurtle(w, i + 1));
				break;
			}
		}
		
		for (int i = 0; i < runners.size(); i++) {
			System.out.println(runners.get(i).toString());
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
