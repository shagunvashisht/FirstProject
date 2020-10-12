package ClassObject;

 class setGetThis1 {
	int age;//instance variable
	String name;
	
public void set(int age, String name) {// local variable/arguments/parameters
	/* age = age;
	 name= name;*/
	 this.age = age;// refers to instance variable
	 this.name= name;
 }
 public int getAge() {
	 return age;
 }

 public String getName(){
	 return name;
 }
 }
 class setGetThis{
	 public static void main(String[] args){
		// TODO Auto-generated method stub
		setGetThis1 obj = new setGetThis1();
		setGetThis1 obj1 = new setGetThis1();
		obj.set(14, "shagunV");
		obj1.set(54, "DevD");
		System.out.println(obj.getAge() + " " + obj.getName());
		System.out.println(obj1.getAge() + " " + obj1.getName());

		
	}}


