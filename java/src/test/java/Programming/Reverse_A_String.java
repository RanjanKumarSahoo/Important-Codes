package Programming;

public class Reverse_A_String { 
	 public static void main(String[] args) { 
	   
	 // 1- Using String concatenation operator 
	  
	 String s="ABCDEF"; 
	 String rev=""; 
	 int length=s.length(); 
	  
	 for(int i=length-1;i>=0;i--) 
	 { 
	  rev=rev+s.charAt(i); 
	 } 
	 System.out.println("Reverse number is " +rev); 
	  
	 // 2-  Using character array 
	  
	 char a[]=s.toCharArray(); 
	 int len=s.length(); 
	  
	 for(int j=len-1;j>=0;j--) 
	 { 
	  rev=rev+a[j]; 
	 } 
	 System.out.println(rev); 
	  
	  
	  
	  
	 } 
	 }
