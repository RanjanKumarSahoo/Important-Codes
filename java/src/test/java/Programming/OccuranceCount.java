package Programming;

import java.util.HashMap;
import java.util.Map;

     public class OccuranceCount { 
	 public static void getcount(String name) { 
	 Map<Character, Integer> count=new HashMap<Character, Integer>(); 
	  char strArray[]=name.toCharArray(); 
	  for(char c: strArray) { 
	  //if(!String.valueOf(c).isBlank()) { 
	 //(if want to remove space/ if want to print only space count remove "!") 
	   if(count.containsKey(c)) { 
	    count.put(c, count.get(c)+1); 
	   }else { 
	    count.put(c, 1); 
	   } 
	   //} 
	  } 
	  System.out.println(name+ " : " +count); 
	 } 
	public static void main(String[] args) { 
	 OccuranceCount. getcount("test"); 
	 getcount("Ranjan Kumar Sahoo"); 
	} } 
