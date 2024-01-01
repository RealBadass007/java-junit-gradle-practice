package sortingListOfCustomObjectsByComparing.comparator;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

	@Override
	public int compare(Player player1, Player player2) {
		return Integer.compare(player1.getRanking(), player2.getRanking());
	}
	
	//THIS WONT WORK. NEED TO CREATE NEW COMPARATOR FOR THE BELOW CASES. OR USE LAMBDA EXPRESSION
//	public int compareByRanking(Player player1, Player player2) {
//		return Integer.compare(player1.getRanking(), player2.getRanking());
//	}
//	
//	public int compareByName(Player player1, Player player2) {
//		return player1.getName().compareTo(player2.getName());	
//	}

}
