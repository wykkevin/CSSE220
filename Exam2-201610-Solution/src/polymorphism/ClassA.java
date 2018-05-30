package polymorphism;

//DO NOT MODIFY THIS CODE

public class ClassA implements InterfaceForClasses{

	public boolean worksCorrectly(String value) {
		if (value.endsWith("Holidays")){
			return true;
		}
		return false;
	}

	public int doSameMath(int first, int second) {
		int result;
		if(first > second){
			result = first - second;
		} else{
			result = first + second;
		}
		return result;
	}
	
	public int mul(InterfaceForClasses val1, InterfaceForClasses val2){
		return val1.doSameMath(5, 4) * val2.doSameMath(4, 5);
	}

}
