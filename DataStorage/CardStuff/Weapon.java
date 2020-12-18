public enum Weapon implements Card {

	// Weapons
	KNIFE         (6),
	CANDLESTICK   (7),
	REVOLVER      (8),
	ROPE          (9),
	LEAD_PIPE     (10),
	WRENCH        (11);

	private int row;

	private Weapon (int row) {
		this.row = row;
	}

	public int row() {
		return row;
	}

	public CardType getCardType() {
		return CardType.WEAPON;
	}
	
}