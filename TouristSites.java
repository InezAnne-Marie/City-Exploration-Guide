


public class TouristSites extends Excursion implements Budgetable {
	// instance variables
	private boolean tourGuideAvailability;
	
	// constructors
	public TouristSites(boolean t) {
		super();
		this.tourGuideAvailability = t;
	}

	// getters
	public boolean getTourGuideAvailability() {return this.tourGuideAvailability; }
	public Double getBudgetRange() {}

	// setters
	public void setTourGuideAvailability(boolean newAvailability) {this.tourGuideAvailability = newAvailability; }
	public void setBudgetRange(Double budgetRange) {}

	// other methods
	public boolean isWithinBudget() {}

	// toString & equals methods
	@Override
	public String toString() {}

	@Override
	public boolean equals() {}
}