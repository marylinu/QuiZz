

public class StdChoice {
	private String[] answers;
	
	public void writeHTML(StringBuilder b){
		for(int i = 0; i < answers.length; i++)
			b.append("<input type=\"radio\" name=\"stdopinion\">").append(answers[i]).append("<br>");
	}
	public void WriteJS(StringBuilder b){
		b.append("");
	}
	
	public void writeXML(StringBuilder b){
		for(int i = 0; i < answers.length; i++)
			b.append("<A v=\"").append(answers[i]).append("\">").append(answers[i]).append("</A>");
	}
}
