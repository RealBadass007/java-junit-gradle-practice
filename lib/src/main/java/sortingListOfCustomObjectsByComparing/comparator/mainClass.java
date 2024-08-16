package sortingListOfCustomObjectsByComparing.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
		
		PlayerComparator compareByRanking = new PlayerComparator();
		
		Collections.sort(listOfPlayers, compareByRanking);
		
		System.out.println("After sorting listOfPlayers => " + listOfPlayers);
		
		//THIS WONT WORK. SO WE WILL USING LAMBDA EXPRESSION BELOW
//		Collections.sort(listOfPlayers, playerComparator.compareByName());
//		
//		System.out.println("After sorting listOfPlayers => " + listOfPlayers);
		
		
				
//		Comparator<Player> compareByName = (Player p1,Player  p2) -> p1.getName().compareTo(p2.getName());
		
		//WE CAN MAKE THE ABOVE LINE EVEN SIMPLER AS SHOWN BELOW
//		Comparator<Player> compareByName = (p1, p2) -> p1.getName().compareTo(p2.getName());
		
		
		
		//Instead of using the compare function, we can instead use the static comparing function
//		Comparator<Player> compareByName = Comparator.comparing((Player p1) -> p1.getName());
		
		//WE CAN MAKE THE ABOVE LINE EVEN SIMPLER AS SHOWN BELOW
		Comparator<Player> compareByName = Comparator.comparing(Player::getName);
		
		Collections.sort(listOfPlayers, compareByName);
		
		System.out.println("After sorting listOfPlayers by name => " + listOfPlayers);
		
		//
		Comparator<Player> compareByNameAndThenRanking = Comparator.comparing(Player::getName).thenComparing(Player::getRanking);
		
		Collections.sort(listOfPlayers, compareByNameAndThenRanking);
		
		System.out.println("After sorting listOfPlayers by name => " + listOfPlayers);
		
	}
	
}
