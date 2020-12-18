public class DataSheet {
	
	private Player[] players;
	private Box[][] sheet;

	public DataSheet (Player[] players) {
		this.players = players;
		sheet = new Box[21][players.length];

		for (int r = 0; r < sheet.length; r++) {
			for ()
		}
	}

	public Box getBox(int row, int col) {
		return sheet[row][col];
	}

	public Box getBox(Card row, Player col) {
		return getBox(row.getRow(),);
	}
}