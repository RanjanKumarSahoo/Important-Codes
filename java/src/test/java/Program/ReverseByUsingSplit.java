package Program;

public class ReverseByUsingSplit {
	  public static void main(String[] args) {
	        String str = "Hello World";
	        String[] word=str.split("\\s+");
	        String word1=word[0];
	        String word2=word[1];
	        String rev1="";
	        String rev2="";
	        
	        for(int i=word1.length()-1; i>=0; i--) {
	        	rev1=rev1+word1.charAt(i);
	        }
	        
	        for(int j=word2.length()-1; j>=0; j--) {
	        	rev2=rev2+word2.charAt(j);
	        }
	        
	        System.out.println(rev1+" "+rev2);
	        
	    }
}
