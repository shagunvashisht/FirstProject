package day1.examples;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[][] twodime= new int[2][2];
 //twodime[0][0]=10;
 int z=10;
 for(int i=0;i<2;i++) {
	 for(int j=0;j<2;j++){
		 twodime[i][j]=z;
		 z+=10;
		 
			
 }
 }
 for(int i=0;i<2;i++) {
	 for(int j=0;j<2;j++){
		System.out.print(twodime[i][j] + " "); 
	}
	 System.out.println(); }
	}
}
 
	

