import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Entertainment extends Venue {
	// instance variables
	public Date openHours;
	public ArrayList<String> activities;
	public int capacityLvl;

	// constructor
	public Entertainment(Date o, ArrayList<String> a, int c) {
		super();
		this.openHours = o;
		this.activities = a;
		this.capacityLvl = c;
	}

	// getters
	//public Double getBudgetRange() {return this.} //why??
	public Date getOpeningHours() {return this.openHours; }
	public int getCapacityLevel() {return this.capacityLvl; } 
	public ArrayList<String> getActivities() {return this.activities; }

	// setters
	public void setActivities(ArrayList<String> newActivities) {this.activities = newActivities; }
	public void setCapacityLevel(int newCapacityLvl) {this.capacityLvl = newCapacityLvl; }
	public void setOpeningHours(Date newOpenHours) {this.openHours = newOpenHours; }
	public void setBudgetRange(Double newBudgetRange) {this.budget = newBudgetRange; }

	// other methods
	public boolean isWithinBudget() {}

	// toString and equals method
	public String toString() {}

	public boolean equals(Entertainment entertainment) {}
}