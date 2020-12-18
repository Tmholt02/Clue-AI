public interface Card {
	public abstract int row();
	public abstract CardType getCardType();
}

enum CardType {
	SUSPECT,
	WEAPON,
	ROOM
}