


public class Park extends Excursion implements Budgetable {
	// instance variables
	private Double size;
	// we can set default entry fees to 0 since most are public
	
	// constructors
	public Park(Double s) {
		super();
		this.size = s;
	}

	// getters
	public Double getSize() {return this.size; }
	public Double getBudgetRange() {}

	// setters
	public void setSize(boolean newSize) {this.size = newSize; }
	public void setBudgetRange(Double budgetRange) {}

	// other methods
	public boolean isWithinBudget() {}

	// toString & equals methods
	@Override
	public String toString() {}

	@Override
	public boolean equals() {}
}