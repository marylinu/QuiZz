import java.util.ArrayList;

// To Do: Standard Choice

public class MultiChoiceDropdown extends Answer {
	
	private String[] choices;

	public MultiChoiceDropdown() {
	}

	public MultiChoiceDropdown(String[] choices, String answer) {
		this.choices = choices;
	}
	

	public String getTagName() { return "MultipleChoice Drop-down";}

	public void writeHTML(StringBuilder b ){	
			b.append("<select>");
			b.append("<option value = " + choices + "\">  </option> ");
			b.append("</select>");
			b.append("</br>");
	}
	
	public void writeJS(StringBuilder b ){	
			b.append("new MultipleChoice(" +choices +")");
	}
	
	public void writeXML(StringBuilder b) {
			b.append("<A v=\"").append(choices).append("</A>");
	}
	
	public boolean isCorrect(String[] ans) {
		// TODO Auto-generated method stub
		return false;
	}
	public double gradeIt(String[] answers) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
