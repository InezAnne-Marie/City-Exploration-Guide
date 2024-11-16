


public class Beach extends Excursion implements Budgetable {
	// instance variables
	private Date openHours;
	private ArrayList<String> activities;
	
	// constructors
	public TouristSites(boolean t) {
		super();
		this.tourGuideAvailability = t;
	}

	// getters
	public Date getOpeningHours() {return this.openHours; }
	public Double getBudgetRange() {}

	// setters
	public void setOpeningHours(Date newOpenHours) {this.openHours = newOpenHours; }
	public void setBudgetRange(Double budgetRange) {}

	// other methods
	public boolean isWithinBudget() {}

	// toString & equals methods
	@Override
	public String toString() {}

	@Override
	public boolean equals() {}
}