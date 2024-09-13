
public class Mobile 
{
String name;
String brand;
int price;
Mobile(String n,String b,int p)
{
	this.name=n;
	this.brand=b;
	this.price=p;
}

	public static void main(String[] args) {
Mobile m1=new Mobile("9pro","1plus",90189);
Mobile m2=new Mobile("7pro","mi",17000);
Mobile m3=new Mobile("j7","samsung",18966);
System.out.println(m1.name+" "+m1.brand+" "+m1.price);
System.out.println(m2.name+" "+m2.brand+" "+m2.price);
System.out.println(m3.name+" "+m3.brand+" "+m3.price);

	}

}
