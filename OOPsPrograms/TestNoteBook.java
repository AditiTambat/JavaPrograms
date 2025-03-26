
public class TestNoteBook {
	public static void main(String[] args) {
		NoteBook b1 = new NoteBook();
		NoteBook b2 = new NoteBook(100, 50.50f, "Natraj", "A4");
		System.out.println(b1);
		System.out.println(b2);
		// when we print object -> className@hashcode
		// but if we define toString method then that method will get called automatically
	}
}
