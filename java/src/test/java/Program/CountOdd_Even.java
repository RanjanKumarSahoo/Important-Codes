package Program;

public class CountOdd_Even {
	public static void main(String[] args) {
		int n=1210978;
		int even=0;
		int odd=0;

		while(n>0) {
			int num=n%2;
			if(num == 0)
				even++;
			else
				odd++;
			n=n/10;

		}
		System.out.println(even+" "+odd);

	}
}
