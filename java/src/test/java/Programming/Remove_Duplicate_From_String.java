package Programming;

     public class Remove_Duplicate_From_String { 
	 
	 public static void main(String[] args) { 
	  String str="madam"; 
	  String result=""; 
	  for(int i=0;i<str.length();i++) { 
	   String ch="" +str.charAt(i); 
	   if(result.contains(ch)) { 
	    continue; 
	    } 
	    result+= ch; 
	  } 
	  System.out.println(result); 
	  } }
