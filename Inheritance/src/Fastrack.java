
public class Fastrack extends Watch {

	public static void main(String[] args) {
		Fastrack f=new Fastrack();
		f.name="Fastrack";
		f.color="Black";
		f.price=20000;
		System.out.println(f.name);
		System.out.println(f.color);
		System.out.println(f.price);
		f.notification();
		f.weather();
	}

}
