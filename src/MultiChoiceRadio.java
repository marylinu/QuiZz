
public class MultiChoiceRadio extends MultiChoiceDropdown {

	public MultiChoiceRadio() {
	}

	public MultiChoiceRadio(String[] choices, String answer) {
	//
	}
	
	public String getTagName() {
		return "MultipleChoice Radio-Button";
	}

	public void writeHTML(StringBuilder b ){
		
		b.append("<select>");
		b.append("<option> <input type=\"radio\" value= " + choices + "\">  </option> ");
		b.append("</select>");
		b.append("</br>");
   
	}
	public void writeJS(StringBuilder b ){
		b.append("new MultipleChoice(" +choices +")");
	}
	public void writeXML(StringBuilder b) {
		b.append("<A v=\"").append(choices).append("</A>");
	}
	
	
}
