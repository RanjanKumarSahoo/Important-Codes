package Programming;


    public class SecondHighestNumberArray {

	public static void main(String[] args) {
		int[] arr= {6,7,4,20,20,2,9};
		int l=0;
		int s=0;
		if(arr[0]>arr[1]) {
			l=arr[0];
			s=arr[1];
		}else {
			l=arr[1];
			s=arr[0];
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>l) {
				s=l;
				l=arr[i];
			}else if(arr[i]>s) {
				s=arr[i];
			}}
		System.out.println(s);
    	}}
