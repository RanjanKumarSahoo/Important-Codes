
public class Pen
{
String brand;
String color;
int price;

    Pen(String b,String c,int p)
 {
	 this.brand=b;
	 this.color=c;
	 this.price=p;
 }
		 void details()
		 {
			
	 System.out.println("Brand : "+this.brand);
	 System.out.println("Color : "+this.color);
	 System.out.println("Price : "+this.price); 
	 System.out.println();
 }
	public static void main(String[] args) 
	{
		Pen p1=new Pen("olx","black",10);
		Pen p2=new Pen("ink","blue",15);
		Pen p3=new Pen("box","red",5);
		p1.details();
		p2.details();
		p3.details();
	}

}
