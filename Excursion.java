import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Excursion extends Venue{
	// instance variables
	public Double entryFee;
	public Date openHours;
	public int ageRestriction;
	public ArrayList<String> activities;

	// constructors
	public Excursion(Double e, Date o, int a, ArrayList<String> acts) {
		super();
		this.entryFee = e;
		this.openHours = o;
		this.ageRestriction = a;
		this.activities = acts;
	}

	// getters
	public Double getEntryFee() {return this.entryFee; }
	public Date getOpeningHours() {return this.openHours; }
	public int getAgeRestriction() {return this.ageRestriction; }
	public ArrayList<String> getActivities() {return this.activities; }

	// setters
	public void setOpeningHours(Date newOpenHours) {this.openHours = newOpenHours; }
	public void setAgeRestriction(int newAgeRestriction) {this.ageRestriction = newAgeRestriction; }
	public void setEntryFee(Double newEntryFee) {this.entryFee = newEntryFee; }
	public void addActivity(String newActivity) {// Add to arraylist activities}

	// others
	public boolean isWithinBudget() {}

	// toString and equals methods
}