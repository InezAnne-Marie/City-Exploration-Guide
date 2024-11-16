

public class Nightclub extends Entertainment {
	// instance variables
	private String musicGenre;
	private String dressCode;

	// constructor
	public Bar (String m, String a) {
		super();
		this.musicGenre = m;
		this.dressCode = a;
	}

	// getters
	public String getDressCode() {return this.dressCode; }
	public String getMusicGenre() {return this.musicGenre; }

	// setters
	public void setDressCode(String newDressCode) {this.dressCode = newDressCode; }
	public void setMusicGenre(String newGenre) {this.musicGenre = newGenre; }

	// other methods
	public boolean isWithinBudget() {}

	// toString & equals methods
	@Override
	public String toString() {}

	@Override
	public boolean equals() {}
}