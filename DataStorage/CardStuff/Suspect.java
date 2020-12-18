public enum Suspect implements Card {

	// Suspects
	MUSTARD       (0),
	PLUM          (1),
	GREEN         (2),
	PEACOCK       (3),
	SCARLET       (4),
	WHITE         (5);

	private int row;

	private Suspect (int row) {
		this.row = row;
	}

	public int row() {
		return row;
	}
	
	public CardType getCardType() {
		return CardType.SUSPECT;
	}

}