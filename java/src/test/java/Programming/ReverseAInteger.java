package Programming;

public class ReverseAInteger {
	public static void main(String[] args) {
		int n=12345;
		int rev=0;
		int last;
		
		while(n>0) {
			last=n%10;
			rev=rev*10+last;
			n=n/10;
		}
		System.out.println(rev);
	}
	}


