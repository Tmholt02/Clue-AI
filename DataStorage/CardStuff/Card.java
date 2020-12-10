public interface Card {
	public abstract int getRow();
	public abstract CardType getCardType();
}

enum CardType {
	SUSPECT,
	WEAPON,
	ROOM
}