package sortingListOfCustomObjectsByComparing.comparable;

public class Player implements Comparable<Player> {

	private int ranking;
	private String name;
	private int jerseyNumber;
	private double salary;
	
	public Player () {
		
	}

	public Player(int ranking, String name, int jerseyNumber, double salary) {
		super();
		this.ranking = ranking;
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.salary = salary;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//IMPLEMENT THE DEFAULT COMPARISON BY SELECTING ONE ATTRIBUTE OF Player CLASS. In this case we're choosing the ranking
	@Override
	public int compareTo(Player player) {
		return Integer.compare(this.getRanking(), player.getRanking());
	}
	
	//If we need the default comparison to be based on name, below code need to be implemented
//	@Override
//	public int compareTo(Player player) {
//		return this.getName().compareTo(player.getName());
//	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	
}
