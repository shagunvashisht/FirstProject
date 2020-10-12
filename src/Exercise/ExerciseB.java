package Exercise;

public class ExerciseB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a[]= {"10","20","30"};
int total=0;
for(String k :a) {
	total= total + Integer.parseInt(k);
}
System.out.println("Total" +total);

//int b[]= Integer.parseInt(a[0])+Integer.parseInt(a[1])+Integer.parseInt(a[2]);


	}

}
