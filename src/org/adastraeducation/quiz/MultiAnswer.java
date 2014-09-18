package org.adastraeducation.quiz;

public class MultiAnswer extends Answer{

	//private String[] choices;

	public MultiAnswer() {
	}

	public MultiAnswer(String[] choices, String [] answer) {
	//
	}
	
	public String getTagName() {
		return "MultipleChoice Answer";
	}

	public void writeHTML(StringBuilder b ){
		
		for (int i = 0; i < choices.length; i++){
			b.append("<select multiple>");
			b.append("<option> value= " + choices[i] + "\">  </option> ");
			b.append("</select>");
			b.append("</br>");
        }
	}
	public void writeJS(StringBuilder b ){
		for (int i = 0; i < choices.length; i++){
			b.append("new MultipleChoice(" +choices[i] +")");
		}
	}
	public void writeXML(StringBuilder b) {
		for (int i = 0; i < choices.length; i++)
			b.append("<A v=\"").append(choices[i]).append("</A>");
	}
	
	
}
