package Javaprogram;

public class AcessmodifierDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcessModifierDemo1 obj = new AcessModifierDemo1();
		
		System.out.println(obj.hours);
		System.out.println(	obj.mins);
		
		// Scenario 2: Public Modifier
		// observe the symbol infront of varibale is green circle when you do obj.variable name
		// Now go to Access3 class and you will be able to call the variables over there.
		
		System.out.println(obj.name);
		System.out.println(obj.tool);
		
		// Scenario 3: Private Modifier
			// We cannot call the variables whichare private in class1
			// Now go to Access3 class and you will not be able to call the variables over there.
			// variables will not be visible in the drop down
		
		// Scenario 4: protected modifier
		
		// observe the symbol infront of varibale is yellow circle when you do obj.variable name
		// you will be able to access the variables
			// Now go to Access3 class and you will be able to call the variables over there using exetends keyword
		
		System.out.println(obj.x);
		System.out.println(obj.z);

	}

}
