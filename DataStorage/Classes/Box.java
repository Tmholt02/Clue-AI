import java.util.List;
import java.util.ArrayList;

enum BoxState {
	UNKNOWN,
	AFFIRMATIVE,
	NEGATIVE
}

public class Box {

	private static int nextTag = 0;

	private BoxState state;
	private List<Integer> tags;

	public Box() {
		state = BoxState.UNKNOWN;
		tags = new ArrayList<Integer>();
	}

	public boolean checkTag (int tag) {
		return tags.contains(tag);
	}

	public void setState (BoxState state) {
		this.state = state;
	}

	public BoxState getState() {
		return state;
	}

	private static void addTag(Box b1, Box b2, Box b3) {

	}

}