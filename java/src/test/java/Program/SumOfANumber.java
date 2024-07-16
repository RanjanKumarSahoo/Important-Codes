package Program;

public class SumOfANumber {
	public static void main(String[] args) {
		int n=1215;
		int num=0;
		int sum=0;
		while(n>0) {
			num=n%10;
			sum=sum+num;
			n=n/10;

		}
		System.out.println(sum);

	}
}
