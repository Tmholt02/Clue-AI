public class Player {
	
	private String name;
	private Suspect pawn;
	private int column;

	public Player(String name, Suspect pawn, int column) {
		this.name = name;
		this.pawn = pawn;
		this.column = column;
	}

	public Suspect getPawn() {
		return pawn;
	}

	public int col() {
		return column;
	}
}