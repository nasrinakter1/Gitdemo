package Test;

import org.junit.Test;

public class Array {
	
	
	@Test
	public static void main(String[] args) {
		
		
		
	//String []car = { "sedan", "compact", "suv"};
		
		String k[]= new String [3];
		
		 k[0]="sedan";
		 k[1]="compact";
		 k[2]="suv";
		 
		 for(int i=0; i<k.length;i++)
			 System.out.println(k[i]);
			 
		
	}
	
		
	 @Test
	  public void array() {
	
	  String []car = { "sedan", "compact", "suv"};
	 
	  String k[]= new String [3];
	 
	  k[0]="car"; 
	  k[1]="bus"; 
	  k[2]="truck";
	 
	  for(int i=k.length-1; i>=0; i--)
			  System.out.println(k[i]); 
	  
	 }

	 @Test
	public void arrays() {
		
		int b[][]=new int[2] [3];
		b[0][0]=1;
		b[0][1]=2;
		b[0][2]=3;
		b[1][0]=100;
		b[1][1]=200;
		b[1][2]=300;
		//System.out.println(b.length);
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.println(b[i][j]);
			}
		}
				
				
		//write a method that will get any set of address, phone, zip code from the user
		
		//store to return an array?
		//how to parameterized array?
		
		
	}
	 
	 
	 public void maxNumberFromAnarray() {
		 int a[]= {2,5,12,7,2,45};
		 
		 int max = a[0];
		 for(int i=1; i<a.length;i++) {
			 if(a[i]>max) {
				 max=a[i];
			 }
		 }
		 System.out.println();
	 }
	 
	 public void gitCheck() {
		 System.out.println("commend");
		 System.out.println("commend1");
		 System.out.println("Hello");
		 System.out.println("Good morning");
	 }
	}
	 
	
	


	
	
		

	


