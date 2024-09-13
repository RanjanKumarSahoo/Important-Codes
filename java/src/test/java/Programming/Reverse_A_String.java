package Programming;

     public class Reverse_A_String { 
	 public static void main(String[] args) { 
	   
	 String s="ABCDEF"; 
	 String rev=""; 
	  
	 for(int i=s.length()-1;i>=0;i--) 
	 { 
	  rev=rev+s.charAt(i); 
	 } 
	 System.out.println("Reverse number is " +rev); 
	  
	 }	 }
