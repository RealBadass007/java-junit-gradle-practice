package sortingListOfCustomObjectsByComparing.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class mainClass {

	public static void main(String[] args) {
		
		List<Player> listOfPlayers = new ArrayList<>();
		
		listOfPlayers.add(new Player(5, "Janhvi", 2, 150.4));
		listOfPlayers.add(new Player(1, "Chirag", 7, 100));
		listOfPlayers.add(new Player(2, "Pritish", 4, 70));
		listOfPlayers.add(new Player(4, "Kedar", 9, 600.60));
		listOfPlayers.add(new Player(3, "Vedant", 10, 200));
		
		System.out.println("listOfPlayers => " + listOfPlayers);
		
		Collections.sort(listOfPlayers);
		
		System.out.println("After sorting listOfPlayers => " + listOfPlayers);
		
	}
	
}
