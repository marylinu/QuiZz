package org.adastraeducation.quiz;
import java.util.ArrayList;

public class QuizApp {
	public ArrayList<Question> questions;
	
	public QuizApp() {
		questions = new ArrayList<Question>();
	}
	public void addQuestion(Question q) {
		questions.add(q);
	}
	public void writeHTML(StringBuilder b) {
		b.append("<form method=\"get\" action=\"somewhere\"");
		// this is the new iteration style, you can use either.
		//for(Question q : questions) {
		//	q.writeHTML(b);
		//}
		
		for(int i = 0; i < questions.size(); i++) {
			questions.writeHTML(b);
		}
		b.append("</form>\n");
	}
	public static void main(String[] args) {
		
		MultiChoiceDropdown mc = new MultiChoiceDropdown();
		ArrayList <Question> q = mc.prepareQuestions();
		CreateHtml c = new CreateHtml();
	
		
		String html = c.buildDynamicHtml(q);
	//	System.out.println(html);
		
		
		/*Exam e = new Exam();
	for(Question i: q){
			e.conductExam(i);
		}
	e.result();*/
	}	
	
	
}
