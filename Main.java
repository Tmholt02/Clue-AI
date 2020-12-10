class Main {
  public static void main(String[] args) {
    new DataSheet( new Player[] {
			new Player("Thomas", Suspect.SCARLET, 0),
			new Player("Alexis", Suspect.MUSTARD, 1),
			new Player("Ryan", Suspect.GREEN, 2),
			new Player("George", Suspect.PLUM, 3)
		});
  }
}