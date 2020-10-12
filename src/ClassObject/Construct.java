package ClassObject;
 class test{
	 int age;
	 String name;
	 public test() {
	 this("bran");
		 System.out.println("First Constructor running");
	 }
	 public test(String name) {
		// this(name, 0);
		// this.name= name;
		 System.out.println("Second Constructor running");
	 }
	 public test(String name, int age) {
		 
		 this.name= name;
		 this.age= age;
		 System.out.println(name);
		 System.out.println(age);
		 System.out.println("Third Constructor running");
		 System.out.println(name);
		 System.out.println(age);
	 }
 }
public class Construct {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 test obj=new test();
	}

}
