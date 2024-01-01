package sortingListOfCustomObjectsByComparing.comparator;

public class Player {

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
	
	@Override
	public String toString() {
		return this.name;
	}
	
	
}
