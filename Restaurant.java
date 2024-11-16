

public class Restaurant{
	// instance variables
	private String description;
	private ArrayList<Dining> restaurants;

	// constructor
	public Restaurant(String d, ArrayList<Dining> r){
		this.description = d;
		this.restaurants = r;
	}

	// getters
	public String getDescription() { return this.description; }
	public ArrayList<Dining> getRestaurants() { return this.restaurants; }

	// other methods
	public Double getBudgetRange() {}
	public void addRestaurant(Restaurant newRestaurant) {}
	public void removeRestaurant(Restaurant thisRestaurant) {}
	public Boolean isWithinBudget() {}
	public void setBudgetRange(Double budgetRange) {}

	@Override
	public boolean equals(Restaurant restaurant) {}

	public String toString() {}
}