package org.adastraeducation.quiz;


public class Answer {
	private String [] answer;
	private String choices;
	private boolean correct;
	public Answer(){
		answer = null;
		correct = false;
	}
	public Answer(String [] ans, boolean correct){
		this.answer = ans;
		this.correct = correct;
	};
    public void setAnswer(String [] answer){
		this.answer = answer;
	}
	public String[] getAnswer(){
		return answer;
	}
	public void setCorrect(boolean correct){
		this.correct = correct;
	}
	public String getChoices() {
		return choices;
	}
	public void setChoices(String choices) {
		this.choices = choices;
	}
	public  boolean getCorrect(){
		return correct;
	}
	public String textanswer(){
		return "<input type=\"radio\" name=\"\">" + answer + "<br>";
		
	}
	public String imganswer(){
		return "<input type=\"radio\" name=\"dynosaur2\"><img src=\"../img/" + answer + "\" alt=\"" + answer + "\" width=\"300\" height=\"150\"><br>";
	}
	
}
