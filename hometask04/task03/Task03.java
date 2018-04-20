package by.htp.jd1.unit4.hometask04.task03;

public class Task03 {

	public static void main(String[] args) {
		
		NoteBook noteBook = NoteBook.getNoteBook();
		noteBook.showNoteBook();
		noteBook.addNote();
		noteBook.addNote();
		noteBook.addNote();
		noteBook.showNoteBook();
		noteBook.searchNote();
	}
}
