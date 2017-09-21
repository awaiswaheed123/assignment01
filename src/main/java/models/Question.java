package models;

public class Question {
	String statment;
	String[] choices;
	float answer;
	public String getStatment() {
		return statment;
	}
	public void setStatment(String statment) {
		this.statment = statment;
	}
	public String[] getChoices() {
		return choices;
	}
	public void setChoices(String[] choices) {
		this.choices = choices;
	}
	public float getAnswer() {
		return answer;
	}
	public void setAnswer(float answer) {
		this.answer = answer;
	}
	
	public Question(String text, String[] choices, float answer) {
		this.setStatment(text);
		this.setChoices(choices);
		this.setAnswer(answer);
	}

}
