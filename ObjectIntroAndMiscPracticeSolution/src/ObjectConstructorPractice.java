
public class ObjectConstructorPractice {
	private int num1;
	private double num2;
	private String str;
	
	//DONE: Insert a constructor that takes all three variables as 
	//		  arguments and sets the respective class variables.
	//  NOTE: When you finish this, does it cause errors from todo 0? 
	//		  WHY/WHY NOT?
	public ObjectConstructorPractice(int num1, double num2, String str) {
		this.str = str;
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//DONE: Insert a constructor that takes no arguments,
	//		  initialize num1 and num2 to 0 and str to "Placeholder"
	public ObjectConstructorPractice() {
		this.num1 = 0;
		this.num2 = 0.0;
		this.str = "Placeholder";
	}
	
	//DONE: Insert a constructor that sets ONLY the str value, 
	//		  for the other values, set them to the default from todo 1.
	public ObjectConstructorPractice(String str) {
		this.str = str;
		this.num1 = 0;
		this.num2 = 0.0;
	}
	
	//DONE: Insert a constructor that takes values for num1 and num2
	public ObjectConstructorPractice(int num1, double num2) {
		this.str = "Placeholder";
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNum1(){
		return num1;
	}
	
	public double getNum2() {
		return num2;
	}
	
	public String getStr() {
		return str;
	}
	
	public void prettyPrintMe() {
		System.out.println("\n###########################################");
		System.out.println("num1 is: " + num1 + "\nnum2 is: " + num2 + "\nstr is: " + str);
		System.out.println("###########################################\n");
	}
	
	public static void main(String[] args) {
		System.out.println("We are working with object constructors!!!\n");
		
		//DONE: Can we construct an object of type ObjectConstructorPratice?
		//		  If so, do that and call the method prettyPrintMe on the object.
		ObjectConstructorPractice var1 = new ObjectConstructorPractice();
		var1.prettyPrintMe();
		
		
		//DONE: Write code that will utilize the constructor from todo 1
		ObjectConstructorPractice var2 = new ObjectConstructorPractice(3, 4.6, "Very cool!");
		var2.prettyPrintMe();
		
		//DONE: Write code that will utilize the constructor from todo 3
		ObjectConstructorPractice var3 = new ObjectConstructorPractice();
		var3.prettyPrintMe();
		
		//DONE: Write code that will utilize the constructor from todo 5
		ObjectConstructorPractice var4 = new ObjectConstructorPractice("AWESOME STRING YO!!!");
		var4.prettyPrintMe();
		
		//DONE: Write code that will utilize the constructor from todo 7
		ObjectConstructorPractice var5 = new ObjectConstructorPractice(2, 3.5);
		var5.prettyPrintMe();
	}
}
