public enum Room implements Card {

	// Rooms
	HALL          (12),
	LOUNGE        (13),
	DINNING_ROOM  (14),
	KITCHEN       (15),
	BALLROOM      (16),
	CONSERVATORY  (17),
	BILLIARD_ROOM (18),
	LIBRARY       (19),
	STUDY         (20);

	private int row;

	private Room (int row) {
		this.row = row;
	}

	public int row() {
		return row;
	}

	public CardType getCardType() {
		return CardType.ROOM;
	}

}