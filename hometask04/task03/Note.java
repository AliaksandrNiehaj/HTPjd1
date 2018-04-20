package by.htp.jd1.unit4.hometask04.task03;

public class Note {
	
	private String text;
	
	public Note(String text) {
		this.text = text;
	}
	
	public void changeText(String _text) {
		this.text = _text;
	}
	
	public String getText() {
		return text;
	}
}