package Programming;

        public class PrintOnlyDuplicate { 
	 
        public static void main(String[] args) { 
        String str = "Ranjan"; 
        String result = ""; 
 
        for (int i = 0; i < str.length(); i++) { 
            String ch = "" + str.charAt(i); 
            if (result.contains(ch) && !result.contains(ch + ch)) { 
                System.out.print(ch); 
            } 
            result += ch; 
         }}}
