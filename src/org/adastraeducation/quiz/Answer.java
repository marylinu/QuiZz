package org.adastraeducation.quiz;

///Comment from another contributor
///Second time
//third Time
public class Answer {
	private String answer;
	protected String [] choices;
	private boolean correct;
	public Answer(){
		answer = null;
		correct = false;
	}
	public Answer(String ans, boolean correct){
		this.answer = ans;
		this.correct = correct;
	};
    public void setAnswer(String answer){
		answer = answer;
	}
	public String getAnswer(){
		return answer;
	}
	public void setCorrect(boolean correct){
		this.correct = correct;
	}
	public  boolean getCorrect(){
		return correct;
	}
	public String textanswer(){
		return "<input type=\"radio\" name=\"\">" + answer + "<br>";
		
	}
	public String graphanswer(){
		return "<input type=\"radio\" name=\"dynosaur2\"><img src=\"../img/" + answer + "\" alt=\"" + answer + "\" width=\"300\" height=\"150\"><br>";
	}
	public String writeXML(){
		return "<A correct=\"" + correct + "\">" + answer + "</A>";
	}
}
