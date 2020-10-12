package Exercise;

public class ExerciseA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double sal=10050;
 double tax=0.0;
// System.out.println("Enter the salary" );
 //System.out.println(sal);
 //System.out.println();
 if(sal<=15000) {
	 tax=.1*sal ;
	 System.out.println(tax);}
	 else if (sal<=40000 && sal>=15000) {
		 tax=.2*sal;
		 System.out.println(tax);}
	 else {
		 tax=.3*sal;
		 System.out.println(tax);
}
	}

}
