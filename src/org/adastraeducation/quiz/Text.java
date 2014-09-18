package org.adastraeducation.quiz;
public class Text implements Displayables {
	
	private String ques;
	private String ans;
	
	public String getTagName() { return "Text"; }
	
	@Override
	public void WriteHTML(StringBuilder b) {
		// TODO Auto-generated method stub
		b.append("ques");
		b.append("<select>");
		b.append("<input type=\"radio\""+ ans + "name=\"dynosaur1\">" + "<br>");	
		b.append("</select>");
		
	}
	@Override
	public void WriteJS(StringBuilder b) {
		// TODO Auto-generated method stub
		b.append("new Text(1, \"" + ans + "\")" );

	}
	@Override
	public void WriteXML(StringBuilder b) {
		// TODO Auto-generated method stub
		b.append("<A correct= "+ ans +"</A>");

		
	}
}
