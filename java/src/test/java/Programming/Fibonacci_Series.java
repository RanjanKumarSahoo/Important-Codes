package Programming;

public class Fibonacci_Series { 
	 
	 public static void main(String[] args) { 
	 int n=8; 
	 int f=1; 
	 int s=1; 
	 System.out.print(f+" " ); 
	 System.out.print(s+ " "); 
	 for(int i=3;i<=n;i++) 
	 { 
	  int t=f+s; 
	  System.out.print(t+" "); 
	   f=s; 
	   s=t; 
	   
	 } 
	 } 
	 
	}
