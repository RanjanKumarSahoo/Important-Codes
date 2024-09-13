package Program;

        public class CountNumbers {
	    public static void main(String[] args) {
		int n=1210978;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
    	}}
