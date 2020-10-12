package Exercise;

public class person {
	int id;  
	String name;  
	person(int id,String name){  
	this.id=id;  
	this.name=name;  
	}  
	}  
	class Emp extends person  {
	float salary;  
	Emp(int id,String name,float salary){  
	super(id,name);//reusing parent constructor  
	this.salary=salary;  
	System.out.println(id+" "+name+" "+salary);
	
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp(1,"ankit",45000f);
		}
	
}
