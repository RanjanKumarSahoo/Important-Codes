package Programming;
public class ReverseAStringWithoutChangingPlace {
		 public static void main(String[] args) { 
		   
		 // 1- Using String concatenation operator 
		  
		 String s="Hello World"; 
		 String rev1=""; 
		 String rev2="";
		  
		 for(int i=4;i>=0;i--) 
		 { 
		 rev1=rev1+s.charAt(i);
		 }
		 System.out.println(rev1);
		 for(int j=s.length()-1;j>=5;j--) 
		 { 
		 rev2=rev2+s.charAt(j);
		 }
		 System.out.println(rev2);
		 System.out.println(rev1+" "+rev2 );
	}
}




