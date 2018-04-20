package by.htp.jd1.unit4.hometask04.task03;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class NoteBook {
	
	private int numberNote;
	private ArrayList<Note> notebook = new ArrayList<Note>();
	private static NoteBook instance = null;
	
	private NoteBook() {
	}
	
	public static NoteBook getNoteBook() {
		if (instance == null) {
			instance = new NoteBook();
		}
		return instance;
	}
	
	public void showNoteBook() {
		if (notebook.size() == 0) {
			System.out.println("Записная книга пуста.");
			return;
		}
		else {
			int num = 1;
			for (Note note : notebook) {
				System.out.printf("Запись %s: %s\n", num, note.getText());
				num++;
			}
		}
	}
	
	public void addNote() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Введите запись %s: ", numberNote+1);
		this.notebook.add(new Note(sc.nextLine()));
		numberNote++;
	}
	
	public void searchNote() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите номер записи: ");
		int numb = sc.nextInt()-1;
		System.out.printf("Запись %s: %s\n", numb+1, notebook.get(numb).getText());
	}	
}