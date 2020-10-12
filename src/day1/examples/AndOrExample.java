package day1.examples;

public class AndOrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=10;
 int b =20;
  // && if first condition a>0 is not true then it won't go to second condition that is b>0
 // & (bitwise operation) if first condition a>0 is not true then it will go to second condition that is b>0
 if (a>0 && b>0) {
	 System.out.println(" both +ve numbers");
 }
 else if (a>0 || b >0){
	 System.out.println("atleast one is +ve");
 }
 else {
	 System.out.println("Both -ve numbers");
 }
	}

}
