package models;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
	public String Title;
	public String details;
	public List <Question> questions;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Quiz(String title, String details) {
		this.setTitle(title);
		this.setDetails(details);
		this.questions = new ArrayList <Question>();;
	}
	public void addtoQuiz(Question question) {
		this.questions.add(question);
	}
}
