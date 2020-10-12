package day1.examples;

public class ArrayCallInFunction {
	/*
 static void set(int a[]) {
	int k;
	k=a[0] ;
	for(int i=1;i<a.length;i++) 
		if(k<a[i])
		k=a[i];
    System.out.println(k);
    
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int e[]= {2,4,0,1};
 set(e);
	}*/

		static void min(int arr[]){
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		 if(min>arr[i])
		  min=arr[i];

		System.out.println(min);
		}

		public static void main(String args[]){

	
		min( new int[] {88,66,55,44});//passing array to method //anonymous array

		}}

