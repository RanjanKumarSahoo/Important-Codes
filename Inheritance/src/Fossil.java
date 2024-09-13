
public class Fossil extends Watch {
public static void main(String[] args) {
	Fossil f=new Fossil();
	f.name="Fossil";
	f.color="Brown";
	f.price=25000;
	System.out.println(f.name);
	System.out.println(f.color);
	System.out.println(f.price);
	f.notification();
	f.weather();
}
}
