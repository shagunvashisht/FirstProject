package day1.examples;

public class TwoDimensonalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //int i[][]= new int[2][3];
		/*int i[][]= {{10},{40},{60}};
		for(int k=0;k<3;k++)
		{
			for(int j=0;j<1;j++) {
				System.out.print(i[k][j] + " " + " ");
			}
			System.out.println();
			}
	*/
		int i[][]= {{10,20},{40,50},{60,70}};
		for(int k=0;k<3;k++)
		{
			for(int j=0;j<2;j++) {
				System.out.print(i[k][j] + " " + " ");
				
			}
			System.out.println();
			}
		/*i[0][2]=10;
 i[1][2]=50;
for(int k=0;k<2;k++)
{
	for(int j=0;j<3;j++) {
		System.out.print(i[k][j] + " " + " ");
	}
	System.out.println();
}*/
 
	}

}
