

public class Venue{
	// instance variables
	private String name;
	private String location;
	private String link;
	private Double budget;

	// constructor
	public Venue(String n, String lo, String li, Double b) {
		this.name = n;
		this.location = lo;
		this.link = li;
		this.budget = b;
	}

	// getters
	public String getName() {return this.name; }
	public String getLocation(){return this.location; }
	public String getLink() {return this.link; }
	public Double getBudget() {return this.budget; }
	public String getDetails() {} // is this the same as the toString?

	// toString & equals methods
	public String toString(){}

	public boolean equals(Venue venue){}

}