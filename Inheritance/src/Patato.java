
public class Patato extends Vegetable{
public static void main(String[] args) {
	Patato p=new Patato();
	p.color="Brown";
	p.price=20;
	System.out.println(p.color+" "+p.price);
	p.washvegetable();
	p.cutvegetable();
}
}
