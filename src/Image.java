 

public class Image implements Displayables {
	private String imgQuestion;
	private String width;
	private String height;
	private String [] ans;
	
	public Image(){
		ans = null;		
	}
	public void WriteHTML(StringBuilder b){
		b.append("<img src=" + imgQuestion + "style = width:"+ width + "px;height:"+ height + "px>");
		b.append("<select>");
		b.append("<input type=\"radio\"" + ans + "<br>");
		b.append("</select>");
	}
	// to do : how to represent image in JavaScript
	public void WriteJS(StringBuilder b){
		b.append("new Image(1, \"" + ans + "\")");
	}
	
	public void WriteXML(StringBuilder b) {
		b.append("<A correct=\"" + ans + "\"> </A>");
	}

}
