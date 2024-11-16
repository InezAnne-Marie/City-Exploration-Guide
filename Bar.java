

public class Bar extends Entertainment {
	// instance variables
	private String musicGenre;
	private String ambiance;

	// constructor
	public Bar (String m, String a) {
		super();
		this.musicGenre = m;
		this.ambiance = a;
	}

	// getters
	public String getAmbiance() {return this.ambiance; }
	public String getMusicGenre() {return this.musicGenre; }

	// setters
	public void changeAmbiance(String newAmbiance) {this.ambiance = newAmbiance; }
	public void setMusicGenre(String newGenre) {this.musicGenre = newGenre; }

	// other methods
	public boolean isWithinBudget() {}

	// toString & equals methods
	@Override
	public String toString() {}

	@Override
	public boolean equals() {}
}