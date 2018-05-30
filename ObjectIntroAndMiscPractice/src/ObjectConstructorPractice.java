
public class ObjectConstructorPractice {
	private int num1;
	private double num2;
	private String str;
	
	public ObjectConstructorPractice(int num1,double num2,String str){
		this.num1=num1;
		this.num2=num2;
		this.str=str;
	}
	//DONE 1: Insert a constructor that takes all three variables as 
	//		  arguments and sets the respective class variables.
	//  NOTE: When you finish this, does it cause errors from todo 0? 
	//		  WHY/WHY NOT?
	
	public ObjectConstructorPractice(){
		this(0,0,"");
		this.num1=0;
		this.num2=0;
		this.str="Placeholder";
	}
	
	//DONE 3: Insert a constructor that takes no arguments,
	//		  initialize num1 and num2 to 0 and str to "Placeholder"
	
	public ObjectConstructorPractice(int num1,double num2){
		this.num1=num1;
		this.num2=num2;
		this.str="Placeholder";
	}
	
	//DONE 5: Insert a constructor that sets ONLY the str value, 
	//		  for the other values, set them to the default from todo 1.
	
	public ObjectConstructorPractice(String str){
		this.num1=0;
		this.num2=0;
		this.str=str;
	}
	
	//DONE 7: Insert a constructor that takes values for num1 and num2
	
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
		
		ObjectConstructorPractice testCase1=new ObjectConstructorPractice(3,4.0,"aaa");
		testCase1.prettyPrintMe();
		
		//DONE 0: Can we construct an object of type ObjectConstructorPractice?
		//		  If so, do that and call the method prettyPrintMe on the object.
		
		//DONE 2: Write code that will utilize the constructor from todo 1
		
		ObjectConstructorPractice testCase2=new ObjectConstructorPractice();
		testCase2.prettyPrintMe();
		
		//DONE 4: Write code that will utilize the constructor from todo 3
		//		  Note, if there are any errors, what are they? Why? How do
		//		  we go about fixing any errors
		
		ObjectConstructorPractice testCase3=new ObjectConstructorPractice(3,4.0);
		testCase3.prettyPrintMe();
		
		//DONE 6: Write code that will utilize the constructor from todo 5
		
		ObjectConstructorPractice testCase4=new ObjectConstructorPractice("aaa");
		testCase4.prettyPrintMe();
		
		//DONE 8: Write code that will utilize the constructor from todo 7
	}
}
