package polymorphism;

//DO NOT MODIFY THIS CODE

public class ClassB implements InterfaceForClasses{

	public boolean worksCorrectly(String value) {
		return value.length() > 5;
	}

	public int doSameMath(int first, int second) {
		return Math.max(first, second);
	}
	
	public int min(int num1, int num2){
		return Math.min(num1, num2);
	}
	
	public boolean didYouFinish(InterfaceForClasses paper){
		if(paper.worksCorrectly("Funny")){
			return true;
		}
		return false;	
	}
}
