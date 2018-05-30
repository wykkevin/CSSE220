package simpleExample;

import stringTransforms.TransformInterface;

public class RemoveLettersFromText implements TransformInterface {
	
	private String output="";
	private String remove="";

	public RemoveLettersFromText(String text,String letterToRemove){
		this.remove=letterToRemove;
	}

	@Override
	public String transform(String text) {
		for(int i=0;i<text.length();i++){
			if (!(text.substring(i,i+1).equals(this.remove))){
				this.output+=text.substring(i,i+1);
			}
		}
		return this.output;
	}

}
