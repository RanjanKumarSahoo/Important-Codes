package Basic;

public class ObjectCreation {
	public void playmusic() {
		System.out.println("rap");
	}
	public String buypen(int a) {
		if(a>=10)
		return "pen";
		else
			return "no pen";
	}

	public static void main(String[] args) {
ObjectCreation obj= new ObjectCreation();
obj.playmusic();
String b=obj.buypen(5);
System.out.println(b);
	}

}
